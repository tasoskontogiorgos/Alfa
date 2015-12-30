package alfa.core.runtime.impl;

import alfa.core.*;

import alfa.core.runtime.*;

public class Impl_tasos3 extends alfa.core.runtime.gen.tasos3
{
    /*
     REG(NUM)+ 
     */

    public Impl_tasos3( alfa.core.runtime.AlfaEvaluator e )
    {
        super( e );
    }

    @Override
    public Object eval( Object... actuals ) throws Exception
    {
        double r = 0;
        for( Object o : actuals )
        {
            r += ( ( Double ) o ).doubleValue();
        }
        return r;
    }

}