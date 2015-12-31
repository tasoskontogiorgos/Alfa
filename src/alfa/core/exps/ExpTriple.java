/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfa.core.exps;

import alfa.core.Exp;

/**
 *
 * @author tdk
 */
public class ExpTriple
{
    private final Exp   m_first;
    private final Exp   m_second;
    private final Exp   m_third;
    
    public ExpTriple( Exp f, Exp s, Exp t )
    {
        m_first = f;
        m_second = s;
        m_third = t;
    }
    
    public Exp getFirst()
    {
        return m_first;
    }
    
    public Exp getSecond()
    {
        return m_second;
    }
    
    public Exp getThird()
    {
        return m_third;
    }
    
    @Override
    public String toString()
    {
        return "Triple(" + getFirst() + "," + getSecond() + "," + getThird()+ ");";
    }
}
