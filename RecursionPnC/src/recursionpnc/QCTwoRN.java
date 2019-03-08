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
public class QCTwoRN {
    static int count=1;
   
    static void qperm(int tq,int tb,String asf,int qsf,int cb)
    { 
        if(cb==tb)
        {
            if(qsf==tq)
            { System.out.println(asf);}
            
        return;
        }
       
      qperm(tq,tb,asf+"q"+qsf+"b"+cb+"+",qsf+1,cb+1);
      qperm(tq,tb,asf,qsf,cb+1);
      
    }
    public static void main(String args[])
    {
    qperm(2,4,"",0,0);
    }
    
}
