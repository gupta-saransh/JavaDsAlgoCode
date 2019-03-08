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
public class NQueensNxNBoard {
    static boolean isQueenSafe(boolean[][] arr,int i,int j)
    {
        
        
        //north
        for(int ii=i-1,jj=j;ii>=0;ii--)
        {
            if(arr[ii][jj])
            {
                return false;
            }
        }
        //s
        for(int ii=i+1,jj=j;ii<arr.length;ii++)
        {
            if(arr[ii][jj])
            {
                return false;
            }
        }
        //e
        for(int ii=i,jj=j+1;jj<arr[0].length;jj++)
        {
            if(arr[ii][jj])
            {
                return false;
            }
        }
        
        //w
        for(int ii=i,jj=j-1;jj>=0;jj--)
        {
            if(arr[ii][jj])
            {
                return false;
            }
        }
        //ne
        for(int ii=i-1,jj=j+1;ii>=0&& jj<arr[0].length;jj++,ii--)
        {
            if(arr[ii][jj])
            {
                return false;
            }
        }
        //se
        for(int ii=i+1,jj=j+1;ii<arr.length&& jj<arr[0].length;jj++,ii++)
        {
            if(arr[ii][jj])
            {
                return false;
            }
        }
        //nw
        for(int ii=i-1,jj=j-1;ii>=0 && jj>=0;jj--,ii--)
        {
            if(arr[ii][jj])
            {
                return false;
            }
        }
        //sw
         for(int ii=i+1,jj=j-1;ii<arr.length && jj>=0;jj--,ii++)
        {
            if(arr[ii][jj])
            {
                return false;
            }
        }
        
        
//        for(int k=i+1;k<arr.length;k++) //row ahead
//        {
//            if(arr[k][j]==true)
//                return false;
//        }
//        for(int k=i-1;k>=0;k--)  //row behind
//        {
//            if(arr[k][j]==true)
//                return false;
//        }
//        for(int k=j+1;k<arr[0].length;k++) //column ahead
//        {
//            if(arr[i][k]==true)
//                return false;
//        }
//      
//        for(int k=j-1;k>=0;k--)  //column behind
//        {
//            if(arr[i][k]==true)
//                return false;
//        }
//        while(i<arr.length-1 && j<arr[0].length-1)
//        {
//            i++;
//            j++;
//             if(arr[i][j]==true)
//                return false;
//             
//        }
//        while(i<arr.length-1 && j>0)
//        {
//            i++;
//            j--;
//             if(arr[i][j]==true)
//                return false;
//             
//        }
//        while(i>0 && j>0)
//        {
//            i--;
//            j--;
//             if(arr[i][j]==true)
//                return false;
//             
//        }
//        while(i>0 && j<arr[0].length-1)
//        {
//            i--;
//            j++;
//             if(arr[i][j]==true)
//                return false;
//             
//        }
//        
//        
     return true;
//    }
    }
    static boolean isBoardSafe(boolean[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==true)
                {
                    if(isQueenSafe(arr,i,j)==false)
                        {
                            return false;
                        }
                }
            }
        }
        return true;
    }
    static int count=0;
    static void queen(boolean[][] arr,int qpsf,String asf,int tq,int cb)
    {
        if(qpsf==tq)
    {
        if(isBoardSafe(arr)==true)
        { System.out.println(asf);}
        //count++;
       
        return;
    }
    for(int i=cb;i<arr.length*arr[0].length;i++)
    {
        
           if(arr[i/arr.length][i%arr.length] == false)
            {
                arr[i/arr.length][i%arr.length]=true;
                queen(arr,qpsf+1,asf+"q"+qpsf+"b"+i/arr.length+""+i%arr.length+" ",tq,i+1);
                arr[i/arr.length][i%arr.length]=false;
            }
           
           
    }
    
    }
    public static void main(String args[])
    {
        boolean arr[][]= new boolean[4][4];
    queen(arr,0,"",4,0);
    System.out.print(count);
    
    }
    
}
