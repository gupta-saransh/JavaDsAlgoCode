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
public class MinCostPath {

    static int mincost(int[][] cost) {

        int[][] strg = new int[cost.length][cost[0].length];
        for (int i= cost.length-1;i>=0; i--) {
            for (int j = cost[0].length-1;j>=0; j--) {

                if (i == strg.length - 1 && j == strg[0].length - 1) {
                    strg[i][j] = cost[i][j];
                } else if (i == strg.length - 1) {
                    strg[i][j] = cost[i][j] + strg[i][j + 1];

                } else if (j == strg[0].length - 1) {
                    strg[i][j] = cost[i][j] + strg[i + 1][j];
                } else {
                    strg[i][j] = cost[i][j] + Math.min(strg[i + 1][j], strg[i][j + 1]);

                }

            }

        }
        minpath(strg,0,0,"");
        return strg[0][0];
    }
    static void minpath(int[][] strg,int i,int j,String psf)
    {
    
    

                if (i == strg.length - 1 && j == strg[0].length - 1) {
                  System.out.println(psf);
                  return;
                  
                } else if (i == strg.length - 1) {
                    minpath(strg, i, j+1, psf+"h");

                } else if (j == strg[0].length - 1) {
                   minpath(strg, i+1, j, psf+"v");
                } else {
                 
                    int mymin=Math.min(strg[i][j+1], strg[i+1][j]);
                    if(mymin==strg[i][j+1])
                    {
                    minpath(strg, i, j+1, psf+"h");
                    }
                    if(mymin==strg[i+1][j])
                    {
                    
                    minpath(strg, i+1, j, psf+"v");
                    }
                }

            }

        
       
    
    

    public static void main(String args[]) {
        int arr[][] = {
            {2, 6, 5, 1, 3, 4},
            {0, 4, 9, 2, 9, 0},
            {4, 8, 1, 0, 6, 5},
            {3, 3, 3, 1, 5, 4},
            {1, 2, 7, 0, 6, 9},
            {5, 7, 1, 3, 8, 2}

        };
        System.out.print(mincost(arr));
}
}
     

