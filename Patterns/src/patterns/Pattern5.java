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
public class Pattern5 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int n1=0;
        for(int i=0;i<=n;i++)
        {
        for(int j=n;j>i;j--)
            System.out.print(" ");
        
       for(int k=i;k<i+n1;k++)
        System.out.print(k);
       
       for(int l=i+n1-1;l>i;l--)
           System.out.print(l-1);
       
        System.out.println(" ");
       n1++;
        }
        
        
        
       
}
    
}
