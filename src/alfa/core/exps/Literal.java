/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfa.core.exps;

import alfa.core.EvaluationContext;
import alfa.core.SymbolTable;
import alfa.core.Types;
import alfa.util.Util;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author tdk
 */
public class Literal extends BaseExp
{
    
    public static enum LiteralKind
    {
        NUM,
        STR,
        BOOLEAN,
        NULL
    }
    private final Object        m_literal;
    private final LiteralKind   m_kind;
    
    public Literal( Token token, Object literal, LiteralKind k )
    {
        super( token );
        m_literal = literal;
        m_kind = k;
    }
    
    public LiteralKind getKind()
    {
        return m_kind;
    }
    
    public Object getValue()
    {
        return m_literal;
    }
    
    @Override
    public void resolve( SymbolTable st )
    {
        m_type = Types.ANY;
        switch( m_kind )
        {
            case NUM: 
            {
                m_type = Types.NUM;
                break;
            }
            case STR:
            {
                m_type = Types.STR;
                break;
            }
            case BOOLEAN:
            {
                m_type = Types.BOOL;
                break;
            }
            case NULL:
            {
                m_type = Types.NULL;
                break;
            }
        }
    }
    
    @Override
    public String toString()
    {
        return "Lit( "  + getKind() + ", "  + getValue() + " )";
    }
    
    @Override
    public Object eval( EvaluationContext ctx )
    {
        switch( m_kind )
        {
            case NUM:
            {
                return Double.parseDouble( m_literal.toString() );
            }
            case STR:
            {
                return m_literal;
            }
            case BOOLEAN:
            {
                return Boolean.parseBoolean( m_literal.toString() );
            }
            case NULL:
            {
                return null;
            }
        }
        throw new RuntimeException( "Internal Error" + Util.At( getToken()));
    }
}
