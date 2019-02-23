/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onedarray;

import java.util.Scanner;

/**
 *
 * @author test
 */
public class SubArrays {
     public static void main(String args[]){
     Scanner scn = new Scanner(System.in);
        int[] arr = {3,0,1,2,4};
        
        int n=1;
//        for(int i=0;i<arr.length;i++)
//        {
//           for(int j=0;j<i+1;j++)
//           {
//           
//           System.out.print(arr[j] + " ");
//          
//           }
//          System.out.println();
//         
//        }
        int i=0,j=0;
        while(i<arr.length)
        {
            j=0;
        while(j<i+1)
        {
        System.out.print(arr[j]);
        j++;
        }
        System.out.println();
        i++;
        }
        
        
        
}
    
}
