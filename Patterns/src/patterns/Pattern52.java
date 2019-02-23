/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patterns;

import java.util.Scanner;

/**
 *
 * @author test
 */
public class Pattern52 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int val=1;
        int spaces=n-1;
        int stars=1;
        for(int i=1;i<=n;i++)
        {  
            val=i;
            for(int j=1;j<=spaces;j++){
                 System.out.print("  "); 
            }
            for(int st=1; st<=stars;st++)
            {

                System.out.print(val+ " ");
                if(st<=stars/2){
                 val++;
                }
                else{
                    val--;
                }

            }
        
            System.out.println(" ");
            spaces--;
            stars+=2;
        }
       
}
    
}
