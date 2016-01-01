/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfa.tests;

import alfa.Tool;

/**
 *
 * @author tdk
 */
public class Runner
{
    public static void main( String ... args ) throws Exception
    {
        new Tool().exec( "src/alfa/tests/test.alfa" );
    }
}
