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
public class Pattern4 {
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        for(int i=0;i<n;i++)
        {
        for(int j=n;j>i;j--)
            System.out.print(" ");
        
        for(int k=0;k<(2*i+1);k++)
            System.out.print("*");
        
        System.out.println(" ");
        }
       
}
}
