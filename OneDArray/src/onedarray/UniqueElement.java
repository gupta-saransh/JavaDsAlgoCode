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
public class UniqueElement {
     public static void main(String args[]){
     Scanner scn = new Scanner(System.in);
        int[] arr = {9,9,9,9,9,0};
        int em1=0;
        for(int i=0;i<arr.length;i++)
        {
            if(em1!=arr[i])
            {  
                break;
            }      
        }
        
        System.out.print(em1);
    
     }
}