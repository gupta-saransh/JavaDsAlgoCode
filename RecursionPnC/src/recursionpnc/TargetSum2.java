/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionpnc;

/**
 *
 * @author test
 */
public class TargetSum2 {
    static void tar(int[] arr,int id,int tar,String ca){
    
        if(id==arr.length)
        {
            if(tar==0)
             System.out.println(ca);
             
            return;
        }
        tar(arr,id+1,tar-arr[id],ca+arr[id]);
        tar(arr,id+1,tar,ca);
        
        
    }
    public static void main(String arg[])
    {
    int[] arr={10,20,30,40,50,60,70};
    tar(arr,0,70,"");
    
    }
}
