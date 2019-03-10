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
public class StringPermQuestionDistinct {
    static void pqd(String q,String ans)
    {
        if(q.length()==0)
        {
        System.out.println(ans);
        return;
        }
    boolean dupli[] = new boolean[256];
    for(int i=0;i<q.length();i++)
    {
        char ch=q.charAt(i);
        String l=q.substring(0,i);
        String r=q.substring(i+1);
        if(dupli[ch]==false)
        {
        dupli[ch]=true;
        pqd(l+r,ans+ch);
        
        }
    
    
    
    }
    
    
    }
    public static void main(String args[])
    {
    pqd("baba","");
    
    }
}
