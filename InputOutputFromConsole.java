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
import java.util.*;
public class InputOutputFromConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String name = sc.nextLine();
        int age=sc.nextInt();
        System.out.println("Name : "+name+" , "+"Age : "+age);
    }
    
}
