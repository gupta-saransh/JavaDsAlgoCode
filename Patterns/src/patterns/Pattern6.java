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
public class Pattern6 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int val=1;
        int spaces=n-1;
        int stars=1;
        
        for(int i=1;i<=n;i++)
        {  
          
            for(int j=1;j<=spaces;j++){
                 System.out.print("  "); 
            }
            int valcol=val;
            for(int st=1; st<=stars;st++)
            {

                System.out.print(valcol+ " ");
                
                if(st<=stars/2){
                    valcol++;
                }
                else{
                    valcol--;
                }

            }
        
            System.out.println(" ");
            if(i<=n/2)
            {
                spaces--;
                stars+=2;
                val++;
            }
            else
            {
                spaces++;
                stars-=2;  
                val--;
            }
                
        }
       
}
    
    
}
