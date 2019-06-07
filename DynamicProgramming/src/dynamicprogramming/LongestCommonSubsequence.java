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
public class LongestCommonSubsequence {

    static int LCS(int arr1[], int arr2[]) {
        int[][] strg = new int[arr1.length + 1][arr2.length + 1];

        for (int i = strg.length - 1; i >= 0; i--) {

            for (int j = strg[0].length - 1; j >= 0; j--) {

                if (i == strg.length - 1 || j == strg.length - 1) {
                    strg[i][j] = 0;
                } else {

                    if (arr1[i] == arr2[j]) {
                        strg[i][j] = strg[i + 1][j + 1] + 1;

                    } else {

                        strg[i][j] = Math.max(strg[i + 1][j], strg[i][j + 1]);

                    }

                }

            }

        }

        return strg[0][0];

    }

//    static void LCS_Path(int[] arr1,int[] arr2,int i,int j,String psf){
//    
//        
//        if()
//    
//    
//    
//    }
    public static void main(String args[]) {

        int arr1[] = {1, 2, 3, 4};
        int arr2[] = {1, 5, 2, 4};
        System.out.print(LCS(arr1, arr2));

    }

}
