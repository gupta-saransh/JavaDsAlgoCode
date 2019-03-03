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
public class GetMazePathQueen {
    static ArrayList<String> mpq(int cr,int cc,int dr, int dc)
    {
        if(cc==dc && cr==dr)
        {
        ArrayList<String> Final1=new ArrayList<>();
        Final1.add("");
                return Final1;
        
        }
     ArrayList<String> Hor=new ArrayList<>();  
    ArrayList<String> Ver =new ArrayList<>();    
    ArrayList<String> Dia =new ArrayList<>(); 
    ArrayList<String> Final=new ArrayList<>();
    
     for(int i=1;i<=dc-cc;i++)
     {  
         Hor=mpq(cr,cc+i,dr,dc);
          for(int j=0;j<Hor.size();j++)
          {
          Final.add("H"+i+Hor.get(j));
          }
     }
      for(int i=1;i<=dr-cr;i++)
     {  
         Ver=mpq(cr+i,cc,dr,dc);
          for(int j=0;j<Ver.size();j++)
          {
          Final.add("V"+i+Ver.get(j));
          }
     }
       for(int i=1;i<=dr-cr&&i<=dc-cc;i++)
     {  
         Dia=mpq(cr+i,cc+i,dr,dc);
          for(int j=0;j<Dia.size();j++)
          {
          Final.add("D"+i+Dia.get(j));
          }
     }
        
      return Final;
    
    }
    public static void main(String args[])
    {
    
    System.out.print(mpq(0,0,2,2));
    
    }
}
