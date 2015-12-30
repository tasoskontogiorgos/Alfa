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
public class GenFunctionImpl
{

    static final String s_DIR = "src/alfa/core/runtime/impl";
    static final String s_PKG = "alfa.core.runtime.impl";
    private final FuncDeclaration m_funcDecl;

    public GenFunctionImpl( FuncDeclaration fd )
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
        
        return s_DIR + "/Impl_" + JavaName() + ".java";
    }

    private String formals()  
    {
        String f = "";
        for( FormalArgSpec s : m_funcDecl.getFormals())
        {
            f += s.toString() + " ";
        }
        return f;
    }
    
    private void _gen() throws IOException
    {
        String fn = fileName();
        File file = new File( fn );
        if( file.exists() )
        {
            return;
        }
        PrintWriter out = new PrintWriter( new FileWriter( fn, false ) );
        String className = "Impl_" + JavaName();
        String text = "";
        text += "package " + s_PKG + ";\n\n\n";
        text += "import alfa.core.*;" + "\n\n";
        text += "import alfa.core.runtime.*;" + "\n\n";
        text += "public class " + className + " extends alfa.core.runtime.gen." + JavaName()  + "\n";
        text += "{" + "\n";
        text += "/*" + "\n";
        text += "\t" + formals() + "\n";
        text += "*/" + "\n";
        
        text += "\t" + "public " + className + "( alfa.core.runtime.AlfaEvaluator e )" + "\n";
        text += "\t" + "{" + "\n";
        text += "\t\t" + "super( e );\n";
        text += "\t" + "}" + "\n\n";
        
        
        
        
        
        
        text += "\t" + "@Override" + "\n";
        text += "\t" + "public Object eval( alfa.core.EvaluationContext ctx, Object ... actuals ) throws Exception" + "\n";
        text += "\t" + "{" + "\n";
        text += "\t\t" + "throw new RuntimeException( \"Not Implemented ! \");\n";
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
