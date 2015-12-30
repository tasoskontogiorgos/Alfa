/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfa.core;

import alfa.core.runtime.AlfaEnvironment;

/**
 *
 * @author tdk
 */
public interface SymbolTable
{
    public void             define( String varName, Exp definition );
    public Exp              getDefinition( String varName );
    public AlfaEnvironment  getEnvir();
    
}
