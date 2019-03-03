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
public class RecursionArrayList {

    /**
     * @param args the command line arguments
     */
    static void ascii(String s,String ans)
    {
        if(s.length()==0)
        {
        System.out.println(ans);
        return;
        
        }
        char ch= s.charAt(0);
        String ros = s.substring(1);
        ascii(ros,ans+"-");
        ascii(ros,ans+ch);
       // ascii(ros,ans+(int)ch +"");
        
    
    
    
   }
    public static void main(String[] args) {
        // TODO code application logic here
     ascii("abc","");
        
    }
    
}
