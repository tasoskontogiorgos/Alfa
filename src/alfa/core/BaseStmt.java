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
public class BaseStmt implements Statement
{
    private final Token m_token;
     
    public BaseStmt( Token token )
    {
        m_token = token;
    }
 
    @Override
    public Token getToken()
    {
        return m_token;
    }

    @Override
    public void resolve( SymbolTable st )
    {
        throw new UnsupportedOperationException( "Not supported yet." ); 
    }

    @Override
    public Object eval( EvaluationContext ctx )
    {
        throw new UnsupportedOperationException( "Not supported yet." );  
    }
    
}
