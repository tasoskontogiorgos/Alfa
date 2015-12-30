/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfa.core;

import org.antlr.v4.runtime.Token;

/**
 *
 * @author tdk
 */
public class Assignment extends BaseStmt
{
    private final String        m_varName;
    private final Exp           m_exp;
    
    public Assignment( Token token, String varName, Exp exp )
    {
        super( token );
        m_varName = varName;
        m_exp = exp;
    }
    
    @Override
    public void resolve( SymbolTable st )
    {
        m_exp.resolve( st );
        st.define( m_varName, m_exp );
    }
    
    @Override
    public String toString()
    {
        String s = "STMT : " + m_varName + " = " + m_exp + ";";
        return s;
    }
    
    @Override
    public Object eval( EvaluationContext ctx )
    {
        Object val =  m_exp.eval( ctx );  
        ctx.setValue( m_varName, val );
        return val;
    }
}
