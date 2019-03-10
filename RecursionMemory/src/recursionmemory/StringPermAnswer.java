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
public class StringPermAnswer {
    static void perma(String question, String ans)
    {
        if(question.length()==0)
        {
        System.out.println(ans);
        return;
        }
        char ch=question.charAt(0);
        String roq=question.substring(1);
    
        for(int i=0;i<=ans.length();i++)
        {
            String l=ans.substring(0, i);
            String r=ans.substring(i);
            perma(roq,l+ch+r);
        
        }
    
    }
    public static void main(String args[])
    {
    
    perma("abc","");
    
    }
    
}
