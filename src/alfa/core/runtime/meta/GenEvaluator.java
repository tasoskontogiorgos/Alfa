 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfa.core.runtime.meta;

import alfa.core.FuncDeclaration;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author tdk
 */
public class GenEvaluator
{

 
 
    public GenEvaluator(   )
    {
    }

 

    private String fileName( String name ) throws IOException
    {
        File dir = new File( GenFunction.s_DIR );
        if( !dir.exists() )
        {
            dir.mkdirs();
        }
        
        return GenFunction.s_DIR + "/" + name + ".java";
    }

    private void _genIfc() throws IOException
    {
        String fn = fileName( "Evaluator");
        PrintWriter out = new PrintWriter( new FileWriter( fn, false ) );
        String text = "";
        text += "package " + GenFunction.s_PKG + ";\n\n\n";
        text += "import alfa.core.*;" + "\n\n";
        text += "import alfa.core.runtime.*;" + "\n\n";
        text += "public interface Evaluator extends alfa.core.runtime.AlfaEvaluator"  + "\n";
        text += "{" + "\n";
        

        for( FuncDeclaration fd : FuncDeclaration.GetAll().values())
        {
            String javaName = fd.getName().replaceAll( "%", "" );
            
            text += "\tpublic Object " + javaName + "( Object ... actuals ) throws Exception;\n";
        }
        
        text += "}" + "\n";
        out.println( text );
        out.flush();

    }
    
    private void _genImpl() throws IOException
    {
        String fn = fileName( "DefaultEvaluator");
        PrintWriter out = new PrintWriter( new FileWriter( fn, false ) );
        String text = "";
        text += "package " + GenFunction.s_PKG + ";\n\n\n";
        text += "import alfa.core.*;" + "\n\n";
        text += "import alfa.core.runtime.*;" + "\n\n";
        text += "public class DefaultEvaluator implements Evaluator"  + "\n";
        text += "{" + "\n";
        

        for( FuncDeclaration fd : FuncDeclaration.GetAll().values())
        {
            String javaName = fd.getName().replaceAll( "%", "" );
            
            text += "\t@Override\n";
            text += "\tpublic Object " + javaName + "( Object ... actuals ) throws Exception\n";
            text += "\t{\n";
            text += "\t\tthrow new Exception( \"Not Implemented Yet !\");\n";
            text += "\t}\n\n";
        }
        
        text += "}" + "\n";
        out.println( text );
        out.flush();

    }
    
    
    private void _genEnvir() throws IOException
    {
        String fn = fileName( "DefaultEnvir");
        PrintWriter out = new PrintWriter( new FileWriter( fn, false ) );
        String text = "";
        text += "package " + GenFunction.s_PKG + ";\n\n\n";
        text += "import alfa.core.*;" + "\n\n";
        text += "import alfa.core.runtime.*;" + "\n\n";
        text += "public class DefaultEnvir extends alfa.core.runtime.AlfaEnvironment"  + "\n";
        text += "{" + "\n";
        
        text += "\t@Override\n";
        text += "\tpublic void init( AlfaEvaluator eval )\n";
        text += "\t{\n";
        text += "\t\tif( ( eval != null ) && !( eval instanceof Evaluator) )\n";
        text += "\t\t{\n";
        text += "\t\t  throw new RuntimeException(\"Invalid Evaluator !\");\n";
        text += "\t\t}\n";
        for( FuncDeclaration fd : FuncDeclaration.GetAll().values())
        {
            String javaName = fd.getName().replaceAll( "%", "" );
            
            text += "\t\tregisterFunc( new alfa.core.runtime.impl.Impl_" +javaName + "( eval ) );\n";
         }
        text += "\t}\n";
        text += "}" + "\n";
        out.println( text );
        out.flush();

    }

    public void gen()
    {
        try
        {
            _genIfc();
            _genImpl();
            _genEnvir();
        }catch( Exception x )
        {
            throw new RuntimeException( x.getMessage() );
        }
    }

    

}
