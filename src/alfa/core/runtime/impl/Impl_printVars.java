package alfa.core.runtime.impl;

import alfa.core.*;

import org.antlr.v4.runtime.Token;

public class Impl_printVars extends alfa.core.runtime.gen.printVars implements SelfEvaluating
{
    /*
     REG(VAR)* 
     */

    public Impl_printVars( alfa.core.runtime.AlfaEvaluator e )
    {
        super( e );
    }

    @Override
    public Object eval( alfa.core.EvaluationContext ctx, Object... actuals ) throws Exception
    {
        Token token =  ctx.getCurrentStatement().getToken();
        if( actuals.length == 0 )
        {
            for( String varName : ctx.getAllVars() )
            {
                System.out.println( varName + " : " + ctx.getValue( varName, token ));
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
