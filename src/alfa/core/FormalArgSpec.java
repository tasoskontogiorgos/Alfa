/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alfa.core;

/**
 *
 * @author tdk
 */
public interface FormalArgSpec extends PTreeNode
{
    public boolean isOptional();
    public boolean isUnion();
    public boolean zeroOrMore();
    public boolean oneOrMore();
    public String  codeGen();
    public boolean matches( Exp actual );
}
