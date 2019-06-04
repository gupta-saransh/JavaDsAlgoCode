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
public class DynamicProgramming {

    /**
     * @param args the command line arguments
     *
     *
     */
    static public int minJumps(int[] jumpsrc) {

        int[] strg = new int[jumpsrc.length];
        strg[0] = 0;
        for (int s = 1; s < jumpsrc.length; s++) {

            int min = Integer.MAX_VALUE;
            for (int js = 1; js <= jumpsrc[s]; js++) {
                int i = s - js;
                if (i >= 0) {

                    if (jumpsrc[s] == 0) {
                        strg[i] = -1;
                        break;
                    }
                    if (strg[i] == -1) {
                        continue;
                    } else if (min > strg[i]) {
                        min = strg[i];
                    }

                }

            }

            if (min != Integer.MAX_VALUE) {
                strg[s] = min + 1;
            } else {
                strg[s] = -1;
            }
        }

        for (int i = 0; i < strg.length; i++) {
            System.out.print(strg[i] + " ");
        }

        return strg[strg.length - 1];

    }

    public static void main(String[] args) {

        // TODO code application logic here
        int jrc[] = {0, 2, 3, 2, 2, 0, 2, 0, 2, 4};
        System.out.print(minJumps(jrc));
    }

}
