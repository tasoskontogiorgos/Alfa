/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfa.core.runtime.meta.parser;


import alfa.core.runtime.meta.parser.gen.MetaLexer;
import alfa.core.runtime.meta.parser.gen.MetaParser;
import java.io.FileInputStream;
import java.io.InputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 *
 * @author tdk
 */
public class MetaParse
{

    private static void _Parse( String fileName ) throws Exception
    {
        InputStream is = new FileInputStream( fileName );

        ANTLRInputStream input = new ANTLRInputStream( is );
        MetaLexer lexer = new MetaLexer( input );
        CommonTokenStream tokens = new CommonTokenStream( lexer );
        MetaParser parser = new MetaParser( tokens );
        ParseTree tree = parser.program(); // parse; start at prog <label id="code.tour.main.6"/>
        //System.out.println( tree.toStringTree( parser ) ); // print tree as text <label id="code.tour.main.7"/>

        MetaProductions prod = new MetaProductions();

        prod.visit( tree );
    }

    public static void Parse( String fileName ) 
    {
        try
        {
            _Parse( fileName );
        } catch( Exception x )
        {
            throw new RuntimeException( x.getMessage() );
        }
    }

}
