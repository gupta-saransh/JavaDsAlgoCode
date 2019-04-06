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
      boolean find(Node root,int tbf)
      {
          int current=root.data;
          boolean var = false;
          if(current==tbf)
              return true;
          if(root.left!=null)
          {
              var=find(root.left,tbf);
              if(var==true)
                  return true;
          
          
          }
       if(root.right!=null)
          {
              var=find(root.right,tbf);
              if(var==true)
                  return true;
          
          
          }

      return var;
      }
      
  ArrayList<Integer> nodeTorootpath(Node root,int tbf)
  {
      if(root.data==tbf)
        {
            ArrayList<Integer> br= new ArrayList<>();
            br.add(root.data);
            return br;
        
         }
      if(root.left!=null)
      {
      ArrayList<Integer> n2cpath=nodeTorootpath(root.left,tbf);
               if(n2cpath!=null)
               {
                   n2cpath.add(root.data);
                   return n2cpath;
               }
      
      
      }
       if(root.right!=null)
      {
      ArrayList<Integer> n2cpath=nodeTorootpath(root.right,tbf);
               if(n2cpath!=null)
               {
                   n2cpath.add(root.data);
                   return n2cpath;
               }
      
      
      }
  
  
  
  return null;
  }
   ArrayList<Node> nodeTorootpath2(Node root,int tbf)
  {
      if(root.data==tbf)
        {
            ArrayList<Node> br= new ArrayList<>();
            br.add(root);
            return br;
        
         }
      if(root.left!=null)
      {
      ArrayList<Node> n2cpath=nodeTorootpath2(root.left,tbf);
               if(n2cpath!=null)
               {
                   n2cpath.add(root);
                   return n2cpath;
               }
      
      
      }
       if(root.right!=null)
      {
      ArrayList<Node> n2cpath=nodeTorootpath2(root.right,tbf);      // to get node to root path
               if(n2cpath!=null)
               {
                   n2cpath.add(root);
                   return n2cpath;
               }
      
      
      }
  
  
  
  return null;
  }
    void kdown(Node root,Node pbt,int k)
    {
        if(root==pbt)
            return;
        
        if(k==0)
        {
        System.out.print(root.data+" ");
        return;
        
        }
        if(root!=null)
        {
        if(root.left!=null)
        {
        kdown(root.left,pbt,k-1);
        
        }
        if(root.right!=null)
        {
        kdown(root.right,pbt,k-1);
        
        }
        }


    }

      void kfar(Node root,int d,int k)
      {
        
        
            ArrayList<Node> nlist = nodeTorootpath2(root, d);// to get node to root path
            for(int i=0;i<nlist.size() && i<=k;i++)
            {
            if(i==0)
            {
                kdown(nlist.get(i),null,k-i);
            }
            else
            {
              kdown(nlist.get(i),nlist.get(i-1),k-i);
            
            }
            
            }    
      
      }
      void removeLeaves(Node root,Node parent)
      {
          if(parent==null)
              return;
    if(root.left!=null &&root.right!=null)
      {
          parent=root;
          removeLeaves(root.left,parent);
          removeLeaves(root.right,parent);
      }
      else if(root.left==null)
      {
         if(parent.left==root)
          parent.left=null;
          if(parent.right==root)
          parent.right=null;
      }
      else if(root.right==null)
      {
      
        if(parent.left==root)
          parent.left=null;
          if(parent.right==root)
          parent.right=null;
      }

      }
      Node removeLeaves2(Node root)
      {
      
      
      if(root==null)
          return null;
      if(root.left!=null && root.left.left==null && root.right.right==null)
      {
      return null;
      }
      if(root.right!=null && root.left.left==null && root.right.right==null)
      {
      return null;
      }
      root.left=removeLeaves2(root.left);
      root.right=removeLeaves2(root.right);
      
      
      return root;
      
      }
       void printSingleChild(Node root)
      {
      
           if(root==null)
              return;
      if(root.left!=null && root.left.right==null && root.left.left!=null)
      {
          System.out.print(root.left.left.data);
      }
      if(root.left!=null && root.left.right!=null && root.left.left==null)
      {
          System.out.print(root.left.right.data);
      }
      if(root.right!=null && root.right.right==null && root.right.left!=null)
      {
          System.out.print(root.right.left.data);
      }
      if(root.right!=null && root.right.right!=null && root.right.left==null)
      {
          System.out.print(root.right.right.data);
      }
     
          
          printSingleChild(root.left);
          printSingleChild(root.right);
      
      }
       private void pir(Node root, int low,int high,ArrayList<Integer> path,int sum)
       {
       
           if(root==null)
               return;
           
           if(root.left==null && root.right==null)
           {
           path.add(root.data);
           sum=sum+root.data;
           if(sum>=low && sum<=high)
           {
           
           for(int i=0;i<path.size();i++)
               System.out.print(path.get(i)+"->");
           
           path.remove(root.data);
           
           }
           
           
           
           }
         
            path.add(root.data);
            pir(root.left,low,high,path,sum);
            pir(root.right,low,high,path,sum);
            path.remove(root.data);
       }
       
       void preOrder(Node root)
       {
           if(root==null)
               return;
           
           System.out.print(root.data +"->");
           preOrder(root.left);
           preOrder(root.right);
       
       }
        void InOrder(Node root)
       {
           if(root==null)
               return;
           
          
           InOrder(root.left);
            System.out.print(root.data +"->");
           InOrder(root.right);
       
       }
        
         void postOrder(Node root)
       {
           if(root==null)
               return;
           
          
           postOrder(root.left);
           postOrder(root.right);
            System.out.print(root.data +"->");
       
       }
         Node construct1(int[] pre,int[] in,int prestrt,int prend,int instrt,int inend)
         {
             if(prestrt>prend || instrt>inend)
             {
             return null;
             }
             Node root = new Node(pre[prestrt]);
             int lhs=0;
             
             for(int i=instrt;i<=inend;i++)
             {
             
             if(in[i]==pre[prestrt])
             {
             break;
             }
             else
             {
             
             lhs++;
             }
             
             }
             root.left=construct1(pre, in, prestrt+1, prestrt+lhs, instrt, instrt+lhs-1);
             root.right=construct1(pre, in, prestrt+lhs+1, prend, instrt+lhs+1, inend);
         
         return root;
         }
        
         Node construct2(int[] post,int[] in,int poststrt,int postend,int instrt,int inend)
         {
             if(poststrt>postend || instrt>inend)
                 return null;
         Node root= new Node(post[postend]);
         
         int lhs=0;
         
         for(int i=instrt;i<=inend;i++)   
         {
         
             if(in[i]==post[postend])
             {
             break;
            }
             else
             {
             lhs++;
             }
         
         }
         
         root.left=construct2(post, in, poststrt, poststrt+lhs-1, instrt, instrt+lhs-1);
         root.right=construct2(post, in, poststrt+lhs, postend-1, instrt+lhs+1, inend);

         
         return root;
         
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
         
         Node construct4()
         {
         
         
         
         
         
         
         
         
         }
           
    
  
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr={50,25,12,-1,37,30,-1,40,-1,-1,-1,75,62,60,-1,70,-1,-1,87,-1,-1,-1};
        int[] arr2={1,2,3,-1,5,6,8,20,22,-1,-1,21,-1,-1,9,12,14,-1,15,18,-1,19,-1,-1,-1,13,-1,-1,-1,7,10,-1,11,16,-1,17,-1,-1,-1,-1,-1,3,-1,-1};
        int[] arr3={50,25,70,-1,-1,50,80,-1,-1,-1};
        
        BinaryTree obj = new BinaryTree();
        Node root=obj.contruct(arr);
        Node root3=obj.contruct(arr3);
//        System.out.println(obj.size(root));
//           System.out.println(obj.sum(root));
//           System.out.println(obj.max(root));
//            System.out.println(obj.height(root));
//            //obj.display(root);
//            System.out.println(obj.find(root,25));
//            System.out.println(obj.nodeTorootpath(root, 40));
            //obj.kdown(root, 1);
           Node root2=obj.contruct(arr2);
//           //obj.kfar(root2, 9, 3);
//           obj.display(root);
//          System.out.println("---------------------------------------------");
//             obj.removeLeaves2(root);
//           obj.display(root);
           //obj.printSingleChild(root2);
        
          // System.out.print(obj.pir(root,10,240,null,0));
//           obj.preOrder(root);
//           System.out.println();
//           obj.postOrder(root);
//           System.out.println();
//           obj.InOrder(root);
           int[] pre ={50,25,12,10,37,30,75,62,87,90};
           int[] in={10,12,25,30,37,50,62,75,87,90};
           int[] post={10,12,30,37,25,62,90,87,75,50};
           int[] pre1={50,25,40,30,37,20,10};
           int[] post1={40,30,25,20,10,37,50};
           Node rootInPre=obj.construct3(pre1, post1, 0, pre1.length-1, 0, post1.length-1);
           obj.display(rootInPre);
            
    }
    
}
