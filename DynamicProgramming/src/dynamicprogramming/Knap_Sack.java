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
public class Knap_Sack {

    static int KS(int[] wts, int[] cost, int bag) {

        int[][] strg = new int[wts.length + 1][bag + 1];

        for (int i = 0; i < strg.length; i++) {
            for (int j = 0; j < strg[0].length; j++) {

                if (i == 0 && j == 0) {
                    strg[i][j] = 0;

                } else if (i == 0) {
                    strg[i][j] = 0;

                } else if (j == 0) {
                    strg[i][j] = 0;

                } else {

                    if (wts[i - 1] <= j) {

                        strg[i][j] = Math.max(cost[i - 1] + strg[i - 1][j - wts[i - 1]], strg[i - 1][j]);

                    } else {

                        strg[i][j] = strg[i - 1][j];

                    }

                }

            }
        }
        for (int i = 0; i < strg.length; i++) {
            for (int j = 0; j < strg[0].length; j++) {
                System.out.print(strg[i][j] + "\t\t");
            }
            System.out.println();
        }
        return strg[strg.length - 1][strg[0].length - 1];
    }

    static int KS_Unbounded(int[] wts, int[] cost, int bag) {

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

    public static void main(String args[]) {

        int[] wts = {2, 5, 1, 3, 4};
        int[] cost = {15, 14, 10, 45, 30};
        //System.out.print(KS(wts, cost, 7));
        System.out.print(KS_Unbounded(wts, cost, 7));

    }

}
