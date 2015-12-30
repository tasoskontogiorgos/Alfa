/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfa.core.exps;

import alfa.core.EvaluationContext;
import alfa.core.Exp;
import alfa.core.FormalArgSpec;
import alfa.core.SymbolTable;
import alfa.core.Types;
import alfa.core.runtime.AlfaEnvironment;
import alfa.core.runtime.AlfaFunction;
import alfa.util.Util;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author tdk
 */
public class FuncCall extends BaseExp
{
    private final List< Exp >   m_actuals;
    private final String        m_name;   
    private AlfaFunction        m_func;
    
    private int m_actIndex;
    
    public FuncCall( Token token, String name )
    {
        super( token );
        m_actuals = new ArrayList();
        m_name = name;
    }
    
    public void add( Exp val )
    {
        m_actuals.add( val );
    }
    
    void matchActual( int formIndex, FormalArgSpec spec )
    {
        if( formIndex >= m_actuals.size() )
        {
            if( spec.isOptional() || spec.zeroOrMore())
            {
                m_actIndex = m_actuals.size();
                return;
            }
            throw new RuntimeException( "Illegal number of args " + Util.At( getToken()));
        }
        Exp actual = m_actuals.get( formIndex );
        if( !spec.matches( actual ))
        {
            throw new RuntimeException( "Illegal " + m_actIndex + " arg " + Util.At( getToken()) );
        }
        if( spec.oneOrMore() || spec.zeroOrMore() )
        {
            for( int i = formIndex+1 ; i < m_actuals.size(); i++ )
            {
                actual = m_actuals.get( i );
                if( ! spec.matches( actual ) )
                {
                    throw new RuntimeException( "Illegal " + i + " arg " + Util.At( getToken()) );
                }
            }
        }
        m_actIndex = m_actuals.size();
    }
    
    @Override
    public void resolve( SymbolTable st )
    {
        AlfaEnvironment e = st.getEnvir();
        m_func = e.getFuncdefinition( m_name, getToken() );
        for( Exp exp : m_actuals )
        {
            exp.resolve( st );
        }
        
        for( int formIndex = 0; formIndex < m_func.getFormals().size(); formIndex++ )
        {
            FormalArgSpec spec = m_func.getFormals().get( formIndex );
            matchActual( formIndex, spec );
        }
         
        if( m_actIndex != m_actuals.size())
        {
            throw new RuntimeException( "Illegal number of actual arguments "   + Util.At( getToken()) );
        }
        m_type = Types.ANY; // TODO: ... this may change
    }
    
    @Override
    public String toString()
    {
        String s = "" + m_name  + "(";
        for( Exp p : m_actuals )
        {
            s += " " + p;
        }
        s += ")";
        return s ;
    }

    @Override
    public Object eval( EvaluationContext ctx )
    {
        int sz = m_actuals.size();
        Object[] actuals = new Object[ sz ];
        
        for( int i = 0; i < sz; i++ )
        {
            Exp exp = m_actuals.get( i );
            if( m_name.equals( "%printVars"))
            {
                Var var = ( Var ) exp;
                String varName = var.getName();
                actuals[ i ] = varName;
            } else
            {
                actuals[ i ] = ( exp.eval( ctx));
            }
        }
        try
        {
            return m_func.eval( actuals );
        } catch( Exception x )
        {
            throw new RuntimeException( x.getMessage() + Util.At( getToken()));
        }
    }
}
