/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityqueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 *
 * @author test
 */
public class MedianPQ {
    PriorityQueue<Integer> right = new PriorityQueue<>();
    PriorityQueue<Integer> left= new PriorityQueue<>(Collections.reverseOrder());
    

    void handleBalance()
    {
    if(left.size()-right.size()==2)
    
        right.add(left.remove());
    
    else if(right.size() - left.size()==2)
        
        left.add(right.remove());
    
    
    }
    void add(int val)
    {
       
       if(left.size()>0&&val<left.peek())
           left.add(val);
       else
           right.add(val);
       handleBalance();
        
    }
    
    void remove()
    {
   if(left.size()>=right.size())
     {
    left.remove();
     }
     else
     right.remove();
   
   if(left.size()==0 && right.size()==1)
       left.add(right.remove());

    }
    int peek()
    {
     if(left.size()>=right.size())
     {
     return left.peek();
     }
     else
      return right.peek();
    
    }    
    int size()
    {
    return left.size() + right.size();
    }
    public static void main(String args[])
    {
    MedianPQ mpq= new MedianPQ();
    mpq.add(10);
    mpq.add(20);
    mpq.add(5);
    mpq.add(50);
    mpq.add(30);
     System.out.print(mpq.peek()+" ");
   mpq.remove();
     mpq.add(80);
      System.out.print(mpq.peek()+" ");
      mpq.add(100); 
       mpq.add(110);
       //System.out.print(mpq.peek()+" ");
      
    
       while(mpq.size()>0)
       { 
         System.out.print(mpq.peek()+" ");  
         mpq.remove();
         
         
       }

   
    
    }
    
}
