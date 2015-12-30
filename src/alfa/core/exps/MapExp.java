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
import java.util.HashMap;
import java.util.List;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author tdk
 */
public class MapExp extends BaseExp
{
    private final List< ExpPair > m_pairs;
    
    
    public MapExp( Token token )
    {
        super( token );
        m_pairs = new ArrayList();
    }
    
    public void add( Exp key, Exp val )
    {
        m_pairs.add(  new ExpPair( key, val ));
    }
    
    @Override
    public void resolve( SymbolTable st )
    {
        for( ExpPair p : m_pairs )
        {
            p.getLeft().resolve( st );
            p.getRight().resolve( st );
        }
        m_type = Types.MAP;
    }
    
    @Override
    public String toString()
    {
        String s = "{";
        for( ExpPair p : m_pairs )
        {
            s += " " + p;
        }
        s += "}";
        return s ;
    }
    
    @Override
    public Object eval( EvaluationContext ctx )
    {
         HashMap m = new HashMap();
         for( ExpPair pair : m_pairs )
         {
             Object key = pair.getLeft().eval( ctx );
             Object val = pair.getRight().eval( ctx );
             m.put(  key, val);
         }
         return m;
    }
}
