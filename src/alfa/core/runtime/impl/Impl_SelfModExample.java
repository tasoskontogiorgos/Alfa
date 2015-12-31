package alfa.core.runtime.impl;

import alfa.core.*;
import alfa.core.exps.Literal;
import alfa.core.exps.Literal.LiteralKind;

import alfa.core.exps.Var;
import java.util.ArrayList;
import java.util.List;

public class Impl_SelfModExample extends alfa.core.runtime.gen.SelfModExample implements SelfModifyingActuals
{
    /*
     STR STR 
     */

    public Impl_SelfModExample()
    {
    }

    @Override
    public Object eval( alfa.core.EvaluationContext ctx, Object... actuals ) throws Exception
    {
        List r = new ArrayList();
        for( Object a : actuals)
        {
            r.add( a );
        }
        return r;
    }
    
    
    private Exp shouldBe( String[] alts, Exp actual )throws Exception
    {
        String name = null;
        if( actual instanceof  Var )
        {
            name = (( Var ) actual ).getName();
        }
        if( actual instanceof  Literal )
        {
            name = (( Literal ) actual ).getValue().toString();
        }
        for( String s : alts )
        {
            if( s.equals( name ))
            {
                return new Literal( actual.getToken(), name, LiteralKind.STR );
            }
        }
        throw new Exception( "Illegal exp " + actual );
    }

    @Override
    public List<Exp> modify( SymbolTable st, List<Exp> actuals ) throws Exception
    {
        if( actuals.size() != 2 )
        {
            throw new Exception( "Illegal num of arguments, expecting 2, got " + actuals.size() );
        }
        String[] choices1 = new String[]{"Red", "RED", "Green", "GREEN"};
        String[] choices2 = new String[]{"Daphne", "Alex"};
        ArrayList newActs = new ArrayList();
        newActs.add( shouldBe( choices1, actuals.get( 0 )));
        newActs.add( shouldBe( choices2, actuals.get( 1 )));
        
        return newActs;
    }

}
