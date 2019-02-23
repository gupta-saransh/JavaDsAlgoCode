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
public class KadenMaxSumSubArray {
     public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
        int[] arr = {2,3,-1,4,-13,2,18};
        int i=1,ce=0,cs=0,ms=0,me=0,max=0,Csum=0;
        max=Csum=arr[0];
               
        while(i<arr.length)
        {
                Csum+=arr[i];
                ce=i;
                if(arr[i]>Csum)
                {
                    Csum=arr[i];
                    cs=i;
                
                }
                if(max<Csum)
                { max=Csum;
                ms=cs;
                me=ce;
                }
                i++;
        
        }
    System.out.println("Max Sum "+ max);
    System.out.print("Sub Array is: ");
    for(int j=ms;j<=me;j++)     
       System.out.print(arr[j] + " ");
          
}
}
