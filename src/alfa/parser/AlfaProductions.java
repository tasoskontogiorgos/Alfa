/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfa.parser;

import alfa.core.Assignment;
import alfa.core.exps.*;
import alfa.core.Exp;
import alfa.core.FuncCallStmt;
import alfa.core.Program;
import alfa.parser.gen.AlfaBaseVisitor;
import alfa.parser.gen.AlfaParser;
import alfa.util.Util;

/**
 *
 * @author tdk
 */
public class AlfaProductions extends AlfaBaseVisitor< Void>
{

    private final Program m_prog;
    private int m_assgnLevel;

    AlfaProductions()
    {
        m_prog = new Program();
    }

    public Program getProgram()
    {
        return m_prog;
    }

    @Override
    public Void visitFunCall( AlfaParser.FunCallContext ctx )
    {
        if( m_assgnLevel == 0 )
        {
            FuncCall exp = ( FuncCall ) convert( ctx );
            FuncCallStmt s = new FuncCallStmt( ctx.start, exp );
            m_prog.add( s );
        }
        return visitChildren( ctx );
    }

    @Override
    public Void visitAssignment( AlfaParser.AssignmentContext ctx )
    {
        try
        {
            m_assgnLevel ++;
            String name = ctx.Identifier().getText();
            Exp exp = convert( ctx.exp() );
            Assignment a = new Assignment( ctx.start, name, exp );
            m_prog.add( a );
            return visitChildren( ctx );
        }finally
        {
            m_assgnLevel --;
        }
    }

    @Override
    public Void visitInclude( AlfaParser.IncludeContext ctx )
    {
        String fileNme = ctx.StringLiteral().getText();
        fileNme = fileNme.replaceAll( "\"", "" );
        AlfaParse.Parse( fileNme );
        return visitChildren( ctx );
    }
 
  
    public Exp convert( AlfaParser.NumContext ctx )
    {
        if( ctx.IntegerLiteral() != null )
        {
            return new Literal( ctx.start, ctx.IntegerLiteral().getText(), Literal.LiteralKind.NUM );
        }
        if( ctx.FloatingPointLiteral() != null )
        {
            return new Literal( ctx.start, ctx.FloatingPointLiteral().getText(), Literal.LiteralKind.NUM );
        }
                
        throw new RuntimeException( "Illegal State " + Util.At( ctx.start ) );

    }
    
    public Exp convert( AlfaParser.LiteralContext ctx )
    {
        if( ctx.BooleanLiteral() != null )
        {
            return new Literal( ctx.start, ctx.BooleanLiteral().getText(), Literal.LiteralKind.BOOLEAN );
        }
        if( ctx.IntegerLiteral() != null )
        {
            return new Literal( ctx.start, ctx.IntegerLiteral().getText(), Literal.LiteralKind.NUM );
        }
        if( ctx.StringLiteral() != null )
        {
            return new Literal( ctx.start, ctx.StringLiteral().getText(), Literal.LiteralKind.STR );
        }
        if( ctx.FloatingPointLiteral() != null )
        {
            return new Literal( ctx.start, ctx.FloatingPointLiteral().getText(), Literal.LiteralKind.NUM );
        }
        if( ctx.NullLiteral() != null )
        {
            return new Literal( ctx.start, ctx.NullLiteral().getText(), Literal.LiteralKind.NULL );
        }

        throw new RuntimeException( "Illegal State " + Util.At( ctx.start ) );
    }

    Exp convert( AlfaParser.VarContext ctx )
    {
        String name = ctx.Identifier().getText();
        Var v = new Var( ctx.start, name );
        return v;
    }

    Exp convert( AlfaParser.MapContext ctx )
    {
        MapExp m = new MapExp( ctx.start );
        for( int i = 0; i < ctx.exp().size(); i += 2 )
        {
            Exp key = convert( ctx.exp( i ) );
            Exp val = convert( ctx.exp( i + 1 ) );
            m.add( key, val );
        }
        return m;
    }
    
    Exp convert( AlfaParser.PairmapContext ctx )
    {
        PairMapExp m = new PairMapExp( ctx.start );
        for( int i = 0; i < ctx.exp().size(); i += 1 )
        {
            Exp k1 = convert( ctx.num( i*2 ) );
            Exp k2 = convert( ctx.num( i*2+1 ) );
            Exp val = convert( ctx.exp( i ) );
            m.add( k1, k2, val );
        }
        return m;
    }

    Exp convert( AlfaParser.ListContext ctx )
    {
        ListExp m = new ListExp( ctx.start );
        for( int i = 0; i < ctx.exp().size(); i ++ )
        {
            Exp val = convert( ctx.exp( i ) );
            m.add( val );
        }
        return m;
    }

    Exp convert( AlfaParser.FunCallContext ctx )
    {
        String name = ctx.Identifier().getText();
        FuncCall fc = new FuncCall( ctx.start, name );
        for( int i = 0; i < ctx.exp().size(); i ++ )
        {
            Exp val = convert( ctx.exp( i ) );
            fc.add( val );
        }
        return fc;
    }

    Exp convert( AlfaParser.ExpContext ctx )
    {
        if( ctx.literal() != null )
        {
            return convert( ctx.literal() );
        }
        if( ctx.var() != null )
        {
            return convert( ctx.var() );
        }
        if( ctx.map() != null )
        {
            return convert( ctx.map() );
        }
        if( ctx.pairmap()!= null )
        {
            return convert( ctx.pairmap());
        }
        
        if( ctx.list() != null )
        {
            return convert( ctx.list() );
        }
        if( ctx.funCall() != null )
        {
            return convert( ctx.funCall() );
        }
        if( ctx.binOper() != null )
        {
            String op = ctx.binOper().getText();
            Exp left = convert( ctx.exp( 0 ));
            Exp right = convert( ctx.exp( 1 ));
            return new Binary( ctx.start, left, right, op );
        }
        if( ctx.BRA() != null )
        {
            return convert( ctx.exp( 0 ));
        }

        throw new RuntimeException( "Illegal State " + Util.At( ctx.start ) );
    }

}
