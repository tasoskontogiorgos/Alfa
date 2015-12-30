/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfa.core;

import alfa.core.Types.Type;
import alfa.core.exps.Var;
import alfa.util.Util;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author tdk
 */
public class FormalArg
{

    public static enum Kind
    {

        VAR,
        STR,
        NUM,
        MAP,
        LIST,
        PAIRMAP,
        BOOL
    }

    public static enum Mod
    {

        OPTIONAL,
        PLUS,
        STAR,
    }

    public abstract static class Base implements FormalArgSpec
    {

        private final Token m_token;

        public Base( Token token )
        {
            m_token = token;
        }

        @Override
        public boolean isOptional()
        {
            return false;
        }

        @Override
        public boolean isUnion()
        {
            return false;
        }

        @Override
        public boolean zeroOrMore()
        {
            return false;
        }

        @Override
        public boolean oneOrMore()
        {
            return false;
        }

        @Override
        public Token getToken()
        {
            return m_token;
        }

        @Override
        public String codeGen()
        {
            return "NOT YET!";
        }

        @Override
        public void resolve( SymbolTable st )
        {
            throw new UnsupportedOperationException( "Not supported yet." );
        }

        @Override
        public Object eval( EvaluationContext ctx )
        {
            throw new UnsupportedOperationException( "Not supported yet." );
        }

    }

    public static class Concrete extends Base
    {

        private final Kind m_kind;

        public Concrete( Token token, Kind kind )
        {
            super( token );
            m_kind = kind;
        }

        public Concrete( Kind kind )
        {
            this( null, kind );
        }

        public Kind getKind()
        {
            return m_kind;
        }

        @Override
        public String codeGen()
        {
            return "new FormalArg.Concrete( FormalArg.Kind." + getKind() + " )";
        }

        @Override
        public String toString()
        {
            return "" + getKind();
        }

        @Override
        public boolean matches( Exp actual )
        {
            Type t = actual.getType();
            switch( m_kind )
            {
                case VAR:
                {
                    return actual instanceof Var;
                }
                case STR:
                {
                    return t == Types.STR;
                }
                case NUM:
                {
                    return t == Types.NUM;
                }
                case MAP:
                {
                    return t == Types.MAP;
                }
                case LIST:
                {
                    return t == Types.LIST;
                }
                case PAIRMAP:
                {
                    return t == Types.PAIRMAP;
                }
                case BOOL:
                {
                    return t == Types.BOOL;
                }
            }
            throw new RuntimeException( "Internal Error " + Util.At( getToken() ) );
        }
    }

    public static class Union extends Base
    {

        private final List< FormalArgSpec> m_unders;

        public Union( Token token )
        {
            super( token );
            m_unders = new ArrayList();
        }

        public Union( FormalArgSpec[] specs )
        {
            super( null );
            m_unders = new ArrayList();
            for( FormalArgSpec spec : specs )
            {
                add( spec );
            }
        }

        public void add( FormalArgSpec c )
        {
            m_unders.add( c );
        }

        @Override
        public String codeGen()
        {
            String specs = "new FormalArgSpec[] {";
            boolean first = true;
            for( FormalArgSpec spec : m_unders )
            {
                if( first )
                {
                    first = false;
                }else
                {
                    specs += ", ";
                }
                specs += spec.codeGen();
            }
            specs += "}";
            String s = "new FormalArg.Union( " + specs + " )";
            return s;
        }

        @Override
        public String toString()
        {
            String s = "(";
            for( int i = 0; i < m_unders.size(); i ++ )
            {
                if( i > 0 )
                {
                    s += "|";
                }
                s += m_unders.get( i );
            }
            s += ")";
            return s;
        }

        @Override
        public boolean matches( Exp actual )
        {
            for( FormalArgSpec spec : m_unders )
            {
                if( spec.matches( actual ) )
                {
                    return true;
                }
            }
            return false;
        }
    }

    public static class Reg extends Base
    {

        private final Mod m_mod;
        private final FormalArgSpec m_under;

        public Reg( Token token, Mod mod, FormalArgSpec under )
        {
            super( token );
            m_mod = mod;
            m_under = under;
        }

        public Reg( Mod mod, FormalArgSpec under )
        {
            this( null, mod, under );
        }

        public FormalArgSpec getUnder()
        {
            return m_under;
        }

        @Override
        public boolean isOptional()
        {
            switch( m_mod )
            {
                case OPTIONAL:
                    return true;
            }
            return false;
        }

        @Override
        public boolean zeroOrMore()
        {
            switch( m_mod )
            {
                case STAR:
                    return true;
            }
            return false;
        }

        @Override
        public boolean oneOrMore()
        {
            switch( m_mod )
            {
                case PLUS:
                    return true;
            }
            return false;
        }

        @Override
        public String codeGen()
        {
            String mod = "FormalArg.Mod." + m_mod;
            String under = m_under.codeGen();
            return "new FormalArg.Reg( " + mod + ", " + under + " )";
        }

        @Override
        public String toString()
        {
            String m = "*";
            switch( m_mod )
            {
                case OPTIONAL:
                {
                    m = "?";
                    break;
                }
                case PLUS:
                {
                    m = "+";
                    break;
                }
                default:
                    break;
            }
            return "REG(" + getUnder() + ")" + m;
        }

        @Override
        public boolean matches( Exp actual )
        {
            return m_under.matches( actual );
        }
    }
}
