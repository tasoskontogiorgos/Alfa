/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfa.core;

import org.antlr.v4.runtime.Token;

/**
 *
 * @author tdk
 */
public interface PTreeNode
{
    public Token        getToken();
    public void         resolve( SymbolTable st );
    public Object       eval( EvaluationContext ctx );
}
