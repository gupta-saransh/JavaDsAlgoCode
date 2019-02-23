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
public class MaxElement {
    
    public static void main(String args[])
    {
    Scanner scn= new Scanner(System.in);
    
    System.out.println("Enter Size Of Array");
        int size=scn.nextInt();
        
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++)
        {  
            System.out.println("Enter " + i+ " Number");
            arr[i]=scn.nextInt();     
        }
        
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {  
                max=arr[i];
            }       
        
        }
    
        System.out.println("Maximum Element is: "+ max);
    }
    
    
}
