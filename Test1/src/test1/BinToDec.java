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
public class BinToDec {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int pow=1,dec=0,rem=0;
        System.out.println("Enter binary No. ");
        int bin=scn.nextInt();
        while(bin!=0)
        {
            rem=bin%10;
            dec+= rem*pow;
            bin=bin/10;
            pow= pow*2;
        
        
        }
        System.out.print(dec);
        
    
    }
}
