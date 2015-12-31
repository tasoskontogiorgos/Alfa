/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfa.core.runtime;

import alfa.util.Util;
import java.util.HashMap;
import java.util.Map;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author tdk
 */
public abstract class AlfaEnvironment
{
    private final Map< String, BaseAlfaFunction > m_all = new HashMap();
    
    public Map< String, BaseAlfaFunction > getAll()
    {
        return m_all;
    }
    public void registerFunc( BaseAlfaFunction f )
    {
        if( hasFunctionDefinition( f.getName()))
        {
            throw new RuntimeException( "Duplicate declaration " + f.getName());
        }
        m_all.put(  f.getName(), f );
     }
    
    public BaseAlfaFunction getFuncdefinition( String name, Token token )
    {
        BaseAlfaFunction f = m_all.get( name );
        if( f == null )
        {
            throw new RuntimeException( "Unknown function " + name + Util.At( token ));
        }
        return f;
    }
    
    public boolean hasFunctionDefinition( String name )
    {
        return m_all.containsKey( name );
    }
    
    public abstract void init(  ); 
    
}
