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
public class QueenPermutation {
    static boolean arr[]= new boolean[5];
    static int count=0;
    static void qperm(int tq,int tb,int cq,String asf,boolean[] arr)
    {
        
    if(cq>tq)
    {
        System.out.println(asf);
        count++;
        return;
    }
    
    for(int i=0;i<tb;i++)
    {
        if(arr[i]==false)
        {
            arr[i]=true;
            qperm(tq,tb,cq+1,asf+"q"+cq+"b"+i+"+" ,arr);
            arr[i]=false;
        
        }
    }
   
    }
    
    public static void main(String args[])
    {
    boolean ar[]= new boolean[5];
    qperm(2,5,1,"",ar);
    System.out.print(count);
    }
    
}
