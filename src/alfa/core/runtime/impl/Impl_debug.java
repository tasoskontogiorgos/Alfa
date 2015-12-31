package alfa.core.runtime.impl;

import alfa.core.*;

import alfa.core.runtime.*;

public class Impl_debug extends alfa.core.runtime.gen.debug
{
    /*
     STR 
     */

    public Impl_debug()
    {
    }

    @Override
    public Object eval( alfa.core.EvaluationContext ctx, Object... actuals ) throws Exception
    {
        String u = ( String ) actuals[0];
        String s = u.toUpperCase();
        if( s.equals( "ON" ) )
        {
            Program.SetDebug( true );
            return null;
        }
        if( s.equals( "OFF" ) )
        {
            Program.SetDebug( false );
            return null;
        }else
        {
            throw new Exception( "Expecting ON/OFF - got " + u );
        }
    }

}
