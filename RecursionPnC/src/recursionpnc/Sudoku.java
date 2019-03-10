/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionpnc;

/**
 *
 * @author test
 */
public class Sudoku {
    
    static boolean checknum(int[][] board,int r,int c,int num)
    {
        for(int i=r,j=0;j<board.length;j++)
        {
        if(board[i][j]==num)
            return true;
        }
       
       
        for(int i=0,j=c;i<board.length;i++)
        {
        if(board[i][j]==num)
            return true;
        }
        int mrc=r/3*3;
        int mcc=c/3*3;
        for(int i=mrc;i<mrc+3;i++)
        {
        for(int j=mcc;j<mcc+3;j++)
        {
            if(board[i][j]==num)
                return true;
        }
        
        }
               
        
    return false;
    }
    static void cudoku(int[][] board,int bno)
    {
        if(bno==board.length*board[0].length)
        {
            for(int i=0;i<board.length;i++)
            {  for(int j=0;j<board[0].length;j++)
            {
               System.out.print(board[i][j]+"-");
            }
            System.out.println();
            }
                
        return;
        }
    
    
        int r=bno/board.length;
        int c=bno%board[0].length;
    if(board[r][c]==0)
    {
        for(int num=1;num<=9;num++)
        {
            if(checknum(board,r,c,num)==false)
            {
               board[r][c]=num; 
            cudoku(board,bno+1);
            board[r][c]=0;
            }
        }
    }else
    {
    cudoku(board,bno+1);
    }
    
    
    
    }
     
    public static void main(String arg[])
     {
     int[][] board={
         {3,0,6,5,0,8,4,0,0},
         {5,2,0,0,0,0,0,0,0},
         {0,8,7,0,0,0,0,3,1},
         {0,0,3,0,1,0,0,8,0},
         {9,0,0,8,6,3,0,0,5},
         {0,5,0,0,9,0,6,0,0},
         {1,3,0,0,0,0,2,5,0},
         {0,0,0,0,0,0,0,7,4},
         {0,0,5,2,0,6,3,0,0}
     };
     cudoku(board,0);
     
     }
}
