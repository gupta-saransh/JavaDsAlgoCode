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
public class getFloodFill {
    static ArrayList<String> ffa(int[][] arr,int cc, int cr)
    {
        int dr=arr.length-1;
        int dc=arr[0].length-1;
        int sc=0;
        int sr=0;
        
        if(cr==dr && cc==dc)
        {
            ArrayList<String> Final1=new ArrayList<>();
            Final1.add("");
            return Final1;
        }
        if(arr[cr][cc]==1)
        {
            ArrayList<String> Final1=new ArrayList<>();          
            return Final1;
        
        }
        
    ArrayList<String> Final=new ArrayList<>();
            arr[cr][cc]=1;
    if(cr<dr)
    {
      ArrayList<String> D= ffa(arr,cr+1,cc);
      
    for(int i=0;i<D.size();i++)
        Final.add("D"+D.get(i));
    }
     if(cc<dc)
    {
       ArrayList<String> R =ffa(arr,cr,cc+1);
         for(int i=0;i<R.size();i++)
        Final.add("R"+R.get(i));
   
    }
      if(cr>sr)
    {
     
   ArrayList<String> T=ffa(arr,cr-1,cc);
   for(int i=0;i<T.size();i++)
        Final.add("T"+T.get(i));
    }
      if(cc>sc)
    {
        
    ArrayList<String> L=ffa(arr,cr,cc-1);
    
    for(int i=0;i<L.size();i++)
        Final.add("L"+L.get(i));
    }
    
     arr[cr][cc]=0; 
    
    return Final;
    }
    public static void main(String args[])
    {
    int arr[][] = {{0,1,0,0,0,0},{0,1,0,1,1,0},{0,0,0,0,0,0},{0,1,0,1,1,0},{0,1,0,0,0,0}};
        System.out.print(ffa(arr,0,0));
    
    }
    
}
