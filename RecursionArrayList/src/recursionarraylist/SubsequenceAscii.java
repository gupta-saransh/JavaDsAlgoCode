/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionarraylist;

import java.util.ArrayList;
import static recursionarraylist.RecursionArrayList.ascii;

/**
 *
 * @author test
 */
public class SubsequenceAscii {
    
    static ArrayList<String> getascii(String s)
    {
        if(s.length()==0)
        {
            ArrayList<String> final1 = new ArrayList<>();
            final1.add("");
                    return final1;
        
        }
        char ch= s.charAt(0);
        String ros = s.substring(1);
       ArrayList<String> presult = getascii(ros);
       ArrayList<String> mresult = new ArrayList<>();
       
       for(String srg: presult)
       {
           mresult.add(srg);
       
       }
       for(String srg: presult)
       {
           mresult.add(srg+ch);
       
       }
       for(String srg: presult)
       {
           mresult.add(srg+(int)ch);
       
       }
    
       return mresult;
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
     
        System.out.print(getascii("abc"));
    }
    
}
