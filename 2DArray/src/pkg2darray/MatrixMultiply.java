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
public class MatrixMultiply {
     public static void main(String args[]){
    int[][] a = {{10,0,0},{0,10,1}};
    int [][] b ={{1,0,1,0},{0,1,1,1},{1,1,1,1}};
    
    int[][] prod = new int[a.length][b[0].length];
    
    
    for(int i=0;i<prod.length;i++)  // For Traversal
    {
        for(int j=0;j<prod[0].length;j++)  // For Traversal
        {
        for(int k=0;k<b.length;k++)                       //For multiplyin
            prod[i][j]+=a[i][k]*b[k][j];
        }
    
    }
    
    for(int i=0;i<prod.length;i++)
    {
    for(int j=0;j<prod[0].length;j++)
        System.out.print(prod[i][j] + " ");
    System.out.println();
    }
    
    
     }
    
}
