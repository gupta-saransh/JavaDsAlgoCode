/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avltree;

/**
 *
 * @author Saransh Gupta
 */
public class AVLTree {

   class Node{
    
        public int data;
        Node left;
        Node right;
        int ht;
        int bal;
        Node(int data)
        {
        this.data=data;   
        this.left=null;
        this.right=null;
        this.ht=0;
        this.bal=0;
        
                
        }
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
        setHnB(root);
    return root;
    }
   
    int max(Node root)
    {
   if(root.right==null)
        return root.data;
                else
                   return max(root.right);
    }
    void setHnB(Node root)
    {
    int lh=root.left==null?0:root.left.ht;
    int rh=root.right==null?0:root.right.ht;
    
    root.ht=Math.max(lh,rh)+1;
    root.bal=lh-rh;
    
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
        System.out.print(root.data+"[ "+root.ht+ ","+root.bal+" ]");
      
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
     Node leftRotation(Node z)
     {
         Node y=z.right;
         Node t2=y.left;
         
         y.left=z;
         z.right=t2;
         setHnB(z);
         setHnB(y);
         
         
         return y;
     
     
     }
      Node rightRotation(Node z)
     {
         Node y=z.left;
         Node t2=y.right;
         
         y.right=z;
         z.left=t2;
         setHnB(z);
         setHnB(y);
         
         
         return y;
     
     
     }
     Node handleAVL(Node root)
     {
     
         if(root.bal>1)
         {
         
             if(root.left.bal>0)  //LL
             {
             
             root=rightRotation(root);
             
             
             }
             else //LR
             {
                 root.left= leftRotation(root.left);
                 root=rightRotation(root);
             
             
             }
   
         
         }
         else if(root.bal<-1)
         {
         
           if(root.right.bal<0)  //RR
             {
             
             root=leftRotation(root);
             
             
             }
             else //RL
             {
                 root.right= rightRotation(root.right);
                 root=leftRotation(root);
             

             }
   

         }
         return root;
     }
      Node add(Node root,int data)
     {
     
     if(root==null)
     {
         root = new Node(data);
         setHnB(root);
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
         setHnB(root);
        root=handleAVL(root);
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
        if(root==null)
            return null;
        
         setHnB(root);
          root=handleAVL(root);
     return root;
     }
    public static void main(String[] args) {
        // TODO code application logic here
         int arr[] ={20,30,40,50,60,70,80};
         AVLTree obj = new AVLTree();
         Node root=obj.construct(arr,0,arr.length-1);
         
         obj.remove(root, 20);
         obj.remove(root,30);
        obj.remove(root,40);
         obj.display(root);
    }
    
}

    

