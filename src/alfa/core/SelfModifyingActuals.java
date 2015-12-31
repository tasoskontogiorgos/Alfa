/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfa.core;

import java.util.List;

/**
 *
 * @author tdk
 */
public interface SelfModifyingActuals
{
    public List< Exp > modify( SymbolTable st, List< Exp > actuals ) throws Exception;
}
