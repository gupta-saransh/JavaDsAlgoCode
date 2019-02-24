/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author test
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        pi(5);
        System.out.println();
        
    }
   static public void pi(int n)
    {
        if(n==0)
        {
            return;
        }
        pi(n-1);
    System.out.print(n);
   
   
    }
   static public void pd(int n)
    {
        if(n==0)
        {
            return;
        }
    System.out.print(n +" ");
    pd(n-1);
    }
    
    
}
