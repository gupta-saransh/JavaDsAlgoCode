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
public class QueenCombination {
    static boolean arr[]= new boolean[5];
    static int count=0;
    static int cb=-1;
    static void qcount(int tq,int tb,int cq,String asf,boolean[] arr)
    {
        
    if(cq>tq)
    {
        System.out.println(asf);
        count++;
        return;
    }
    
    for(int i=cb+1;i<tb;i++)
    {
        
           
           cb=i;
            qcount(tq,tb,cq+1,asf+"q"+cq+"b"+i+"+",arr);
          
            
             
       
    }
   
    }
    
    public static void main(String args[])
    {
    boolean ar[]= new boolean[5];
    qcount(3,5,1,"",ar);
    System.out.print(count);
    }
    
    
}
