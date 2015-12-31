/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfa.core;

import alfa.core.runtime.AlfaEnvironment;
import java.util.Set;
import org.antlr.v4.runtime.Token;

/**
 *
 * @author tdk
 */
public interface EvaluationContext
{
    public void             setValue( String varName, Object Value );
    public Object           getValue( String varName, Token token );    
    public boolean          hasValue( String varName  );    
    public AlfaEnvironment  getEnvir();
    public Set< String >    getAllVars();
    public Statement        getCurrentStatement();

}
