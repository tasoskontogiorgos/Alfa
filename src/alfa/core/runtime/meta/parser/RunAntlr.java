/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfa.core.runtime.meta.parser;

import alfa.parser.*;
import java.io.File;

/**
 *
 * @author tdk
 */
public class RunAntlr
{
     
    public static void main( String... args ) throws Exception
    {
        String baseDir = System.getProperty( "user.dir");
        
        org.antlr.v4.Tool.main( new String[]
        {
            "-long-messages",
            "-visitor",
            "-lib",
            baseDir + "/src/alfa/core/runtime/meta/parser",
            "-o", 
            "src/alfa/core/runtime/meta/parser/gen",
            "-package", 
            "alfa.core.runtime.meta.parser.gen",
            baseDir + "/src/alfa/core/runtime/meta/parser/Meta.g4"
        } );
    }
}
