/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfa.util;

import org.antlr.v4.runtime.Token;

/**
 *
 * @author tdk
 */
public class Util
{
    public static String At( Token token )
    {
        String s = " @ line:";
        s += token.getLine();
        s += " char: ";
        s += token.getTokenIndex();
        return s;
    }
}
