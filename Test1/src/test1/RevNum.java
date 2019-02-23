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
public class RevNum {
     public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter No.");
        int num=scn.nextInt();
        int rem=0,rev=0;
        while(num!=0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        
        
        }
        System.out.print(rev);
        
}
}
