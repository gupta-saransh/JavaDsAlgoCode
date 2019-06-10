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
public class MinimumPalindromicCuts {

    static void MPS(String str) {
        int[][] strg = new int[str.length()][str.length()];
        for (int gap = 0; gap < strg.length; gap++) {

            for (int i = 0, j = i + gap; j < strg.length; i++, j++) {
                char c1 = str.charAt(i);
                char c2 = str.charAt(j);
                if (gap == 0) {
                    strg[i][j] = 0;
                } else if (gap == 1) {
                    if (c1 == c2) {
                        strg[i][j] = 0;

                    } else {
                        strg[i][j] = 1;
                    }
                } else if (c1 == c2) {
                    if (strg[i + 1][j - 1] == 0) {
                        strg[i][j] = 0;
                    }
                } else {
//                    int ii = 0;
//                    int jj = 0;
//                    int min = str.length();
//
//                    for (int k = 0; k < gap; k++) {
//
//                        min = Math.min(strg[i][ii] + strg[ii + 1][j], min);
//
//                        ii++;
//                        jj++;
                     // strg[i][j] = min + 1;
            //}
                    if (c1 == c2) {
                        if (strg[i + 1][j - 1] == 0) {
                            strg[i][j] = 0;
                        }
                    } else {
                        int min = str.length();
                        for (int k = 0; k < gap; k++) {
                            int lhs = strg[i][j - gap + k];
                            int rhs = strg[i + 1 + k][j];

                            min = Math.min(lhs + rhs, min);

                        }
                        strg[i][j] = min + 1;
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
        System.out.print(strg[0][strg.length - 1]);
    }

    public static void main(String args[]) {
        String str = "abccbc";
        MPS(str);
    }
}
