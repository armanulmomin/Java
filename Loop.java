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
public class Loop {
    public static void main(String[] args)
    {
        int numOne=10;
        int numTwo=20;
        if(numOne>numTwo)
        {
            System.out.println("numOne is greater than numTwo");
        }
        else
        {
            System.out.println("numTwo is greater than numOne");
        }
        //for and while loop used for pretest
        //do while loop used for posttest
        //when we know the repition, we use for loop
        //when we do not know the repition, we use while loop
        for(int i=0;i<10;i++)
        {
            System.out.println(i);
        }
        int i=10;
        while(i<20)
        {
            System.out.println(i);
            i++;
        }
        int j=30;
        do{
            System.out.println(j);
            j++;
        }while(j<40);
    }
    
}
