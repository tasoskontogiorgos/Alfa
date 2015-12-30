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
public class Unary extends BaseExp
{

    private final Exp m_under;
    private final String m_oper;

    public Unary( Token token, Exp under, String oper )
    {
        super( token );
        m_under = under;
        m_oper = oper;
    }

    @Override
    public void resolve( SymbolTable st )
    {
        m_under.resolve( st );
        // TODO: For now all unary are boolean - that may change
        m_type = Types.BOOL;
    }

    @Override
    public String toString()
    {
        return "" + m_oper + "(" + m_under + ")";
    }

   
     
}
