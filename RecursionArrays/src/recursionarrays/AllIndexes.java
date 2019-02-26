/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionarrays;

/**
 *
 * @author test
 */
public class AllIndexes {
    public static int[] aindex(int a[],int sp,int data,int n)
    {
       
           if(sp==a.length)
            return new int[n];
    
         if(a[sp]==data)
            n++;
        
        int fisa[]=aindex(a,sp+1,data,n);
        if(a[sp]==data)
        {fisa[n-1]=sp;
        n--;
        }        
        return fisa;
    
    }
    public static void main(String args[])
    {
    int a[]={2,11,3,11,11,9,7,4,10};
    
        int[] res= aindex(a,0,11,0);
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+ " ");
        }
    
    }
}
