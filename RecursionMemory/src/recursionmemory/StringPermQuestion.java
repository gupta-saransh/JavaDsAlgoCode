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
public class StringPermQuestion {
    static void pq(String question,String ans)
    {
        if(question.length()==0)
        {
        
            System.out.println(ans); 
            return;
        
        }
        String q1,q2,q3;
        for(int i=0;i<question.length();i++)
        {
            char ch=question.charAt(i);
        q1=question.substring(0, i);
        q2=question.substring(i+1);
        q3=q1+q2;
        pq(q3,ans+ch);
        }
    
    }
    public static void main(String args[])
    {
    
        pq("abc","");
    
    
    }
    
}
