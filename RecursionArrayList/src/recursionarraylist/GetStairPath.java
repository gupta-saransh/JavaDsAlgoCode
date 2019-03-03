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
public class GetStairPath {
    public static ArrayList<String> gsp(int n)
    {
        if(n==0)
        {
        ArrayList<String> fin=new ArrayList<>();
        fin.add("");
        return fin;
        
        }
        if(n<0)
        {
        ArrayList<String> fin=new ArrayList<>();
        return fin;
        
        }
      ArrayList<String> pf1=gsp(n-1);
      ArrayList<String> pf2=gsp(n-2);
      ArrayList<String> pf3=gsp(n-3);
      
//      if(n>=1)
//       ArrayList<String> pf1=gsp(n-1);
//      if(n>=2)                                    This Can Be Used As WELL, Just remove the other base case.
//      ArrayList<String> pf2=gsp(n-2);
//      if(n>=3)
//      ArrayList<String> pf3=gsp(n-3);
      ArrayList<String> pf=new ArrayList<>();
      
      
      
      for(int i=0;i<pf1.size();i++)
          pf.add(1+ pf1.get(i));
      for(int i=0;i<pf2.size();i++)
          pf.add(2+ pf2.get(i));
      for(int i=0;i<pf3.size();i++)
          pf.add(3+ pf3.get(i));
    
      return pf;
    }
    public static void main(String args[])
    {
    System.out.print(gsp(7));
    
    }
    
}
