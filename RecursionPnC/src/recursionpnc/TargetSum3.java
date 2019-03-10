/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionpnc;

import java.util.ArrayList;

/**
 *
 * @author test
 */
public class TargetSum3 {
    static void tar(int[] arr,int id,int tar,ArrayList<Integer> mre){
    
       
         if(id==arr.length)
        {
            if(tar==0)
             System.out.print(mre);
             
            return;
        }
         
        mre.add(arr[id]);
        tar(arr,id+1,tar-arr[id],mre);
        mre.remove(mre.size()-1);  //String is created again n again, Arraylists reference is passed
        
        tar(arr,id+1,tar,mre);
    
    }
    public static void main(String arg[])
    {
    int[] arr={10,20,30,40,50,60,70};
    ArrayList<Integer> li = new ArrayList<Integer>();
    tar(arr,0,70,li);
    
    }
    
}
