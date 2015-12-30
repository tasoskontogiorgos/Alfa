/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfa.core.exps;

import alfa.core.EvaluationContext;
import alfa.core.Exp;
import alfa.core.SymbolTable;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author tdk
 */
public class Conditional extends BaseExp
{
    private final Exp       m_pred;
    private final Exp       m_true;
    private final Exp       m_false;
    
    public Conditional( Token token, Exp pred, Exp trueBranch, Exp falseBranch )
    {
        super( token );
        m_pred = pred;
        m_true = trueBranch;
        m_false = falseBranch;
    }
    
    @Override
    public void resolve( SymbolTable st )
    {
         m_pred.resolve( st );
         m_true.resolve( st );
         m_false.resolve( st );
    }
    
    @Override
    public String toString()
    {
        return "" + m_pred + " ? (" + m_true + ") : (" + m_false + ")";
    }

    
}
