/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfa;

import alfa.core.Program;
import alfa.core.runtime.AlfaEnvironment;
import alfa.core.runtime.gen.DefaultEnvir;
import alfa.parser.AlfaParse;

/**
 *
 * @author tdk
 */
public class Tool
{

    private static AlfaEnvironment s_envir;

    public Tool()
    {
        if( s_envir == null )
        {
            s_envir = new DefaultEnvir();
            s_envir.init();
        }
    }

    public void exec( String alfaSourceFileName ) throws Exception
    {
        Program p = AlfaParse.Parse( "src/alfa/tests/test.alfa" );
        p.exec( s_envir );
    }
}
