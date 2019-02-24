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
public class PDISkip {
     public static void main(String args[])
    {
    
    printincdecskip(5);
    
    }
           static void printincdecskip(int n)
            {
                if(n==0)
                {
                    return;
                }
                if(n%2==1)
                System.out.print(n); //pre code
                printincdecskip(n-1);
                if(n%2==0)
                System.out.print(n); // post code
            
            
            }
    
}
