/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */

package test1;
import java.util.*;
/**
 *
 * @author test
 */
public class Test1 {

    /**
     * @param args the command line arguments
     */
    //Decimal To Binary
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Decimal Number");
        int dec=scn.nextInt();
        int bin=0,rem=0;
        int pow =1;
        while(dec!=0)
        {
            rem=dec%2;
            bin+= rem*pow;
            dec=dec/2;
            pow= pow*10;
        }
        System.out.println(bin);
        
    }
    
}
