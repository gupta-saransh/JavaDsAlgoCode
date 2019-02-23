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
public class RightRotateMatrix {
    public static void main(String args[])
    {
    
        int a[][] ={{1,2,3},{4,5,6},{7,8,9}};
        int temp;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                if(i>j)
                {temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;}
            }
        
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a[0].length;j++)
            {
                
                temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        
        }
        for(int i=0;i<a.length;i++)
        {int temp1;
        int low=0;
        int high=a.length-1;
        while(low<high)
        {
        temp1=a[i][low];
        a[i][low]=a[i][high];
        a[i][high]=temp1;
        low++;
        high--;
        
        }
        }
       
         for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        
        }
        
        
    }
    
    
}
