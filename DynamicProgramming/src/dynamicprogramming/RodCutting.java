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
//BAG IS ROD LENGTH, COST IS COST OF CUTTING,WEIGHT IS PARTS IN WHICH IT IS CUT
public class RodCutting {

    static int RC(int bag, int[] wts, int[] cost) {
        int[] strg = new int[bag + 1];
        strg[0] = 0;
        for (int i = 0; i <= bag; i++) {
            for (int j = 0; j < wts.length; j++) {
                if (i - wts[j] >= 0) {
                    strg[i] = Math.max(strg[i - wts[j]] + cost[j], strg[i]);
                }

            }
        }

        return strg[strg.length - 1];
    }
    static int RC2(int[] costs)
    {
        int[] strg= new int[costs.length];
        for(int i=0;i<strg.length;i++)
        {
        strg[i]=costs[i];
        int left=1;
        int right=i-1;
        while(left<=right)
        {
        
            if(strg[left]+strg[right]>=strg[i])
            {
            strg[i]=strg[left]+strg[right];
            }
            left++;
            right--;
        }
        
        }
                
    return strg[strg.length-1];
    
    }

    public static void main(String args[]) {

        int[] wts = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] cost = {0, 3, 5, 6, 15, 10, 25, 12, 24};

        System.out.print(RC(8, wts, cost));
        System.out.print(RC2( cost));

    }
}
