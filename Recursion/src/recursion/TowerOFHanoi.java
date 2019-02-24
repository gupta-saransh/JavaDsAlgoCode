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
public class TowerOFHanoi {
    private static void toh(char s,char d,char h,int n)
    {
        if(n==0)
            return;
        toh(s,h,d,n-1); //faith-shift n-1 discs from source to helper using helper
        System.out.println(n+" " +s+" "+d); //shift  one remaining disc
        toh(h,d,s,n-1); //shift remaining disc 
        
    }
    public static void main(String args[])
    {
            toh('s','d','h',3);
    
    }
}
