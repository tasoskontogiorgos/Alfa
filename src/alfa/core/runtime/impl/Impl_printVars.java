package alfa.core.runtime.impl;

import org.antlr.v4.runtime.Token;

public class Impl_printVars extends alfa.core.runtime.gen.printVars
{
    /*
     REG(VAR)* 
     */

    public Impl_printVars()
    {
    }

    @Override
    public Object eval( alfa.core.EvaluationContext ctx, Object... actuals ) throws Exception
    {
        Token token = ctx.getCurrentStatement().getToken();
        if( actuals.length == 0 )
        {
            for( String varName : ctx.getAllVars() )
            {
                if( ctx.hasValue( varName ))
                {
                    System.out.println( varName + " : " + ctx.getValue( varName, token ) );
                } else
                {
                    System.out.println( varName + " has not yet assinged a value ... " );
                }
            }
        }else
        {
            for( Object vn : actuals )
            {
                String varName = vn.toString();
                System.out.println( varName + " : " + ctx.getValue( varName, token ) );
            }
        }
        return null;
    }

}
