/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityqueue;

/**
 *
 * @author test
 */
import java.util.*;
public class PriorityQueue1 {

    /**
     * @param args the command line arguments
     */
 
    static void demo1()
    {
    //PriorityQueue<Integer> pq= new PriorityQueue<>();
    PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
    for(int i=0;i<10;i++)
        pq.add(i);
    
    while(pq.size()>0)
    {
    int val =pq.peek();
    pq.remove();
    System.out.print(val+" ");
    }
    System.out.println();
    
    }
       static void PrintKSmallest1(int[] arr,int k)
    {
    PriorityQueue<Integer> pq= new PriorityQueue<>();
    for(int i=0;i<arr.length;i++)
    {
     pq.add(arr[i]);
 
    }
    int j=0;
    while(j<4)
    {
    int val=pq.peek();
    pq.remove();
    System.out.print(val+" ");
    j++;
    }
    System.out.println();
    }
    static void PrintKSmallest2(int[] arr,int k)
    {
    PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
   
    for(int i=0;i<k &&arr.length>=k;i++)
        pq.add(arr[i]);
    
    for(int i=k;i<arr.length;i++)
    {
        int val=pq.peek();
        if(val>arr[i])
        {
        pq.remove();
        pq.add(arr[i]);
        }
    }
    while(pq.size()>0)
    {
    int val= pq.peek();
    pq.remove();
    System.out.print(val+" ");
    
    }
    
    }
    static void KSortedArraytoPrint(int[] arr,int k)
    {
    
    PriorityQueue<Integer> pq= new PriorityQueue<>();
    
    for(int i=0;i<=k;i++)
    {
    pq.add(arr[i]);
    
    }
    for(int i=k+1;i<arr.length;i++)
    {
    int val=pq.peek();
    System.out.print(val+" ");
    pq.remove();
    pq.add(arr[i]);
    
    } 
     while(pq.size()>0)
    {
    int val= pq.peek();
    pq.remove();
    System.out.print(val+" ");
    
    }
    }
    private static class sortHelper implements Comparable<sortHelper>
    {
   int data;
    int listNo;
   int dno;
    public sortHelper(int lno,int dno,int data)
    {
        this.data=data;
        this.listNo=lno;
        this.dno=dno;
       
    }
   @Override
    public int compareTo(sortHelper other)
    {
    return this.data -other.data;
    }
    }
    static void MergeKSortedArrays(ArrayList<ArrayList<Integer>> lists,int k,int elements)
    {
    
    PriorityQueue<sortHelper> pq = new PriorityQueue<>();
    
    for(int i=0;i<lists.size();i++)
    {
        sortHelper h = new sortHelper(i, 0,lists.get(i).get(0));
     
    pq.add(h);
    
    }
    
    while(pq.size()>0)
    {
       sortHelper h=pq.peek();
       System.out.print(h.data +" ");
       pq.remove();
       h.dno++;
       if(h.dno<lists.get(h.listNo).size())
       {
       h.data=lists.get(h.listNo).get(h.dno);
       pq.add(h);
       }
      
    }

    }
       
    public static void main(String[] args) {
        // TODO code application logic here
        //demo1();
        int[] arr ={7,15,5,22,18,20,27,35,40,30};
        //int[] arr1={99,98,97,96};
        //PrintKSmallest1(arr, 4);
        //PrintKSmallest2(arr, 4);
        //KSortedArraytoPrint(arr, 2);
       ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(5,15,25,35,40));
        ArrayList<Integer> l2 = new ArrayList<>(Arrays.asList(11,14,22,28));
         ArrayList<Integer> l3 = new ArrayList<>(Arrays.asList(2,7,17));
          ArrayList<Integer> l4 = new ArrayList<>(Arrays.asList(9,12,18,24,36));
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        lists.add(l1);
         lists.add(l2);
         lists.add(l3);
          lists.add(l4);
          MergeKSortedArrays(lists, 4,17);
         
    }
    
}
