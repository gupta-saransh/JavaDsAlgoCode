/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

import java.util.Scanner;

/**
 *
 * @author test
 */
public class Pattern3 {
    
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        
        int fin1=0,fin2=1,fib=0,sum=0;
        for(int i=0;i<=n;i++)
        {
     for(int j=0;j<i;j++)
     {
         System.out.print(sum);
            sum=fin1+fin2;
            fin2=fin1;
            fin1=sum;
            
           
     }
     System.out.println(" ");
        
        }
    
     }}
