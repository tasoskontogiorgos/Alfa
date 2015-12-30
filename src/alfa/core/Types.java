/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfa.core;

import alfa.util.Util;
import java.util.HashMap;
import java.util.Map;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author tdk
 */
public class Types
{
    static private  Map< String, Type > s_all;
    
    static public NULL          NULL;
    static public ANY           ANY;
    static public NUM           NUM;
    static public STR           STR;
    static public BOOL          BOOL;
    static public MAP           MAP;
    static public PAIRMAP       PAIRMAP;
    static public LIST LIST;
    
    static private Map< String, Type > all()
    {
        if( s_all == null )
        {
            s_all = new HashMap();
            Register( NULL = new NULL() ); 
            Register( ANY = new ANY() ); 
            Register( NUM = new NUM() );
            Register( STR = new STR() );
            Register( BOOL = new BOOL() );
            Register( MAP = new MAP() );
            Register( PAIRMAP = new PAIRMAP() );
            Register( LIST = new LIST() );
        }
        return s_all;
    }
    
    public static void InitTypes()
    {
        all();
    }
    
    public static void Register( Type tp )
    {
//        if( Has( tp.getName()))
//        {
//            throw new RuntimeException( "Duplicate declaration " + tp.getName()  );
//        }
        all().put(  tp.getName(), tp );
    }
    
    public static Type Get( String name, Token token )
    {
        Type tp = all().get( name );
        if( tp == null )
        {
            throw new RuntimeException( "Unknown function " + name + Util.At( token ));
        }
        return tp;
    }
    
    public static boolean Has( String name )
    {
        return all().containsKey( name );
    } 
    
    public static interface Type
    {
        public String getName();
    }
    
    public static class NULL implements Type
    {
        @Override
        public String getName()
        {
            return "NULL";
        }
    }
    public static class ANY implements Type
    {
        @Override
        public String getName()
        {
            return "ANY";
        }
    }
    public static class NUM implements Type
    {
        @Override
        public String getName()
        {
            return "NUM";
        }
    }
    public static class STR implements Type
    {
        @Override
        public String getName()
        {
            return "STR";
        }
    }
    public static class BOOL implements Type
    {
        @Override
        public String getName()
        {
            return "BOOL";
        }
    }
    
    public static class MAP implements Type
    {
        @Override
        public String getName()
        {
            return "MAP";
        }
    }
    
    public static class PAIRMAP implements Type
    {
        @Override
        public String getName()
        {
            return "PAIRMAP";
        }
    }
    
    public static class LIST implements Type
    {
        @Override
        public String getName()
        {
            return "LIST";
        }
    }
            
}
