/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2darray;

/**
 *
 * @author test
 */
public class DT1 {
    public static void main(String args[])
    {
        int a[][] = {{11,12,13,14},{15,16,17,18},{19,20,21,22},{23,24,25,26}};
        int n=0;
        while(n<a.length){
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
                if(i==j-n)
                {
                    System.out.print(a[i][j]+ " ");
                }
        
        }
        n++;
    }
        
    
    }
    
}
