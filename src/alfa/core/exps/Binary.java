/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfa.core.exps;

import alfa.core.EvaluationContext;
import alfa.core.Exp;
import alfa.core.SymbolTable;
import alfa.core.Types;
import alfa.core.runtime.AlfaFunction;
import alfa.util.Util;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author tdk
 */
public class Binary extends BaseExp
{

    public static final String EQ = "==";
    public static final String NE = "!=";
    public static final String IN = "::";
    public static final String GT = ">";
    public static final String GE = ">=";
    public static final String LT = "<";
    public static final String LE = "<=";
    
    
    static enum BinOp
    {
        eq,
        ne,
        in,
        gt,
        ge,
        lt,
        le
    }

    private final Exp m_left;
    private final Exp m_right;
    private final BinOp  m_binOp;
    private AlfaFunction m_SystemIN;

    public Binary( Token token, Exp left, Exp right, String oper )
    {
        super( token );
        m_left = left;
        m_right = right;
        switch( oper )
        {
            case EQ: { m_binOp = BinOp.eq; break; }
            case NE: { m_binOp = BinOp.ne; break; }
            case IN: { m_binOp = BinOp.in; break; }
            case GT: { m_binOp = BinOp.gt; break; }
            case GE: { m_binOp = BinOp.ge; break; }
            case LT: { m_binOp = BinOp.lt; break; }
            case LE: { m_binOp = BinOp.le; break; }
            default:
            {
                throw new RuntimeException( "Internal Error "  + Util.At( token ));
            }
        }
    }

    @Override
    public void resolve( SymbolTable st )
    {
        if( m_binOp.equals( BinOp.in))
        {
            m_SystemIN = st.getEnvir().getFuncdefinition( "SystemIN", getToken() );
        }
        m_left.resolve( st );
        m_right.resolve( st );
        
        // TODO: no chacking yet of the expression types - not sure how to hanle it here 
        //      I assume that they are VAR on NUM - if not evaluation will fail ...
        
        // TODO: For now all binary are boolean - that may change
        m_type = Types.BOOL;
    }
    
    @Override
    public Object eval( EvaluationContext ctx )
    {
        // TODO: handle IN operator
        if( m_binOp.equals( BinOp.in ))
        {
            Object[] acts = new Object[]{ m_left, m_right };
            try
            {
                return m_SystemIN.eval( ctx, acts );
            } catch( Exception x )
            {
                throw new RuntimeException( "Failed to evaluate IN : " + x.getMessage()  + Util.At( getToken() ));
            }
        }
        double l = ( Double )m_left.eval( ctx );
        double r = ( Double )m_right.eval( ctx );
        
        
        switch( m_binOp )
        {
            case eq: return l == r;
            case ne: return l != r;
            case gt: return l > r;
            case ge: return l >= r;
            case lt: return l < r;
            case le: return l <= r;
        }
        throw new RuntimeException( "Internal Error "  + Util.At( getToken() ));
    }

    @Override
    public String toString()
    {
        return "" + m_binOp + "(" + m_left + "," + m_right + ")";
    }

}
