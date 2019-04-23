/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TextProcessing;

/**
 *
 * @author Saransh
 */
public class ZAlgorithm {

   static void populate(String str, int[] zarr) {
        int i = 1, r = 0, l = 0;

        while (i < zarr.length) {

            if (i > r) {
                l = r = i;
                while (r < zarr.length && str.charAt(r) == str.charAt(r - l)) {
                    r++;
                }
                r--;
                zarr[l] = r - l + 1;

            } else {
                int k = i - l;
                if (zarr[k] < r - i + 1) {

                    zarr[i] = zarr[k];

                } else {
                    l = i;
                    while (r < zarr.length && str.charAt(r) == str.charAt(r - l)) {
                        r++;
                    }
                    r--;
                    zarr[l] = r - l + 1;

                }

            }
            i++;
        }
    }

   static void ZAlgo(String src, String pat) {
        String concat =  pat+"#"+src;
        int[] zarr = new int[concat.length()];
        populate(concat, zarr);

        for (int i = 0; i < concat.length(); i++) {

            if (zarr[i] == pat.length()) {
                System.out.print(i-pat.length()-1+" ");

            }

        }

    }

    public static void main(String args[]) {
        
        ZAlgo("abb abb","abb");

    }

}
