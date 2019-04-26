/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timenspace;

/**
 *
 * @author Saransh Gupta
 */
public class TimeNSpace {

    /**
     * @param args the command line arguments
     */
    static void merge(int[] one, int[] two, int[] merged) {
        int i = 0, j = 0, k = 0;
        while (i < one.length && j < two.length) {
            if (one[i] < two[j]) {
                merged[k] = one[i];
                i++;
                k++;

            } else {
                merged[k] = two[j];
                j++;
                k++;

            }

        }
        while (i < one.length) {
            merged[k] = one[i];
            i++;
            k++;
        }
        while (j < two.length) {
            merged[k] = two[j];
            j++;
            k++;
        }

    }

    static void mergedArrays(int[] arr, int s, int mid, int e) {

        int i = s, j = mid + 1, k = 0;
        int narr[] = new int[e - s + 1];
        while (i <= mid && j <= e) {

            if (arr[i] < arr[j]) {
                narr[k] = arr[i];
                k++;
                i++;

            } else {

                narr[k] = arr[j];
                k++;
                j++;
            }

        }
        while (i <= mid) {

            narr[k] = arr[i];
            k++;
            i++;
        }
        while (j <= e) {

            narr[k] = arr[j];
            k++;
            j++;
        }
        for (int l = 0; l < narr.length; l++) {
            arr[l + s] = narr[l];

        }
    }

    static int mergedArrays2(int[] arr, int s, int mid, int e) {
        int count = 0;
        int i = s, j = mid + 1, k = 0;
        int narr[] = new int[e - s + 1];
        while (i <= mid && j <= e) {

            if (arr[i] < arr[j]) {
                narr[k] = arr[i];

                k++;
                i++;

            } else {

                narr[k] = arr[j];
                k++;
                j++;
                count += mid - i + 1;      //Since all elements before mid(if replaced) will be inversions

            }

        }
        while (i <= mid) {

            narr[k] = arr[i];
            k++;
            i++;
        }
        while (j <= e) {

            narr[k] = arr[j];
            k++;
            j++;

        }
        for (int l = 0; l < narr.length; l++) {
            arr[l + s] = narr[l];

        }
        return count;
    }

    static void mergeSort(int[] merged, int sp, int ep) {

        if (sp == ep) {
            return;
        }
        int mid = (sp + ep) / 2;
        mergeSort(merged, sp, mid);
        mergeSort(merged, mid + 1, ep);
        mergedArrays2(merged, sp, mid, ep);
    }

    static int CountInversions(int[] merged, int sp, int ep) {      // value such that arr[i]>arr[j] and i<j;

        if (sp == ep) {
            return 0;
        }
        int mid = (sp + ep) / 2;
        int l1 = CountInversions(merged, sp, mid);
        int l2 = CountInversions(merged, mid + 1, ep);
        int l3 = mergedArrays2(merged, sp, mid, ep);

        return l1 + l2 + l3;
    }

    static int partioning(int arr[], int pivot) {
        int i = 0, p = 0;
        while (i != arr.length) {
            if (arr[i] >= pivot) {
                i++;

            } else if (arr[i] < pivot) {
                int temp = arr[i];
                arr[i] = arr[p];
                arr[p] = temp;
                i++;
                p++;

            }

        }
        return p - 1;
    }

    void moveZeroesToEnd(int arr[]) {
        int i = 0, p = 0;
        while (i != arr.length) {
            if (arr[i] == 0) {
                i++;

            } else {
                int temp = arr[i];
                arr[i] = arr[p];
                arr[p] = temp;
                i++;
                p++;

            }

        }

    }

    void moveNonZeroToEnd(int[] arr) {
        int i = arr.length - 1, p = arr.length - 1;
        while (i != 0) {
            if (arr[i] == 0) {
                i--;

            } else {
                int temp = arr[i];
                arr[i] = arr[p];
                arr[p] = temp;
                i--;
                p--;

            }

        }

    }

    void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    void Sort012(int arr[]) {   //Dutch National Flag Problem

        int o = 0;  //0's area
        int z = 0;  //1's area
        int t = 0;  //2's area
        while (t < arr.length) {
            if (arr[t] == 0) {
                t++;

            } else if (arr[t] == 1) {

                swap(arr, o, t);
                t++;
                o++;

            } else if (arr[t] == 2) {
                swap(arr, o, t);
                t++;
                swap(arr, z, o);
                z++;
                o++;
            }

        }

    }

    int partitioning2(int[] arr, int lo, int hi) {
        int i = lo;
        int p = lo;
        int pivot = arr[hi];
        while (i <= hi) {

            if (arr[i] <= pivot) {
                swap(arr, i, p);
                i++;
                p++;
            } else {

                i++;

            }
        }
        return p - 1;
    }

    void QuickSort(int arr[], int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int pi = partitioning2(arr, lo, hi);
        QuickSort(arr, lo, pi - 1);
        QuickSort(arr, pi + 1, hi);
    }

    int QuickSelect(int[] arr,int lo,int hi, int k) {

        
        int pi = partitioning2(arr, lo, hi);
        if(k==pi)
        {
        return arr[pi];
        }
        else if(k<pi){
       
          return QuickSelect(arr,0,pi-1,k);
        }
        else{
        return QuickSelect(arr,pi+1,hi,k);
        }
       
    
    }

    public static void main(String[] args) {
        TimeNSpace obj = new TimeNSpace();
        // TODO code application logic here
//        int[] one = {10, 20, 30, 40, 50};
//        int[] two = {11, 15, 19, 22, 28, 65, 67};
//        int merged[] = new int[one.length + two.length];
//
//        merge(one, two, merged);
//        for (int i = 0; i < merged.length; i++) {
//            System.out.print(merged[i] + " ");
//        }

        // int[] arr = {0, 0, 0, 0, 0, 12, 9, 0, 3, 11, 8, 1, 0, 7, 4};
        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        // System.out.print(CountInversions(arr, 0, arr.length - 1));
//        System.out.println(partioning(arr, 8));
        //obj.QuickSort(arr, 0, arr.length - 1);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
        System.out.print(obj.QuickSelect(arr, 0,arr.length-1, 3));
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
    }

}
