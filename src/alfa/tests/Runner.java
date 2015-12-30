/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfa.tests;

import alfa.core.Program;
import alfa.core.Types;
import alfa.core.runtime.AlfaEnvironment;
import alfa.core.runtime.gen.DefaultEnvir;
import alfa.core.runtime.gen.DefaultEvaluator;
import alfa.parser.AlfaParse;

/**
 *
 * @author tdk
 */
public class Runner
{
    public static void main( String ... args )
    {
        Types.InitTypes();
        AlfaEnvironment envir = new DefaultEnvir();
        envir.init( new DefaultEvaluator());
        Program p = AlfaParse.Parse( "src/alfa/tests/test.alfa" );
        p.exec( envir );
    }
}
