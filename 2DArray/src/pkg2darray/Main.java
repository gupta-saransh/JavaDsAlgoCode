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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] a = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        for(int j=0;j<a[0].length;j++)
        {
            if(j%2==0)
            for(int i=0;i<a.length;i++)
            {
                System.out.print(a[i][j]+ "  ");
            }
            else
              for(int i=a.length-1;i>=0;i--)
            {
                System.out.print(a[i][j]+ "  ");
            }  
       
        
        }
    }
    
}
