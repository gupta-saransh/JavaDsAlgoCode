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
public class DT5Class {
        public static void main(String args[])
    { int a[][] = new int[6][6];
    Scanner scn = new Scanner(System.in);
    for(int i=0;i<a.length;i++)
        for(int j=0;j<a[0].length;j++)
            a[i][j]= 10*i +j;
    int t=1;                                    //For toggling
    for(int gap=-a.length+1;gap<a.length;gap++)
    {   int count=1;
        int j=0;
        int i=0;
        int total=a.length-Math.abs(gap);
        j=gap<0?0:gap+i;
        i=gap<0?j-gap:0;
       if(t<0)
       { 
           j=j+total-1;
           i=i+total-1;
       }
        while(count<=a.length-Math.abs(gap))
        { 
            System.out.print(a[i][j] +" ");
        i=i+t;
        j=j+t;
        count++;
        
        }
        t=-t;
        System.out.println();
    }
  
   
}
}
