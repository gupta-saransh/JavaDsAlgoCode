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
public class CountPalindromicSubstring {

    static void CPSs(String str) {

        boolean[][] strg = new boolean[str.length()][str.length()];
        int counter = 0;
        int length=0;
        for (int gap = 0; gap < strg.length; gap++) {

            for (int i = 0, j = i + gap; j < strg[0].length; i++, j++) {
                char c1 = str.charAt(i);
                char c2 = str.charAt(j);
                if (gap==0) {
                    strg[i][j] = true;
                } else if (gap == 1) {
                    if (c1 == c2) {
                        strg[i][j] = true;
                    }
                } else {
                    if (c1 == c2) {
                        if (strg[i + 1][j - 1] == true) {
                            strg[i][j] = true;

                        } else {
                            strg[i][j] = false;
                        }

                    } else {
                        strg[i][j] = false;
                    }
                }
                if(strg[i][j]==true)
                    length=gap+1;
            }

        }
        for (int i = 0; i < strg.length; i++) {
            for (int j = 0; j < strg[0].length; j++) {
                System.out.print(strg[i][j] + "\t\t");
                if (strg[i][j] == true) {
                    counter++;
                }
            }
            System.out.println();
        }

        System.out.print(counter+"length: "+length);
    }

    public static void main(String args[]) {
        String str = "abccbc";
        CPSs(str);
    }

}
