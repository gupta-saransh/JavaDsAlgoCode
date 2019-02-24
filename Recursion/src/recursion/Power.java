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
public class Power {
    static int power(int x,int n)
    {
        if(n==0)
        {
            return 1;
        }
        int val=0,val1=0;
    
        val=power(x,n-1);
        val1=val*x;
        return val1;
    }
    
    public static void main(String args[])
    {
    System.out.print(power(2,3));
    
    
    }
}
