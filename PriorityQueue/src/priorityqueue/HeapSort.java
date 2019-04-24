/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityqueue;

/**
 *
 * @author Saransh
 */
public class HeapSort {

    static void downheapify(int list[], int pi, int sz) {

        int lci = 2 * pi + 1;
        int rci = 2 * pi + 2;

        int max = pi;

        if (lci < sz && list[lci] > list[max]) {
            max = lci;
        }
        if (rci < sz && list[rci] > list[max]) {
            max = rci;
        }
        if (max != pi) {
            int temp = list[pi];
            list[pi] = list[max];
            list[max] = temp;
            downheapify(list, max, sz);

        }

    }

    static void heapsort(int arr[]) {
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            downheapify(arr, i, arr.length);
        }
        int cse = 0;
        while (cse < arr.length) {
            int re = arr[0];
            arr[0] = arr[arr.length - 1 - cse];
            arr[arr.length - 1 - cse] = re;
            cse++;
            downheapify(arr, 0, arr.length - cse);

        }

    }

    

    public static void main(String args[]) {

        int arr[] = {5, 2, 1, 6, 7, 9, 50, 100, 25, 900, 899};

        heapsort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
