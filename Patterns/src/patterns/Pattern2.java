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
public class Pattern2 {
     public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int k=1;
        for(int i=0;i<=n;i++)
        {
        for(int j=0;j<i;j++)
        { System.out.print(k+" ");
        
             
        k++;
        }
        
        System.out.println("");
            
        
        }
    
}
}
