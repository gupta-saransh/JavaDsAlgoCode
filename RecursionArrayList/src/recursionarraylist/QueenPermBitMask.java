/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionarraylist;

/**
 *
 * @author test
 */
public class QueenPermBitMask {
    static int count=1;
    static void qperm(int tq,int tb,int cq,String asf,int bit)
    { 
     if(cq>tq)
    {
        System.out.println(count+" "+asf);
       count++;
        return;
    }
    
    for(int i=0;i<tb;i++)
    {
        int bit2=1<<i;
        if((bit&bit2)==0)
        {
            bit=bit ^(bit2);
           qperm(tq,tb,cq+1,asf+"q"+cq+"b"+i+"+",bit);
           bit=bit ^(bit2);
        
        }
    }
    
    }
    public static void main(String args[])
    {
        int tb=4;
    int bit=0;
    qperm(2,5,1,"",bit);
    System.out.print(count);
    }
    
}
