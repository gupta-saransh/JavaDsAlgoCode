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
public class DisplayRev {
     public static void displayr(int a[],int sp)
    {
        if(sp==a.length)
        {   return;}
       
        displayr(a,sp+1);
         System.out.print(a[sp]);
    
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={1,2,3,4,5};
        displayr(a,0);
        
    }
}
