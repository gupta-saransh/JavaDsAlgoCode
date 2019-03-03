/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionarraylist;

import java.util.ArrayList;

/**
 *
 * @author test
 */
public class GetMazePath {
  
    
    public static ArrayList<String> gmp(int cr,int cc,int dr,int dc)
    {
        if(cc==dc && cr==dr)
        {
             ArrayList<String> Final1=new ArrayList<>();
             Final1.add(" ");
             return Final1;
            
        }
        if(cc>dc || cr>dr)
        {
        ArrayList<String> Final12=new ArrayList<>();       
             return Final12; 
        }
         
        
    ArrayList<String> Hor=gmp(cr,cc+1,dr,dc);        
    ArrayList<String> Ver=gmp(cr+1,cc,dr,dc);        
    ArrayList<String> Final=new ArrayList<>();
    
        for(int i=0;i<Hor.size();i++)
          Final.add("H"+ Hor.get(i));
        for(int i=0;i<Ver.size();i++)
          Final.add("V"+ Ver.get(i));
      
      return Final;
    }
    public static void main(String args[])
    {
    System.out.print(gmp(0,0,2,2));
    
    
    }
}
