/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfa.core.runtime;

import alfa.core.FormalArgSpec;
import java.util.List;

/**
 *
 * @author tdk
 */
public interface AlfaFunction
{
    public AlfaEvaluator            getEvaluator();
    public String                   getName();
    public List< FormalArgSpec >    getFormals();
    public Object                   eval( alfa.core.EvaluationContext ctx, Object ... actuals ) throws Exception;
}
