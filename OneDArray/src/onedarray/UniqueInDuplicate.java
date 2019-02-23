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
public class UniqueInDuplicate {
    public static void main(String args[])
    {
    Scanner scn = new Scanner(System.in);
    int a[]={1,2,3,3,2,1,0,0,7};
    int sum=0;
    int b[] = new int[a.length];   
    for(int i=0;i<a.length;i++)
    {
    sum^=a[i];
    
    }
    System.out.print(sum);
    
    }
    
}
