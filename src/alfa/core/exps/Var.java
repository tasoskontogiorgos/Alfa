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
import alfa.util.Util;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author tdk
 */
public class Var extends BaseExp
{

    private final String m_name;

    public Var( Token token, String name )
    {
        super( token );
        m_name = name;
    }

    public String getName()
    {
        return m_name;
    }
    
    
    @Override
    public void resolve( SymbolTable st )
    {
        Exp e = st.getDefinition( m_name );
        if( e == null )
        {
            throw new RuntimeException( "Undefined VAR " + m_name + Util.At(  getToken()));
        }
        m_type = Types.ANY;
    }

    @Override
    public String toString()
    {
        return "VAR(" + getName() + ")";
    }
    
    @Override
    public Object eval( EvaluationContext ctx )
    {
        return ctx.getValue( m_name, getToken() );
    }
}
