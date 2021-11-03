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
public class ArrayAndArrayList {
    public static void main(String [] args)
    {
        int a[]={10,20,30};
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
          ArrayList<Integer> list=new ArrayList<>();
          list.add(40);
          list.add(50);
          list.add(60);
          list.add(70);
          Iterator itr=list.iterator();
          while(itr.hasNext())
          {
              System.out.println("Numbers "+itr.next());
          }

       
        
        
    }
    
}
