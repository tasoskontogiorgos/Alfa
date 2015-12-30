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
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author tdk
 */
public class ListExp extends BaseExp
{

    private final List< Exp> m_elements;

    public ListExp( Token token )
    {
        super( token );
        m_elements = new ArrayList();
    }

    public void add( Exp val )
    {
        m_elements.add( val );
    }

    @Override
    public void resolve( SymbolTable st )
    {
        for( Exp e : m_elements )
        {
            e.resolve( st );
        }
        m_type = Types.LIST;

    }

    @Override
    public String toString()
    {
        String s = "[";
        for( Exp p : m_elements )
        {
            s += " " + p;
        }
        s += "]";
        return s;
    }
    
    @Override
    public Object eval( EvaluationContext ctx )
    {
         ArrayList l = new ArrayList();
         for( Exp e : m_elements )
         {
             l.add(  e.eval( ctx));
         }
         return l;
    }
}
