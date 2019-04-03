/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author test
 */
import java.util.*;
public class BinaryTree {
    
    class Node{
    
        public int data;
        Node left;
        Node right;
        Node(int data)
        {
        this.data=data;
        
        }
    
    
    }
    
    Node contruct(int arr[])
    {
        Node root=null;
        ArrayList<Node> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {

        if(arr[i]==-1)
        {    
            list.remove(list.size()-1);

        }
        else
        {
        Node nn = new Node(arr[i]);
        if(list.isEmpty())
        { 
            root=nn;
        
        }
        else
        {
            Node ln = list.get(list.size()-1);
            if(ln.left==null)
            {
            ln.left=nn;
            
            }
            else
            {
            
            ln.right=nn;
            }

        
        }
        
            list.add(nn);
        }
        }
    
     return root;
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
        System.out.print(root.right.data+" ");
        
        }
         System.out.println();
         if(root.left!=null)
      display(root.left);
         if(root.right!=null)
           display(root.right);
        
         
        
    return root;
    
    }
    int size(Node root)
    {
        int ls=0,rs=0;
    
       if(root.left!=null)
        ls = size(root.left);
       if(root.right!=null)
           rs=size(root.right);
       
    
    return rs+ls+1;
    }
    int sum(Node root)
    {
    int ls=0,rs=0;
    
    if(root.left!=null)
    {
        
        ls=sum(root.left);}
       if(root.right!=null)
       { 
          
           rs=sum(root.right);
       
       }
       
    
    return rs+ls+root.data;
    
    
    }
    int max(Node root)
    {
     int ls=0,rs=0,max=root.data;
   
    if(root.left!=null)
    {
        
        ls=max(root.left);
  if(max<ls)
        max=ls;
            }
       if(root.right!=null)
       { 
          
           rs=max(root.right);
           if(max<rs)
        max=rs;

       }
        
       
    return max;

    }
      int height(Node root)
    {
     int ls=0,rs=0,h=0;
   
    if(root.left!=null)
    {
        
        ls=height(root.left);
        h=Math.max(h, ls);
            }
       if(root.right!=null)
       { 
          
           rs=height(root.right);
         h=Math.max(h, rs);

       }
        
       h++;
    return h;

    }
      
      
      void kfar(Node root)
      {
      
          
      
      
      }
    
  
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr={50,25,12,-1,37,30,-1,40,-1,-1,-1,75,62,60,-1,70,-1,-1,87,-1,-1,-1};
        BinaryTree obj = new BinaryTree();
        Node root=obj.contruct(arr);
        
        System.out.println(obj.size(root));
           System.out.println(obj.sum(root));
           System.out.println(obj.max(root));
            System.out.println(obj.height(root));
        obj.display(root);
    }
    
}
