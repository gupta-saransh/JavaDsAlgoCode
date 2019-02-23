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
public class MirrorInverse {
     public static void main(String args[]){
     Scanner scn = new Scanner(System.in);
        int[] arr = {0,1,2,3,4};
        int[] brr= new int[5];
        int flag=0;
        for(int i=0;i<arr.length;i++)
        {
            brr[arr[i]]=i;
          
        }
        for(int i=0;i<brr.length;i++)
        { 
            if(arr[i]!=brr[i])
            {   System.out.println("Not a mirror Inverse");
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("Is a mirror Inverse");
        
}
    
}
