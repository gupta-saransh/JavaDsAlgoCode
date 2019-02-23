/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.Scanner;

/**
 * @author test
 **/

public class genConverter {
    
    int convert(int srcN,int srcB,int desB)
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
         genConverter ob = new genConverter();
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Source Number");
        int srcN=scn.nextInt();
        System.out.print("Enter Source Base");
        int srcB=scn.nextInt();
        System.out.print("Enter Destination Base");
        int desB=scn.nextInt();
        int findec=0,fin=0;
        
//        fin=ob.convert(srcN, srcB,desB);
//        findec=ob.convert(srcN,srcB,10);
//        if(srcB==8)
//        { 
//        if(desB==2)
//        fin=ob.convert(findec,10, desB);
//       
//        }
//        else if(desB==8)
//        {
//        if(srcB==2)
//         fin=ob.convert(findec,10, desB);
//        }
        
        if(srcB!=10)
        {
            srcN=ob.convert(srcN,srcB, 10);
            srcB=10;
        
        }
     fin=ob.convert(srcN,srcB,desB);
        System.out.println(fin);
        
     }
}
