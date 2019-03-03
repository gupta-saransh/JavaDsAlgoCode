/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionarraylist;

/**
 *
 * @author test
 */
public class PrintStairPath {
    public static void psp(int n,String psf)
    {
    if(n==0)
    {
        System.out.print(psf);
        return;
    }
    
        for (int i = 1; i <=3 && n>0; i++) {
            psp(n-i,psf+i);
        }
    }
    public static void main(String args[])
    {
    
        psp(7," ");
        
    }
    
}
