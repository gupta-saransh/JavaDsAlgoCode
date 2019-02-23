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
public class LinearSearch {
    
    public static void main(String args[])
    {
    Scanner scn= new Scanner(System.in);
        System.out.println("Enter Size Of Array");
        int size=scn.nextInt();
        int flag=0;
        int[] arr = new int[size];
        for(int i=0;i<arr.length;i++)
        {  
            System.out.println("Enter " + i+ " Number");
            arr[i]=scn.nextInt();     
        }
        System.out.println("Enter Value to be searched");
        int element=scn.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==element)
            {  
                System.out.println("Element Found");
                flag=1;
            }       
        
        }
        if(flag==0)
            System.out.println("Element Not Found");
        
        
    }
    
}
