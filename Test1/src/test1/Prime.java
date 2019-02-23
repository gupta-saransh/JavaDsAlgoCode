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
public class Prime {
    


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int fla=0;
        for(int i=2;i<n/2;i++)
            if(n%i!=0)
            {System.out.print("Prime");
             fla=1;
            break;}
                
        if(fla==0)
            System.out.print("Not Prime");
    }

}
