/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package android;

/**
 *
 * @author Admin
 */
public class SimpleArithmeticAndBitwiseOperation {
    public static void main(String[] args)
    {
        int numberOne=20;
        int numberTwo=20;
        System.out.println("Plus : "+(numberOne+numberTwo));
        System.out.println("Minus : "+(numberOne-numberTwo));
        System.out.println("Product : "+(numberOne*numberTwo));
        System.out.println("Divide : "+(numberOne/numberTwo));
        System.out.println("AND : "+(numberOne&numberTwo));
        System.out.println("OR : "+(numberOne | numberTwo));
        System.out.println("NOT : "+(~numberTwo));
        System.out.println("XOR : "+(numberOne ^ numberTwo));
    }
    
}
