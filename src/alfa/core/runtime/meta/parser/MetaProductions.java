/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfa.core.runtime.meta.parser;

import alfa.core.FormalArg;
import alfa.core.FormalArgSpec;
import alfa.core.FuncDeclaration;
import alfa.core.Program;
import alfa.core.runtime.meta.parser.gen.MetaBaseVisitor;
import alfa.core.runtime.meta.parser.gen.MetaParser;
import alfa.parser.AlfaParse;
import alfa.util.Util;



/**
 *
 * @author tdk
 */
public class MetaProductions extends MetaBaseVisitor< Void>
{

    @Override
    public Void visitInclude( MetaParser.IncludeContext ctx )
    {
        String fileNme = ctx.StringLiteral().getText();
        fileNme = fileNme.replaceAll( "\"", "" );
        AlfaParse.Parse( fileNme );
        return visitChildren( ctx );
    }

    private FormalArg.Kind convert( MetaParser.ConcreteFormalContext ctx )
    {
        if( ctx.LIST() != null )
        {
            return FormalArg.Kind.LIST;
        }
        if( ctx.MAP() != null )
        {
            return FormalArg.Kind.MAP;
        }
        if( ctx.NUM() != null )
        {
            return FormalArg.Kind.NUM;
        }
        if( ctx.PAIRMAP() != null )
        {
            return FormalArg.Kind.PAIRMAP;
        }
        if( ctx.VAR() != null )
        {
            return FormalArg.Kind.VAR;
        }
        if( ctx.STR() != null )
        {
            return FormalArg.Kind.STR;
        }
        if( ctx.BOOL() != null )
        {
            return FormalArg.Kind.BOOL;
        }

        throw new RuntimeException( "Illegal state " + Util.At( ctx.start ) );

    }

    private FormalArg.Mod convert( MetaParser.ModContext ctx )
    {
        if( ctx.MULT() != null )
        {
            return FormalArg.Mod.STAR;
        }
        if( ctx.PLUS() != null )
        {
            return FormalArg.Mod.PLUS;
        }
        return FormalArg.Mod.OPTIONAL;
    }

    private FormalArgSpec convert( MetaParser.FormalSpecContext ctx )
    {
        if( ctx.mod() != null )
        {
            FormalArgSpec under = convert( ctx.formalSpec().get( 0 ) );
            FormalArg.Mod mod = convert( ctx.mod() );
            return new FormalArg.Reg( ctx.start, mod, under );
        }
        if( ctx.BRA() != null )
        {
            FormalArg.Union u = new FormalArg.Union( ctx.start );
            for( int i = 0; i < ctx.formalSpec().size(); i ++ )
            {
                FormalArgSpec m = convert( ctx.formalSpec().get( i ) );
                u.add( m );
            }
            return u;
        }
        return new FormalArg.Concrete( ctx.start, convert( ctx.concreteFormal() ) );
    }

    @Override
    public Void visitFormalSpec( MetaParser.FormalSpecContext ctx )
    {
        FormalArgSpec s = convert( ctx );
        return visitChildren( ctx );
    }

    @Override
    public Void visitFunDecl( MetaParser.FunDeclContext ctx )
    {
        String name = ctx.Identifier().toString();
        FuncDeclaration fd = new FuncDeclaration( ctx.start, name );
        for( int i = 0; i < ctx.formalSpec().size(); i ++ )
        {
            FormalArgSpec fa = convert( ctx.formalSpec( i ) );
            fd.add( fa );
        }
        FuncDeclaration.Register( fd );
        return visitChildren( ctx );
    }

}
