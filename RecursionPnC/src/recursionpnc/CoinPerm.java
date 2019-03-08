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
public class CoinPerm {
    static void ccperm(int[] coins,int amt,String asf)
    {
        
        if(amt==0)
        {
        System.out.println(asf);
        return;
        }
        
        
        for(int i=0;i<coins.length;i++)
        {
            if(coins[i]<=amt)
            ccperm(coins,amt-coins[i],asf+coins[i]);
        
        }
    
    }
    public static void main(String args[])
    {
    int[] coins={2,3,5};
    ccperm(coins,7,"");
  
    }
}
