/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionmemory;

import java.util.ArrayList;

/**
 *
 * @author test
 */
public class EquiSumArrayList {
     static void equisum(int[] arr,int id,ArrayList<Integer> List1,ArrayList<Integer> List2,int sos1,int sos2)
    {
        if(id==arr.length)
        {
        if(sos1==sos2)
        { System.out.print(List1);
            System.out.print(List2);
            System.out.println();
        }
        return;
        }
        if(id==0)
        {   List1.add(arr[id]);
        equisum(arr,id+1,List1,List2,sos1+arr[id],sos2);
        List1.remove(List1.size()-1);}
        if(id>=1)
        {
        List1.add(arr[id]);
        equisum(arr,id+1,List1,List2,sos1+arr[id],sos2);
        List1.remove(List1.size()-1);
        List2.add(arr[id]);
        equisum(arr,id+1,List1,List2,sos1,sos2+arr[id]);
        List2.remove(List2.size()-1);
        }
    
    }
    public static void main(String args[])
    {
        int arr[] ={10,20,30,40,50,60,70};
        ArrayList<Integer> List1 = new ArrayList<>();
        ArrayList<Integer> List2= new ArrayList<>();
        equisum(arr,0,List1,List2,0,0);
    
    
    }
    
}
