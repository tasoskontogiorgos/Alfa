/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfa.core.exps;

import alfa.core.EvaluationContext;
import alfa.core.Exp;
import alfa.core.SymbolTable;
import alfa.core.Types.Type;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author tdk
 */
public  class BaseExp implements Exp
{
    private final Token m_token;
    protected Type      m_type;
    
    public BaseExp( Token token )
    {
        m_token = token;
    }
    @Override
    public Type getType()
    {
        return m_type;
    }

    @Override
    public Token getToken()
    {
        return m_token;
    }

    @Override
    public void resolve( SymbolTable st )
    {
        throw new UnsupportedOperationException( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object eval( EvaluationContext ctx )
    {
        throw new UnsupportedOperationException( "Not supported yet." ); //To change body of generated methods, choose Tools | Templates.
    }

     
    
}
