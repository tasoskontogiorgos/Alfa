/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfa.core;

import alfa.core.exps.FuncCall;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author tdk
 */
public class FuncCallStmt extends BaseStmt
{
    private final FuncCall           m_exp;
    
    public FuncCallStmt( Token token,  FuncCall exp )
    {
        super( token );
        m_exp = exp;
    }
    
    
    @Override
    public void resolve( SymbolTable st )
    {
        m_exp.resolve( st );
    }
    
    @Override
    public String toString()
    {
        String s = "STMT : "  +  m_exp + ";";
        return s;
    }
    
    @Override
    public Object eval( EvaluationContext ctx )
    {
        return m_exp.eval( ctx );  
    }
}
