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
public class ArrayInverse {
    public static void main(String args[]){
     Scanner scn = new Scanner(System.in);
        int[] arr = {3,0,1,2,4};
        int[] brr= new int[5];
        for(int i=0;i<arr.length;i++)
        {
            brr[arr[i]]=i;
          
        }
        for(int i=0;i<brr.length;i++)
            System.out.print(brr[i]);
    
}
}
