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
public class TargetSum {
    static ArrayList<ArrayList<Integer>> tsum(int arr[],int tar,int id)
    {
    
    ArrayList<ArrayList<Integer>> List = new ArrayList<>();
     ArrayList<ArrayList<Integer>> result = new ArrayList<>();
     
     List=tsum(arr,tar,id+1);
     return result;
    }
    public static void main(String args[])
    {
    
    
    }
    
}
