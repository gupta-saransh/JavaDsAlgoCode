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
public class CountPalindromicSubsequence {
     

    static void CPS2(String str) {
        int[][] strg = new int[str.length()][str.length()];
    for(int gap=0;gap<strg.length;gap++)
    {
        for(int i=0,j=i+gap;j<strg[0].length;i++,j++)
        {
        
            
                        char c1 = str.charAt(i);
                        char c2 = str.charAt(j);
                        if (i == j) {
                            strg[i][j] = 1;
                        } else {
                            if (c1 == c2) {
                                strg[i][j] = strg[i][j - 1]+ strg[i + 1][j] +1;
                                   System.out.println(c1+" "+c2);
                             
                            } else {
                                strg[i][j] = strg[i][j - 1]+ strg[i + 1][j] -strg[i+1][j-1];
                                   System.out.println(c1+" "+c2);
                            }
                        }
        
        }
    
    }
       System.out.print(strg[0][strg[0].length - 1]);
}

   
    static void CPS(String str) {

        int[][] strg = new int[str.length()][str.length()];
        int n = 0;
        while (n < strg.length) {
            for (int i = 0; i < strg.length; i++) {
                for (int j = 0; j < strg[0].length; j++) {
                    if (i == j - n) {

                        char c1 = str.charAt(i);
                        char c2 = str.charAt(j);
                        if (i == j) {
                            strg[i][j] = 1;
                        } else {
                            if (c1 == c2) {
                                strg[i][j] = strg[i][j - 1]+ strg[i + 1][j] +1;
                                   //System.out.println(c1+" "+c2);
                             
                            } else {
                                strg[i][j] = strg[i][j - 1]+ strg[i + 1][j] -strg[i+1][j-1];
                                  // System.out.println(c1+" "+c2);
                            }
                        }

                    }
                }

            }
            n++;
        }
        System.out.print(strg[0][strg[0].length - 1]);

    }

    static public void main(String args[]) {

        String str = "abgcckyb";
        CPS2(str); //n^2
         CPS(str);  //n^3

    }
}
