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
public class Crossword {
//   static boolean pv(char[][] board,String[] letter,int pf,int r, int c)
//    {
//    int len=letter[pf].length();
//    
//    if(board[r+len][c]=='+'|| r==board.length)
//        return true;
//    
//    return false;
//    
//    }
//   static boolean ph(char[][] board,String[] letter,int pf,int r, int c)
//    {
//    int len=letter[pf].length();
//    for(int i=0;i<)
//    if(board[r][c+len]=='+'|| c==board[0].length)
//        return true;
//    
//    return false;
//    
//    }
//   static void placeh(char[][] board,String[] letter,int pf,int r, int c,boolean dipit)
//    {
//    for(int i=r,j=c;j<letter[pf].length();j++)
//    {
//    board[i][j]=letter[pf].charAt(j);
//    
//    }
//    
//   
//    
//    }
//   static void placev(char[][] board,String[] letter,int pf,int r, int c)
//    {
//    for(int i=r,j=c;i<letter[pf].length();i++)
//    {
//    board[i][j]=letter[pf].charAt(i);
//    
//    }
//    
//    }
//   static void unplacev(char[][] board,String[] letter,int pf,int r, int c)
//    {
//    for(int i=r,j=c;i<letter[pf].length();i++)
//    {
//    board[i][j]='-';
//    
//    }
//    
//    
//    
//    }
//   static void unplaceh(char[][] board,String[] letter,int pf,int r, int c)
//    {
//    for(int i=r,j=c;j<letter[pf].length();j++)
//    {
//    board[i][j]='-';
//    
//    }
//    
//   
    static boolean cph(char[][] board,String word,int i,int j)
    {
        if(j + word.length()>board[0].length)
        {  return false;
        }
        else if( j+ word.length()< board[0].length&&board[i][j+word.length()]!='+')
        return false;
        else if(j>0 && board[i][j-1]!='+')
              return false;  
           for(int ii=0;ii<word.length();ii++)
               if(board[i][j+ii]!='-' && board[i][j+ii]!=word.charAt(ii))
               {
                   return false;
               }
        return true;
    }
    static void placeh(char[][] board,String word,int i,int j,boolean[] dipit)
    {
        for(int ii=0;ii<word.length();ii++)
        {
        dipit[ii] = board[i][j+ii] =='-';
        board[i][j+ii] = word.charAt(ii);
        }
        
       
    }
    
    static void unplaceh(char[][] board,String word,int i,int j,boolean[] dipit)
    {
        for(int ii=0;ii<word.length();ii++)
        {
            if(dipit[ii] ==true)
            {
            board[i][j+ii] = '-';
            }
        
        }
        
    }
    
    static boolean cpv(char[][] board,String word,int i,int j)
    {
        if(i + word.length()>board.length)
        {  return false;
        }
        else if( i+ word.length()< board.length&&board[i+word.length()][j]!='+')
        return false;
        else if(i>0 && board[i-1][j]!='+')
              return false;  
           for(int ii=0;ii<word.length();ii++)
               if(board[i+ii][j]!='-' && board[i+ii][j]!=word.charAt(ii))
               {
                   return false;
               }
        return true;
    }
    static void placev(char[][] board,String word,int i,int j,boolean[] dipit)
    {
        for(int ii=0;ii<word.length();ii++)
        {
        dipit[ii] = board[i+ii][j] =='-';
        board[i+ii][j] = word.charAt(ii);
        }
        
       
    }
    
    static void unplacev(char[][] board,String word,int i,int j,boolean[] dipit)
    {
        for(int ii=0;ii<word.length();ii++)
        {
            if(dipit[ii] ==true)
            {
            board[i+ii][j] = '-';
            }
        
        }
        
    }
    
    
    static void cpuzzle(char[][] board,String[] letter,int pf)
     {
         if(pf==letter.length)
         {
             for(int i=0;i<board.length;i++)
             {
                 for(int j=0;j<board[0].length;j++)
                 { System.out.print(board[i][j]+" ");}
                 
                 System.out.println();
             }
               System.out.println();
         return;
         }
         
         for(int i=0;i<board.length;i++)
         {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j]=='-' || board[i][j]==letter[pf].charAt(0))
                {
                    if(cph(board,letter[pf],i,j)==true)
                {
                    boolean dipit[] = new boolean[letter[pf].length()];
                    placeh(board,letter[pf],i,j,dipit);
                    cpuzzle(board,letter,pf+1);
                    unplaceh(board,letter[pf],i,j,dipit);
                }
                if(cpv(board,letter[pf],i,j)==true)
                {
                     boolean dipit[] = new boolean[letter[pf].length()];
                    placev(board,letter[pf],i,j,dipit);
                    cpuzzle(board,letter,pf+1);
                    unplacev(board,letter[pf],i,j,dipit);
                }
                }
            }
        }
         
     }
    public static void main(String arg[])
    {
    char[][] board={
        {'+', '-', '+', '+', '+', '+', '+', '+', '+', '+'},
        {'+', '-', '+', '+', '+', '+', '+', '+', '+', '+'},
        {'+', '-', '-', '-', '-', '-', '-', '-', '+', '+'},
        {'+', '-', '+', '+', '+', '+', '+', '+', '+', '+'},
        {'+', '-', '+', '+', '+', '+', '+', '+', '+', '+'},
        {'+', '-', '-', '-', '-', '-', '-', '+', '+', '+'},
        {'+', '-', '+', '+', '+', '-', '+', '+', '+', '+'},
        {'+', '+', '+', '+', '+', '-', '+', '+', '+', '+'},
        {'+', '+', '+', '+', '+', '-', '+', '+', '+', '+'},
        {'+', '+', '+', '+', '+', '+', '+', '+', '+', '+'}
    };

    String words[] = {"agra", "norway", "england", "gwalior"};
    cpuzzle(board, words,0);
    }
}
