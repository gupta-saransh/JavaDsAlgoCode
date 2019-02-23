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
public class PrintBits {
    public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    
      System.out.println("Enter Number");
        int num=scn.nextInt();
        int k=32;
        for(int i=0;i<32;i++)
        {
            int bm=1<<k-1;
            if((num&bm)==0){
            System.out.print(0);  
            }
            else
            System.out.print(1);    
       k--;
    }
    }
}
