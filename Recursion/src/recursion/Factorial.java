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
public class Factorial {
   static int factorial(int n){
        int val=1,val1;
        if(n==0)
        return 1;
    
        val1=factorial(n-1);
        val=val1*n;
        return val;
    }
    public static void main(String args[])
    {
        System.out.print(factorial(5));
    
    }
    
}
