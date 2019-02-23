/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bitmap;

import java.util.Scanner;

/**
 *
 * @author test
 */
public class Toggle {
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn= new Scanner(System.in);
       
        System.out.println("Enter Number");
        int num=scn.nextInt();
        
   
        System.out.println("Enter Bit to Check");
        int k=scn.nextInt();
        int bm=1<<k-1;
        
        if((num&bm)==0)
        {
          num=num|bm;
            
        }else
             num=num&(~bm);
        // use may use ^ (xor) for the same.
        System.out.println(num);
            
    
    }
    
    
}
