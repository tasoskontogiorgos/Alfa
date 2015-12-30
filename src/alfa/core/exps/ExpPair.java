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
public class ExpPair
{
    private final Exp   m_left;
    private final Exp   m_right;
    
    public ExpPair( Exp l, Exp r )
    {
        m_left = l;
        m_right = r;
    }
    
    public Exp getLeft()
    {
        return m_left;
    }
    
    public Exp getRight()
    {
        return m_right;
    }
    
    @Override
    public String toString()
    {
        return "Pair(" + getLeft() + "," + getRight() + ");";
    }
}
