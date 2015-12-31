package alfa.core.runtime.impl;

import alfa.core.*;
import java.util.Collection;


public class Impl_SystemIN extends alfa.core.runtime.gen.SystemIN implements SelfEvaluating
{
    /*
     (VAR|STR|BOOL|NUM|MAP|PAIRMAP|LIST) (VAR|STR|BOOL|NUM|MAP|PAIRMAP|LIST) 
     */

    public Impl_SystemIN()
    {
    }

    @Override
    public Object eval( alfa.core.EvaluationContext ctx, Object... actuals ) throws Exception
    {
        Exp l = ( Exp ) actuals[ 0 ];
        Exp r = ( Exp ) actuals[ 1 ];
        
        Object lo = l.eval( ctx );
        Object ro = r.eval( ctx );
        
        if( !( ro instanceof Collection ) )
        {
            throw new Exception( "Was expecting a Collection as rhs");
        }
        
        Collection col =  ( Collection ) ro;
        return col.contains( lo );
    }

}
