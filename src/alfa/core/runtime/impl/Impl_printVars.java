package alfa.core.runtime.impl;

import alfa.core.*;

import alfa.core.runtime.*;

public class Impl_printVars extends alfa.core.runtime.gen.printVars
{
    /*
     REG(VAR)* 
     */

    public Impl_printVars( alfa.core.runtime.AlfaEvaluator e )
    {
        super( e );
    }

    @Override
    public Object eval( Object... actuals ) throws Exception
    {
        Program prog = Program.CurrentProgram;
        
        if( actuals.length == 0 )
        {
            for(String varName : prog.getAllVars()){
                System.out.println(varName + " : " + prog.getValue( varName, Program.CurrentStatement.getToken()));
            }
        }else
        {
            for(Object vn : actuals){
                String varName = vn.toString();
                System.out.println(varName + " : " + prog.getValue( varName, Program.CurrentStatement.getToken()));
            }
        }
        return null;
    }

}
