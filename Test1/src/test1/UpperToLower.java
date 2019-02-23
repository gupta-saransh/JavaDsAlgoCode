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
public class UpperToLower {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn= new Scanner(System.in);
        char c=scn.next().charAt(0);
        if(c>='a')
            c = (char) (c -'a' +'A');
        else
            c = (char) (c -'A' +'a');
               
           System.out.println(c);
    }
 
    
}
