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
public class SpiralTraversal {
    
       
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] a = new int[6][6];
        for(int i=0;i<a.length;i++)
            for(int j=0;j<a[0].length;j++)
                a[i][j]=10*i +j;
        
        int minr=0;
        int minc=0;
        int maxr=a.length-1;
        int maxc=a[0].length-1;
        int total=a.length*a[0].length;
        int count=1;
      
        while(count<=total)
        {
        //lw
            for(int r=minr,c=minc;r<=maxr && count<=total;r++)
            {System.out.print(a[r][c]+" ");
            count++;
            }
            minc++;
        //bw
            for(int r=maxr,c=minc;c<=maxc && count<=total;c++)
            {System.out.print(a[r][c]+" ");
            count++;
            }
            maxr--;
            
        //rw
            for(int r=maxr,c=maxc;r>=minr && count<=total;r--)
            {System.out.print(a[r][c]+" ");
            count++;
            }
            maxc--;
            
        //tw
            for(int r=minr,c=maxc;c>=minc && count<=total;c--)
            {System.out.print(a[r][c]+" ");
            count++;
            }
            minr++;
        
        
        
        }
    }
    
}
