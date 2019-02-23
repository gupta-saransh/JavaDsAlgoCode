/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.Scanner;

/**
 *
 * @author test
 */
public class Fibbonacci {
    
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();
    int fib=0,sum=0;
    
    for(int i=1;i<=n;i++)
    {
     sum=sum;
    fib+=fib+sum;
           
    //1 1 2 3 5 8 13 
    System.out.println(sum);
    }
        
    
    
    
    }
    
}
