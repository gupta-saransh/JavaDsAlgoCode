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
         
         Node construct4(int[] da,int[] pa)
         {
             Node[] narr = new Node[100];
             
            Node root = null;
             for(int i=0;i<da.length;i++)
             {
                 
                 narr[da[i]] = new Node(da[i]);
             
             }
             for(int i=0;i<pa.length;i++)
             {
                  Node mnode = narr[da[i]];
             if(pa[i]==-1)
             { 
                 root=mnode;
             }
             else
             {
             
             Node parent =narr[pa[i]];
             
             if(parent.left==null)
                 parent.left=mnode;
             else
                 parent.right=mnode;
            
             
             }
             
             
             }
        
         return root;
         }
           int diameter(Node root)
           {
               if(root==null || root.left==null|| root.right==null)
               {  return 0;}
              int maxHeight;
              int maxRtree,maxLtree;
              maxRtree=height(root.left);
              maxLtree=height(root.right);
              
              int dial=diameter(root.left);
              int diar=diameter(root.right);
              
             maxHeight=Math.max(maxLtree+maxRtree+1, Math.max(diar,dial));
              return maxHeight;
              
           }
           class diapair
           {
           public int ht=0;
           public int dia=0;
           
           }
           diapair diameter2(Node root)
           {
               if(root==null)
               {   diapair bp = new diapair();
               bp.ht=0;
               bp.dia=0;
               return bp;
               }
               diapair lp= diameter2(root.left);
               diapair rp = diameter2(root.right);
               
               diapair mp = new diapair();
               mp.dia=Math.max(lp.dia+rp.dia+1,Math.max(lp.dia, rp.dia));
               mp.ht=lp.ht+rp.ht+1;
           
          
           return mp;
           }
           
           class BalancePair{
           
           public int ht=0;
           public boolean bal=true;
           
           
           }
           
          BalancePair isBalanced(Node root)
           {
           if(root==null)
           {
           BalancePair bp = new BalancePair();
           bp.ht=0;
           bp.bal=true;
           return bp;
           }
           
           
           BalancePair lh=isBalanced(root.left);
           BalancePair rh=isBalanced(root.right);
           
           BalancePair fin = new BalancePair();
           fin.bal=lh.bal&&rh.bal&&(lh.ht-rh.ht)<=1;
           fin.ht=Math.max(lh.ht, rh.ht)+1;
           
           return fin;
           
           }
         class BstPair{
         
         public int min=Integer.MAX_VALUE;
         public int max=Integer.MIN_VALUE;
         public boolean bst=true;
         public Node root1;
         public int size;
         
         }
         BstPair isBst(Node root)
         {
             if(root==null)
             {
             BstPair bp = new BstPair();
             bp.bst=true;
             bp.min=Integer.MAX_VALUE;
             bp.max=Integer.MIN_VALUE;
             return bp;
             
             }
         
         BstPair lp = isBst(root.left);
         BstPair rp = isBst(root.right);
         
         BstPair mp = new BstPair();
         
         mp.bst=lp.bst &&rp.bst && root.data>lp.max &&root.data<rp.min;
         mp.min=Math.min(root.data, Math.min(lp.min, rp.min));
         mp.max=Math.max(root.data, Math.max(lp.max, rp.max));
         
         return mp;
        
         
         }
         BstPair LargestBst(Node root)
         {
         if(root==null)
             {
             BstPair bp = new BstPair();
             bp.bst=true;
             bp.min=Integer.MAX_VALUE;
             bp.max=Integer.MIN_VALUE;
             bp.size=0;
             bp.root1=null;
             return bp;
             
             }
         BstPair lp = LargestBst(root.left);
         BstPair rp = LargestBst(root.right);
         
         BstPair mp = new BstPair();
         
         mp.bst=lp.bst &&rp.bst && root.data>lp.max &&root.data<rp.min; //gives if tree is bst
         mp.min=Math.min(root.data, Math.min(lp.min, rp.min));
         mp.max=Math.max(root.data, Math.max(lp.max, rp.max));
          mp.root1=root;
         if(mp.bst==true) //Only find size when it is a bsp
         {
         mp.root1=root;
         mp.size=lp.size+rp.size+1;
         
         }
         if(mp.bst==false) // As soon as it fails check which size is greater and return stuff
         {
         if(lp.size>rp.size)
         {
         mp.size=lp.size;
         mp.root1=lp.root1;
         
         }
         else
         {
         mp.size=rp.size;
         mp.root1=rp.root1;
         
         }
         
         }
        
         
         return mp;
         }
  
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr={50,25,12,-1,37,30,-1,40,-1,-1,-1,75,62,60,-1,70,-1,-1,87,-1,-1,-1};
        int[] arr2={1,2,3,-1,5,6,8,20,22,-1,-1,21,-1,-1,9,12,14,-1,15,18,-1,19,-1,-1,-1,13,-1,-1,-1,7,10,-1,11,16,-1,17,-1,-1,-1,-1,-1,3,-1,-1};
        int[] arr3={50,25,70,-1,-1,60,80,90,-1,-1,-1,-1};
        
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
           int[] pre ={50,25,12,10,20,16,22,37,24,40,75,62,70,87};
           int[] in={10,12,25,30,37,50,62,75,87,90};
           int[] post={10,16,22,20,12,24,40,37,25,70,62,87,75,50};
           int[] pre1={50,25,40,30,37,20,10};
           int[] post1={40,30,25,20,10,37,50};
          Node rootInPre=obj.construct3(pre, post, 0, pre.length-1, 0, post.length-1);
//           obj.display(rootInPre);
           int[] dataArray={30,40,37,50,25,75,62,87,12};
           int[] parentArray={37,37,25,-1,50,50,75,75,25};
           //int[]
           //Node r1=obj.construct4(dataArray, parentArray);
//           System.out.print(obj.diameter(r1));
//           diapair pair=obj.diameter2(root);
//           System.out.println(pair.dia);
//           System.out.print(obj.isBalanced(root3).bal);
//           System.out.print(obj.isBst(root3).bst);
          // obj.display(rootInPre);
           System.out.print(obj.LargestBst(rootInPre).root1.data +" "+obj.LargestBst(rootInPre).size+" ");
            
    }
    
}
