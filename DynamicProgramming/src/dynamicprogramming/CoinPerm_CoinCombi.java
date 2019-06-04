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
public class CoinPerm_CoinCombi {

    static int coinperm(int[] arr, int n) {

        int[] ans = new int[n + 1];
        ans[0] = 1;
        for (int i = 0; i < ans.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                int jump = i - arr[j];

                if (jump >= 0) {
                    ans[i] += ans[jump];

                }

            }
        }

        return ans[ans.length - 1];
    }

    static int coincombicount(int[] arr, int n) {

        int[] ans = new int[n + 1];
        ans[0] = 1;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < ans.length; i++) {

                int jump = i - arr[j];

                if (jump >= 0) {
                    ans[i] += ans[jump];

                }

            }
        }

        return ans[ans.length - 1];
    }

    public static void main(String args[]) {
        int arr[] = {2, 3, 5, 6};
        int n = 7;
        System.out.print(coinperm(arr, n));
        System.out.print(coincombicount(arr, n));

    }
}
