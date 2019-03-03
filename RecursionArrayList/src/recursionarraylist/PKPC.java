/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursionarraylist;

/**
 *
 * @author test
 */
public class PKPC {
     static String[] codes ={".","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
    
    public static void pss(String ques,String ans)
    {
        if(ques.length()==0)
        {
        System.out.println(ans);
        return;
        }
    char ch= ques.charAt(0);
    String ros=ques.substring(1);
    String code=codes[ch-'0']; //code stores value of Array at that place
    
     
        
    for(int i=0;i<code.length();i++){
       
        pss(ros,ans+code.charAt(i)); //Accessing Individual Characters
    }
    }
    public static void main(String args[])
    {
    
   pss("987654321","");
    }
    
}
