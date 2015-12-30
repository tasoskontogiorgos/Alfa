/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfa.core;

import alfa.core.FormalArg.Reg;
import alfa.util.Util;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author tdk
 */
public class FuncDeclaration implements PTreeNode
{

    static private final Map< String, FuncDeclaration> s_all = new HashMap();

    static public Map< String, FuncDeclaration> GetAll()
    {
        return s_all;
    }

    public static void Register( FuncDeclaration fd )
    {
        if( Has( fd.getName() ) )
        {
            throw new RuntimeException( "Duplicate declaration " + fd.getName() + Util.At( fd.getToken() ) );
        }
        s_all.put( fd.getName(), fd );
        System.out.println( "Registered " + fd );
    }

    public static FuncDeclaration Get( String name, Token token )
    {
        FuncDeclaration f = s_all.get( name );
        if( f == null )
        {
            throw new RuntimeException( "Unknown function " + name + Util.At( token ) );
        }
        return f;
    }

    public static boolean Has( String name )
    {
        return s_all.containsKey( name );
    }

    public void Resolve( SymbolTable st )
    {
        for( FuncDeclaration f : s_all.values() )
        {
            f.resolve( st );
        }
    }

    private final Token m_token;
    private final String m_name;
    private final List< FormalArgSpec> m_formals;

    public FuncDeclaration( Token token, String name )
    {
        m_token = token;
        m_name = name;
        m_formals = new ArrayList();
    }

    public List< FormalArgSpec> getFormals()
    {
        return m_formals;
    }

    public void add( FormalArgSpec fa )
    {
        if( m_formals.size() > 0 )
        {
            FormalArgSpec last = m_formals.get( m_formals.size() - 1 );
            if( last instanceof Reg )
            {
                throw new RuntimeException( "Formals folowong Reg formals noy allowed ( yet ) !" + Util.At( fa.getToken() ) );
            }
        }
        m_formals.add( fa );
    }

    public String getName()
    {
        return m_name;
    }

    @Override
    public Token getToken()
    {
        return m_token;
    }

    @Override
    public void resolve( SymbolTable st )
    {
    }

    @Override
    public String toString()
    {
        String s = "" + getName() + "( ";
        for( int i = 0; i < getFormals().size(); i ++ )
        {
            if( i > 0 )
            {
                s += ", ";
            }
            s += getFormals().get( i );
        }
        s += " )";
        return s;

    }

    @Override
    public Object eval( EvaluationContext ctx )
    {
        throw new UnsupportedOperationException( "Not supported yet." );
    }
}
