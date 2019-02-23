/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2darray;

import java.util.Scanner;

/**
 *
 * @author test
 */
public class DT5Self {
       public static void main(String args[])
    { int a[][] = new int[3][3];
    Scanner scn = new Scanner(System.in);
    for(int i=0;i<a.length;i++)
        for(int j=0;j<a[0].length;j++)
            a[i][j]= 10*i +j;
     int flag=1;
    for(int gap=-a.length+1;gap<a.length;gap++)
    {   int count=1;
        int j=0;
        int i=0;
        
       
       if(flag==1)
       {
           j=gap<0?0:gap+i;
       i=gap<0?j-gap:0;
        while(count<=a.length-Math.abs(gap))
        { 
            System.out.print(a[i][j] +" ");
        i++;
        j++;
        count++;
        flag=0;
        }
       }else
       {
           j=j+a.length-Math.abs(gap)-1;
       i=i+a.length-Math.abs(gap)-1;
       while(count<=a.length-Math.abs(gap))
        { 
            System.out.print(a[i][j] +" ");
        i--;
        j--;
        count++;
        flag=1;
        }
       }
        System.out.println();
    }
   
  
   
    
}
}