/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionarrays;

/**
 *
 * @author test
 */
public class FindElement {
     public static boolean find(int a[],int sp,int data)
    {  
        if(sp==a.length)
            return false;
        
        boolean fisa=find(a,sp+1,data);
        if(fisa==true)
        {
            return true;
        }else if(a[sp]==data)
        {
            return true;
        }
        else
            return false;
    
      
    }
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={1,2,3,5,4};
        System.out.print(find(a,0,3));
       
        
    }
    
}
