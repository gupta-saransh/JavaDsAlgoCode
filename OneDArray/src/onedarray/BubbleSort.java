/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onedarray;

/**
 *
 * @author test
 */
public class BubbleSort {
    public static void main(String args[])
    {
    int a[] = {9,8,7,6,5,4};
    int temp;
    
   for(int i=0;i<a.length;i++)  // For Repeated Iteration
   {
       for(int j=0;j<a.length-i-1;j++)   //For Swapping
       {
           if(a[j]>a[j+1])
           {
               temp=a[j+1];
               a[j+1]=a[j];
               a[j]=temp;
           
           }
       
       }
   
   }
   for(int i=0;i<a.length;i++)
       System.out.print(a[i]);
    
    }
}
