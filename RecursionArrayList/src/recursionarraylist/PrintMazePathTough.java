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
public class PrintMazePathTough {
    static int n=1;
    static void pmpt(int cr,int cc,int dr,int dc,String sol)
    {
        if(cc==dc && cr==dr)
        {System.out.println(n+") "+sol);
        n++;
        return;
        }
        if(cc>dc || cr>dr)
            return;
        
        for(int i=1;i<dc+1;i++)
         pmpt(cr,cc+i,dr,dc,sol+"H"+i);
        
        
       for(int i=1;i<dr+1;i++)
         pmpt(cr+i,cc,dr,dc,sol+"V"+i);
        
        
      for(int i=1;i<dr+1&&i<dc+1;i++)
        pmpt(cr+i,cc+i,dr,dc,sol+"D"+i);
               

    }
    public static void main(String args[])
    {
    
    pmpt(0,0,2,2,"");
    
    }
    
    
    
}
