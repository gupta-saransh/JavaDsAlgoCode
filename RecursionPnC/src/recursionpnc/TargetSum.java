/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionpnc;

import java.util.ArrayList;

/**
 * @author Saransh
 */
public class TargetSum {
    static ArrayList<ArrayList<Integer>> tsum(int arr[],int tar,int id,int n)
    {
        if(id==n){
            ArrayList<ArrayList<Integer>> List3 = new ArrayList<>();
        if(tar==0)
        {
            
             List3.add(new ArrayList<>());
             
        }
        return List3;
        }
    
    ArrayList<ArrayList<Integer>> List1 = tsum(arr,tar-arr[id],id+1,n);
    ArrayList<ArrayList<Integer>> List2 = tsum(arr,tar,id+1,n);
    ArrayList<ArrayList<Integer>> result = new ArrayList<>();
   
     

    for(int i=0;i<List1.size();i++)
    {
        List1.get(i).add(arr[id]);
     result.add((List1).get(i));
    }
    for(int i=0;i<List2.size();i++)
    {
        result.add((List2).get(i));
    }
   
    
    
    return result;
    }
    public static void main(String args[])
    {
    int arr[]={10,20,30,40,50,60,70};
    System.out.print(tsum(arr,70,0,arr.length));
    
    }
    
}
