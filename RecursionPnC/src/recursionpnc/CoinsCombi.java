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
public class CoinsCombi {
     static void ccperm(int[] coins,int amt,String asf,int id)
    {
       
        if(amt==0)
        {
        System.out.println(asf);
          return;
        }
        
        if(amt<0)
            return;
        
         for(int i=id;i<coins.length;i++){
            ccperm(coins,amt-coins[i],asf+coins[i],i);
         }
           
        }
        
    
    public static void main(String args[])
    {
    int[] coins={2,3,5};
    ccperm(coins,7,"",0);
  
    }
}
