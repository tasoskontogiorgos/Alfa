 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfa.core.runtime.meta;

import alfa.core.FormalArgSpec;
import alfa.core.FuncDeclaration;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author tdk
 */
public class GenFunction
{

    static final String s_DIR = "src/alfa/core/runtime/gen";
    static final String s_PKG = "alfa.core.runtime.gen";
    private final FuncDeclaration m_funcDecl;

    public GenFunction( FuncDeclaration fd )
    {
        m_funcDecl = fd;
    }

    private String AlfaName()
    {
        return m_funcDecl.getName();
    }

    private String JavaName()
    {
        String s = AlfaName();
        s = s.replaceAll( "%", "" );
        return s;
    }

    private String fileName() throws IOException
    {
        File dir = new File( s_DIR );
        if( !dir.exists() )
        {
            dir.mkdirs();
        }
        
        return s_DIR + "/" + JavaName() + ".java";
    }

    private void _gen() throws IOException
    {
        String fn = fileName();
        PrintWriter out = new PrintWriter( new FileWriter( fn, false ) );
        String className = JavaName();
        String text = "";
        text += "package " + s_PKG + ";\n\n\n";
        text += "import alfa.core.*;" + "\n\n";
        text += "import alfa.core.runtime.*;" + "\n\n";
        text += "public class " + className + " extends alfa.core.runtime.BaseAlfaFunction"  + "\n";
        text += "{" + "\n";
        
        text += "\t" + "public " + className + "( alfa.core.runtime.AlfaEvaluator e )" + "\n";
        text += "\t" + "{" + "\n";
        text += "\t\t" + "super( e );\n";
        text += "\t" + "}" + "\n\n";
        
        
        text += "\t" + "@Override" + "\n";
        text += "\t" + "public String getName()" + "\n";
        text += "\t" + "{" + "\n";
        text += "\t\t" + "return \"" + m_funcDecl.getName() + "\";\n";
        text += "\t" + "}" + "\n\n";
        
        
        text += "\t" + "@Override" + "\n";
        text += "\t" + "public java.util.List< FormalArgSpec > getFormals( )" + "\n";
        text += "\t" + "{" + "\n";
        text += "\t\t" + "java.util.List<FormalArgSpec > list = new java.util.ArrayList();\n";
    
        for( FormalArgSpec spec : m_funcDecl.getFormals() )
        {
            text += "\t\tlist.add( " + spec.codeGen() + ");\n";
        }
    
        text += "\t\t" + "return list;\n";
        text += "\t" + "}" + "\n\n";
        
        
        text += "\t" + "@Override" + "\n";
        text += "\t" + "public Object eval( Object ... actuals ) throws Exception" + "\n";
        text += "\t" + "{" + "\n";
        text += "\t\t" + "Evaluator evaltor = ( Evaluator )getEvaluator();\n";
        text += "\t\t" + "return evaltor." + className + "( actuals );\n";
        text += "\t" + "}" + "\n\n";
        
        text += "}" + "\n";

        out.println( text );
        out.flush();

    }

    public void gen()
    {
        try
        {
            _gen();
        }catch( Exception x )
        {
            throw new RuntimeException( x.getMessage() );
        }
    }

    @Override
    public String toString()
    {
        return "" + m_funcDecl;
    }

}
