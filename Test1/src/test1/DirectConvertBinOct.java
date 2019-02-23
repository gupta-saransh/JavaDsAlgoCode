/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.Scanner;

/**
 *
 * @author test
 */
public class DirectConvertBinOct {
   static int convert(int srcN,int srcB,int desB)
    {
        
        int rem=0,desN=0,pow=1;
        while(srcN!=0)
        {
            rem=srcN%desB;
            desN+=rem*pow;
            srcN=srcN/desB;
            pow=pow*srcB;            
         }
    
    return desN;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int bin=scn.nextInt();
        int count=0,rem=0,pair=0,pow=1,pair1=0;
        while(bin!=0){
        pair=bin%1000;
        bin=bin/1000;
        pair=convert(pair,2,10);
        pair1+=pair*pow;
       
        pow=pow*10;
        
        }
        System.out.println(pair1);
    }
    
}
