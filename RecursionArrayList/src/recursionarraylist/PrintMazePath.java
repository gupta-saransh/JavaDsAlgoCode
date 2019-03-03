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
public class PrintMazePath {
    static void pmp(int cr,int cc,int dr,int dc,String sol)
    {
        if(cc==dc && cr==dr)
        {System.out.println(sol);
        return;
        }
        if(cc<dc)
        pmp(cr,cc+1,dr,dc,sol+"H");
        if(cr<dr)
          pmp(cr+1,cc,dr,dc,sol+"V");
        
    }
    public static void main(String args[])
    {
    
    pmp(0,0,1,1," ");
    
    }
    
    
    
}
