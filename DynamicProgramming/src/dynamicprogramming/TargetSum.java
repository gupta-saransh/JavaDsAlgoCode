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
public class TargetSum {

   static void print(int[] arr,int i,int j,boolean[][] ans,String psf){
    
        
        if(j==0)
        {
            System.out.println(psf);
            return;
        
        }
        else if(i==0)
        {
        return;
        }
        else
        {
            if(ans[i-1][j]==true)
                print(arr,i-1,j,ans,psf);
            
            if(j>=arr[i-1] && ans[i-1][j-arr[i-1]]==true)
                print(arr,i-1,j-arr[i-1],ans,psf+" "+arr[i-1]);
        
        }
    
    
    }
    
    static void target(int[] arr, int tar) {

        boolean[][] ans = new boolean[arr.length + 1][tar + 1];

        for (int i = 0; i < ans.length; i++) {

            for (int j = 0; j < ans[0].length; j++) {
                if (i == 0 && j == 0) {
                    ans[i][j] = true;
                } else if (i == 0) {
                    ans[i][j] = false;
                } else if (j == 0) {

                    ans[i][j] = true;
                } else {
                    if (ans[i - 1][j] == true) {
                        ans[i][j] = true;
                    } else if (j >= arr[i - 1] && ans[i - 1][j - arr[i - 1]] == true) {
                        ans[i][j] = true;
                    }

                }

            }
        }
        print(arr, ans.length-1,ans[0].length-1, ans, " ");


    }

    public static void main(String args[]) {

        int[] arr = {2, 5, 3, 1, 6};
        int tar = 9;
        target(arr, tar);

    }

}
