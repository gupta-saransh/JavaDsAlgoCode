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
public class BinarySearch {
    
   static int bsearch(int low,int arr[],int high,int element)
    {
       int mid; 
    while(high>low)
    {
    mid=(high+low)/2;
    if(element ==arr[mid])
        return mid;
    else if(element>arr[mid])
        low=mid+1;
    else
        high=mid-1;   
    
    
    }
    return -1;
    }
    
    
   
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
        System.out.println("Enter Value to be searched");
        int element=scn.nextInt();
        int ans=bsearch(0,arr,arr.length,element);
        if(ans==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at "+ ans+ " Index");
    
    
    }
    
}
