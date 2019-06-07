/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicprogramming;

/**
 *
 * @author Saransh Gupta
 */
public class LongestIncreasingSubsequence {

    static int LIS(int arr[]) {

        int strg[] = new int[arr.length];
        strg[0] = 1;
        for (int i = 1; i < arr.length; i++) {

            for (int j = 0 ; j <i; j++) {
                if (arr[i] >= arr[j]) {

                    if (strg[i] < strg[j]) {
                        strg[i] = strg[j];
                    }
                   

                }

            }
            strg[i]++;
        }
        int max=0;
        for (int i = 0; i < strg.length; i++) {
            if(max<strg[i])
                max=strg[i];
            //System.out.print(strg[i] + " ");
            
            
        }
        for (int i = 0; i < strg.length; i++) {
            if(max==strg[i])
                LIS_PATH(strg, arr, i, "");
               
            
            
        }
        
        return 0;
    }
    
    static void LIS_PATH(int[] strg,int[] arr, int i,String psf){
        
        if(strg[i]==1)
       {
       System.out.println(psf);
       return;
       }
        for(int j=0;j<i;j++)
        {
        
            if(arr[j]<arr[i])
            {
            
            if(strg[j]==strg[i]-1)
                LIS_PATH(strg, arr, j, psf+arr[j]+" ");
            }
            
            
        }
    
    
    }
    
    

    public static void main(String args[]) {

        int arr[] = {10, 22, 9, 33, 21, 50, 41, 60, 80, 1};

        LIS(arr);
    }

}
