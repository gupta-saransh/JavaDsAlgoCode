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
public class RecursionArrays {

    /**
     * @param args the command line arguments
     */
    public static void display(int a[],int sp)
    {
        if(sp==a.length)
        {   return;}
        System.out.print(a[sp]);
        display(a,sp+1);
    
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={1,2,3,4,5};
        display(a,0);
        
    }
    
}
