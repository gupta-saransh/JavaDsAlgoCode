/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicprogramming;

/**
 *
 * @author Saransh Gupta
 */

//TO BE FINISHEDs
public class GoldMine {
    
    static void GM(int[][] mine){
    
        int[][] strg =  new int[mine.length][mine[0].length];
        
        for(int i=mine.length-1;i>=0;i--)
        {
        
            for(int j=mine.length-1;j>=0;j--){
            
                if(i==mine.length && j==mine[0].length)
                {
                strg[i][j]=mine[i][j];
                }
                else if(i==mine.length)
                {
                strg[i][j]=mine[i][j]+Math.max(mine[i][j+1],mine[i-1][j+1]);
                }
                else if(j==mine[0].length )
                {
                
                
                }
                else
                {
                
                
                
                
                }
             
            
            
            }
           
        
        }
        
        
        
    
    
    }
            
    
    
    public static void main(String args[])
    {
    
        int[][] arr={
           
            {1,0,9,3,6,7},
            {1,3,7,9,0,0},
            {4,2,0,6,1,8},
            {2,8,1,4,2,3},
            {0,5,0,5,6,4},
            {2,4,7,8,1,5}
            
        };
        
        
        
        
    
    
    }
    
    
    
    
    
}
