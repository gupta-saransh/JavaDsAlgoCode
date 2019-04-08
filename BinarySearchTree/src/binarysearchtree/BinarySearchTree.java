/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author test
 */
public class BinarySearchTree {

    class Node{
    
        public int data;
        Node left;
        Node right;
        Node nright;
        Node(int data)
        {
        this.data=data;   
        }
    }
     Node construct3(int[] pre,int[] post,int prestrt,int prend,int poststrt,int postend)
         {
             if(prestrt>prend|| poststrt>postend)
                 return null;
            if(prestrt==prend)
            {
                Node root = new Node(pre[prestrt]);
                root.left=null;
                root.right=null;
                return root;
            
            }
            Node root = new Node(pre[prestrt]);

            int lhs=1;
           for(int i=poststrt;i<=postend-1;i++)
           {
           if(post[i]==pre[prestrt+1])
           {
           break;
           }
           else
           {
           lhs++;
           }

           }
         root.left = construct3(pre, post, prestrt+1, prestrt+lhs, poststrt, poststrt+lhs-1);
         root.right= construct3(pre, post, prestrt+lhs+1, prend, poststrt+lhs, postend-1);
      
         return root;  
         }
    Node construct(int arr[],int lo,int high)
    {
         int mid=(lo+high)/2;
        if(lo>high)
        {
           return null;
        }

    Node root= new Node(arr[mid]);
    root.left=construct(arr,lo,mid-1);
    root.right=construct(arr,mid+1,high);

    return root;
    }
   
    int max(Node root)
    {
   if(root.right==null)
        return root.data;
                else
                   return max(root.right);
    }
     int min(Node root)
    {
    if(root.left==null)
        return root.data;
                else
                   return min(root.left);
    }
     boolean fin(Node root,int data)
     {
        if(root==null)
            return false;
     if(data>root.data)
     {
     return fin(root.right,data);
     
     }
     else if(data<root.data)
     {
     
     return fin(root.left,data);
     
     }
     else
     {
     
     return true;
     }
     
     
     }
   
    
     Node display(Node root)
    {
    //left-root-right
        if(root.left==null)
        {
            System.out.print(". ");
            
        }
        else
        {
        System.out.print(root.left.data+" ");
        
        }
        System.out.print(root.data+" ");
      
         if(root.right==null)
        {
            System.out.print(". ");
            
        }
        else
        {
        System.out.print(root.right.data+"");
        
        }
         System.out.println();
         if(root.left!=null)
      display(root.left);
         if(root.right!=null)
           display(root.right);

    return root;
    
    }
     
     void PrintTargetSumPair(Node oroot,Node root,int tar) //in nlogn complexity
     {
     
         if(root==null)
             return;
     
        int b=tar-root.data;
        if(b<root.data){
        boolean find=fin(oroot,b);
        if(find==true)
            System.out.print(root.data+"-"+b+" ");
        }
         PrintTargetSumPair(oroot,root.left, tar);
         PrintTargetSumPair(oroot,root.right,tar);

     }
     void filler(Node root,ArrayList<Integer> list)
     {
         if(root==null)
             return;
        filler(root.left,list);
        list.add(root.data);
        filler(root.right,list);
     
     
     }
     void PrintTargetSumPair2(Node root,int tar)   //in n complexity
     {
     ArrayList<Integer> mylist=new ArrayList<>();
     filler(root,mylist);
     Collections.sort(mylist);  //nlogn complexity not required here because inorder is already sorted
     int li=0;
     int ri=mylist.size()-1;
     while(li<ri)
     {
     
     int sum;
         sum = mylist.get(ri)+mylist.get(li);
     
     if(sum>tar)
         ri--;
     else if(sum<tar)
         li++;
     else
     {
     System.out.print(mylist.get(li)+"-"+mylist.get(ri)+" ");
     li++;
     ri--;

     }
     }
     }
     void PrintTargetSum3(Node root,int data)
     {
     
     //write code later
     
     
     
     
     }
     static int sum=0;
     void replaceWithSumOfNodesLargerThanYourself(Node tail)
     {
         if(tail==null)
             return;
         
         
             
          replaceWithSumOfNodesLargerThanYourself(tail.right);
          int ord=tail.data;
          tail.data=sum;
          sum=sum+ord;
         replaceWithSumOfNodesLargerThanYourself(tail.left);
         

     
     }
     Node add(Node root,int data)
     {
     
     if(root==null)
     {
         root = new Node(data);
         return root;
     
     }
     
     
     if(data<root.data)
     {
     root.left=add(root.left,data);
         
     }
    if(data>root.data)
    {
    root.right=add(root.right,data);
    
    }
 
     return root;
     
     }
     
     
     Node remove(Node root,int data)
     {
         
     if(root==null)
     {
         return null;
     }
     
        if(data<root.data)
        {
        root.left=remove(root.left,data);
        }
        else if(data>root.data)
        {
        root.right=remove(root.right,data);
        }
        else
        {
        if(root.left!=null && root.right!=null)
        { 
            int lmax=max(root.left);
           // System.out.print(lmax);
            root.data=lmax;
            root.left=remove(root.left,lmax);
        
        
        } 
        else
        {
            return root.left!=null?root.left:root.right;
       
        }

        }
     return root;
     }
     
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[] ={10,20,30,40,50,60,70,80};
        //int[] pre ={50,30,10,20,70,60,80};
           
           //int[] post={10,20,30,60,80,70,50};
           
        BinarySearchTree obj = new BinarySearchTree();
        Node root=obj.construct(arr,0,arr.length-1);
      // obj.display(root);
//        System.out.println(obj.max(root));
//        System.out.println(obj.min(root));
//        System.out.println(obj.fin(root, 31));
    //    Node root1=obj.construct3(pre, post, 0, pre.length-1, 0, post.length-1);
//        obj.PrintTargetSumPair2(root1,100);
//        obj.display(root1);
//        System.out.println("---------------------------");
//        obj.replaceWithSumOfNodesLargerThanYourself(root1);
        //obj.display(root1);
        obj.add(root, 101);
        //obj.remove(root, 40);
        obj.display(root);
    }
    
}
