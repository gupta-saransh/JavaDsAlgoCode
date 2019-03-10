/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionmemory;

/**
 *
 * @author test
 */
public class EquiSum {
    static void equisum(int[] arr,int id,String s1,String s2,int sos1,int sos2)
    {
        if(id==arr.length)
        {
        if(sos1==sos2)
        { System.out.print(s1+" ");
            System.out.print(s2);
            System.out.println();
        }
        return;
        }
        
       if(id==0)
        equisum(arr,id+1,s1+arr[id],s2,sos1+arr[id],sos2);
        if(id>=1)
        {
        equisum(arr,id+1,s1+arr[id],s2,sos1+arr[id],sos2);
        equisum(arr,id+1,s1,s2+arr[id],sos1,sos2+arr[id]);
        }
       
        
    
    }
    public static void main(String args[])
    {
        int arr[] ={10,20,30,40,50,60,70};
    equisum(arr,0,"","",0,0);
    
    
    }
    
}
