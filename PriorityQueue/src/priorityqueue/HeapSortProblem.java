/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityqueue;

/**
 *
 * @author test
 */
public class HeapSortProblem {
    static int get(int[] a,int[] b,int i)
    {
        if(i<a.length)
        {
            return a[i];
        }
        else
        {
        return b[i-a.length];
        }
        
    
    }
    static void set(int[] a,int[] b,int i, int val)
    {
    
        if(i<a.length)
        {
            a[i]=val;
        }
        else
        {
        b[i-a.length]=val;
        }
    
    
    }
    static void swap(int[] a,int[] b,int i,int j)
    {
        int ith=get(a,b,i);
        int jth=get(a,b,j);
        set(a,b,i,jth);
        set(a,b,j,ith);
    
    }
    static void downheapify(int a[],int[] b, int pi, int sz) {

        int lci = 2 * pi + 1;
        int rci = 2 * pi + 2;

        int max = pi;

        if (lci < sz && get(a,b,lci) > get(a,b,max)) {
            max = lci;
        }
        if (rci < sz && get(a,b,rci) > get(a,b,max)) {
            max = rci;
        }
        if (max != pi) {
            swap(a,b,max,pi);
            downheapify(a,b, max, sz);

        }

    }

    static void heapsort(int a[],int b[]) {
        for (int i = a.length+b.length / 2 - 1; i >= 0; i--) {
            downheapify(a,b, i, a.length+b.length);
        }
        int cse = 0;
        while (cse < a.length+b.length) {
            swap(a,b,0,a.length+b.length-1-cse);
            cse++;
            downheapify(a,b, 0, a.length+b.length - cse);

        }

    }

    

    public static void main(String args[]) {

        int a[]={5,19,3};
        int b[]={0,16,12,4,-4};
        heapsort(a,b);

        for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");
        }
        System.out.println();
        for(int k=0;k<b.length;k++)
        {
            
            System.out.print(b[k]+" ");
        }

    }
    
}
