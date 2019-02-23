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
public class RotateArray {
    
    static void rotate(int a[],int low,int high)
    {
        int temp;
        while(low<high)
        {
        temp=a[high];
        a[high]=a[low];
        a[low]=temp;
        low++;
        high--;
        
        }
      
    }
    
    public static void main(String args[])
    {
    Scanner scn = new Scanner(System.in);
    int a[]={1,2,3,4,5,6,7};
    System.out.print("Enter Rotation Factor");
    int rf=scn.nextInt();
    
       rotate(a,0,a.length-rf-1);
         
       rotate(a,a.length-rf,a.length-1);
          
       rotate(a,0,a.length-1);
    for(int i=0;i<a.length;i++)
    System.out.print(a[i]);
    
    }
}
