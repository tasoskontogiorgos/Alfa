/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfa.core.runtime.meta;

import alfa.core.FuncDeclaration;
import alfa.core.runtime.meta.parser.MetaParse;

/**
 *
 * @author tdk
 */
public class GenFunctions
{
    public static void main( String ... args )
    {
        MetaParse.Parse( "src/alfa/core/runtime/meta/system.alfa" );
        
        for( FuncDeclaration fd : FuncDeclaration.GetAll().values())
        {
            GenFunction g = new GenFunction( fd );
            g.gen();
            GenFunctionImpl impl = new GenFunctionImpl( fd );
            impl.gen();
        }
        
        new GenEvaluator().gen();
        
    }
}
