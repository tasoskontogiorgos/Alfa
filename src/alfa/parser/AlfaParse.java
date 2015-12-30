/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfa.parser;

import alfa.core.Program;
import alfa.parser.gen.AlfaLexer;
import alfa.parser.gen.AlfaParser;
import java.io.FileInputStream;
import java.io.InputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author tdk
 */
public class AlfaParse
{

    private static Program _Parse( String fileName ) throws Exception
    {
        InputStream is = new FileInputStream( fileName );

        ANTLRInputStream input = new ANTLRInputStream( is );
        AlfaLexer lexer = new AlfaLexer( input );
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        AlfaParser parser = new AlfaParser( tokens );
        ParseTree tree = parser.program(); // parse; start at prog <label id="code.tour.main.6"/>
        //System.out.println( tree.toStringTree( parser ) ); // print tree as text <label id="code.tour.main.7"/>

        AlfaProductions prod = new AlfaProductions();

        prod.visit( tree );
        return prod.getProgram();
    }

    public static Program Parse( String fileName ) 
    {
        try
        {
            return _Parse( fileName );
        } catch( Exception x )
        {
            throw new RuntimeException( x.getMessage() );
        }
    }

}
