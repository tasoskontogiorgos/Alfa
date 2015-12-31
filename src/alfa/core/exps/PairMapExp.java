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
public class PairMapExp extends BaseExp
{
    static public class Pair
    {
        public final Object a;
        public final Object b;
        Pair( Object a, Object b )
        {
            this.a = a;
            this.b = b;
        }
        @Override
        public String toString()
        {
            return "" + a + " _ " + b;
        }
    }
    
    private final List< ExpTriple > m_triples;
    
    
    public PairMapExp( Token token )
    {
        super( token );
        m_triples = new ArrayList();
    }
    
    public void add( Exp k1, Exp k2, Exp val )
    {
        m_triples.add(  new ExpTriple( k1, k2, val ));
    }
    
    @Override
    public void resolve( SymbolTable st )
    {
        for( ExpTriple p : m_triples )
        {
            p.getFirst().resolve( st );
            p.getSecond().resolve( st );
            p.getThird().resolve( st );
        }
        m_type = Types.MAP;
    }
    
    @Override
    public String toString()
    {
        String s = "{";
        for( ExpTriple p : m_triples )
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
         for( ExpTriple t : m_triples )
         {
             Object k1 = t.getFirst().eval( ctx );
             Object k2 = t.getSecond().eval( ctx );
             Object val = t.getThird().eval( ctx );
             Pair key = new Pair( k1, k2 );
             m.put( key, val);
         }
         return m;
    }
}
