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
        
        if(cr==arr.length && cc==arr[0].length)
        {
            ArrayList<String> Final1=new ArrayList<>();
            Final1.add("");
            return Final1;
        }
        //if(cc>dc||cr>dr||)
         ArrayList<String> T=ffa(arr,cr-1,cc);
    ArrayList<String>  L=ffa(arr,cr,cc-1);    
    ArrayList<String> D= ffa(arr,cr+1,cc);
    ArrayList<String> R =ffa(arr,cr,cc-1);
    ArrayList<String> Final=new ArrayList<>();
    
    for(int i=0;i<T.size();i++)
        Final.add("T"+T.get(i));
    for(int i=0;i<L.size();i++)
        Final.add("L"+L.get(i));
    for(int i=0;i<D.size();i++)
        Final.add("D"+D.get(i));
    for(int i=0;i<R.size();i++)
        Final.add("R"+R.get(i));
    
    return Final;
    }
    public static void main(String args[])
    {
    
    
    }
    
}
