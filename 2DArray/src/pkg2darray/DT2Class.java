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
public class DT2Class {
    public static void main(String args[])
    { int a[][] = new int[6][6];
    Scanner scn = new Scanner(System.in);
    for(int i=0;i<a.length;i++)
        for(int j=0;j<a[0].length;j++)
            a[i][j]= 10*i +j;
    
    for(int gap=0;gap<a.length;gap++)
    {   int j=0;
        int i=j+gap;
        
        int count=1;
        while(count<=a.length-gap)
        {   System.out.print(a[i][j] +" ");
        i++;
        j++;
        count++;
        }
        System.out.println();
    }
    }
}
