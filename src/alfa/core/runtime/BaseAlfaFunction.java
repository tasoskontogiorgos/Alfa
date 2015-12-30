/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfa.core.runtime;

/**
 *
 * @author tdk
 */
public abstract class BaseAlfaFunction implements AlfaFunction
{
    private final AlfaEvaluator m_eval;
    
    public BaseAlfaFunction( AlfaEvaluator e )    
    {
        m_eval = e;
    }
    
    public AlfaEvaluator getEvaluator()
    {
        return m_eval;
    }
}
