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
public class Pattern1 {
    
    public static void pattern(int r,int c,int n)
    {
        if(r==n)
            return;
    if(c>r)
       { 
           System.out.println();
       pattern(r+1,0,n);
       return;
       }
    
       System.out.print("*");
       pattern(r,c+1,n);
       
    }
//    public static void pattern(int r,int c,int n)
//    {
//        if(r==n)
//            return;
//    if(c<r)
//       { 
//           System.out.println();
//       pattern(r,c+1,n);
//       return;
//       }
//    
//       System.out.print("*");
//       pattern(r,0,n);
//       
//    }
    
    
    
    
    
    public static void main(String args[])
    {
    pattern(0,0,4);
    }
    
    
}
