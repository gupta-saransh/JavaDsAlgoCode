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
public class LastIndex {
    public static int lindex(int a[],int sp,int data)
    {
        if(sp==a.length)
            return -1;
         
        int fisa=lindex(a,sp+1,data);
        if(fisa==-1)   
        {
            if(a[sp]==data)
            return sp;
        }
      
            return fisa;
    }
    public static void main(String args[])
    {
        int a[]={1,2,3,5,4,3};
        System.out.print(lindex(a,0,3));
    
    }
}
