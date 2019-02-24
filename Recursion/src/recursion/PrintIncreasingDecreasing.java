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
public class PrintIncreasingDecreasing {
    public static void main(String args[])
    {
    
    printincdec(5);
    
    }
           static void printincdec(int n)
            {
                if(n==0)
                {
                    return;
                }
                System.out.print(n); //pre code
                printincdec(n-1);
                System.out.print(n); // post code
            
            
            }
    
}
