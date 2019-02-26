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
public class FindElementSmart {
    public static boolean fsmart(int a[],int sp,int data)
    {
        if(sp==a.length)
            return false;
        
        if(a[sp]==data)
            return true;
        
        boolean fisa=fsmart(a,sp+1,data);
        return fisa;
        
    }
    public static void main(String args[])
    {
        int a[]={1,2,3,5,4};
        System.out.print(fsmart(a,0,3));
    
    
    
    }
    
}
