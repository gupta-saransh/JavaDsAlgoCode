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
public class MaxElement {
      public static int max(int a[],int sp)
    {  
    
        if(sp==a.length-1)
            return a[sp];
        
        
       int m=max(a,sp+1);
         if(m<a[sp])
            m=a[sp];
         
         
        return m;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={1,2,3,5,4};
       System.out.print( max(a,0));
        
    }
    
}
