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
import org.antlr.v4.runtime.Token;

/**
 *
 * @author tdk
 */
public class Binary extends BaseExp
{
    private final Exp       m_left;
    private final Exp       m_right;
    private final String    m_oper;
    
    public Binary( Token token, Exp left, Exp right, String oper )
    {
        super( token );
        m_left = left;
        m_right = right;
        m_oper  = oper;
    }
    
    
    @Override
    public void resolve( SymbolTable st )
    {
        m_left.resolve( st );
        m_right.resolve( st );
        // TODO: For now all binary are boolean - that may change
        m_type = Types.BOOL;
    }
    
    
    @Override
    public String toString()
    {
        return "" + m_oper + "(" + m_left + "," + m_right + ")";
    }

   
}
