/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generictree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author test
 */
public class GenericTree {
       static int pred=0;
   static int succ=0;

   private static class Node{
    
        public int data;
        public ArrayList<Node> children;
        
        public Node(int data)
        {
        this.data=data;
        this.children= new ArrayList();
        
        }

    }
    public static Node build(ArrayList<Integer> dlist)
    {
    Node root = null;
    ArrayList<Node> nlist = new ArrayList<>();
    for(int i=0;i<dlist.size();i++)
    {
        if(dlist.get(i)==-1)
        {
            
            nlist.remove(nlist.size()-1);

        }else
        {
            Node nn = new Node(dlist.get(i));
            
            if(nlist.isEmpty())
            {
            root=nn;
            
            }
            else
            {
                Node ln = nlist.get(nlist.size()-1);
                ln.children.add(nn);

            }
            
            nlist.add(nn);

        }
    
    
    }
    
    
    return root;
    
    }
    public static void display(Node root)
    {
    String s= root.data+ "->";
    for(int i=0;i<root.children.size();i++)
    {
    s+=root.children.get(i).data+", ";
    }
    System.out.println(s+" .");
    for(int i=0;i<root.children.size();i++)
    {
    display(root.children.get(i));
    }
    
    }
   static int size(Node root){
    
    int size=0;
        
        for(int i=0;i<root.children.size();i++)
        {
     
            int cs=size(root.children.get(i));
            size+=cs;
        }
        size++;
    return size;
    
    }
    static int max(Node root){
    
    int max=root.data;
        
        for(int i=0;i<root.children.size();i++)
        {
     
            int csize=max(root.children.get(i));
            if(csize>max)
                max=csize;

        }
    return max;
    
    }
    static int height(Node root){
    
    int rh=0;   //initalise -1 for height in edges
        
        for(int i=0;i<root.children.size();i++)
        {
    
            int ch=height(root.children.get(i));
            rh=Math.max(rh, ch);

        }
        rh+=1;
        
    return rh;
    
    }
    
    static boolean find(Node root,int tbf){
    
    int current=root.data;
  
        boolean var=false;
        if(current==tbf)
            return true;
        for(int i=0;i<root.children.size();i++)
        {
            
            var= find(root.children.get(i),tbf);
            
            if(var==true)
            { 
                return true;
            
            }
           

        }
        
        
       return var;
    
    }
    static ArrayList<Integer> nodeToRoot(Node root,int tbf)
    {
   
 
        if(root.data==tbf)
        {
            ArrayList<Integer> br= new ArrayList<>();
            br.add(root.data);
            return br;
        
         }
        
        for(int i=0;i<root.children.size();i++)
        {
            
           ArrayList<Integer> n2cpath=nodeToRoot(root.children.get(i),tbf);
               if(n2cpath!=null)
               {
                   n2cpath.add(root.data);
                   return n2cpath;
               }
        }
        
       
 
    return null;    
    
    }
   static int lca(Node root,int d1,int d2)
    {
        
        ArrayList<Integer> d1l = nodeToRoot(root, d1);
        ArrayList<Integer> d2l = nodeToRoot(root, d2);
        int i=d1l.size()-1;
        int j=d2l.size()-1;
        int prev=0;
        while(i>=0 && j>=0 && (d1l.get(i)==d2l.get(j))){
        prev=d1l.get(i);
        i--;
        j--;
        }

    return prev;
    }
   static int distance(Node root,int d1,int d2)
   {
      ArrayList<Integer> d1l = nodeToRoot(root, d1);
        ArrayList<Integer> d2l = nodeToRoot(root, d2);
        int i=d1l.size()-1;
        int j=d2l.size()-1;
        int prev=0;
        while(i>=0 && j>=0 && (d1l.get(i)==d2l.get(j))){
        prev=d1l.get(i);
        i--;
        j--;
        }

    return i+1+j+1+1;
   
   }
   static void mirror(Node root)
   {
       for(int i=0;i<root.children.size();i++)
       {
       mirror(root.children.get(i));
       }
       int left=0;
       int right=root.children.size()-1;
       while(left<right)
       {
       Node ln=root.children.get(left);
       Node rn=root.children.get(right);
       root.children.set(left,rn);
       root.children.set(right, ln);
       left++;
       right--;
       
       
       }
   
   
   
   }
  static void removeLeaf(Node root)
  {
      for(int i=0;i<root.children.size();i++)
      {
      removeLeaf(root.children.get(i));
        if(root.children.size()==0)
      {
          root.children=null;
      }
      }
  
  }
  static Node linearise(Node root)
  {
  if(root.children.size()==0)
  {
  return root;
  }
  Node olast=root.children.get(root.children.size()-1);
  Node okitail=linearise(olast);
  
  while(root.children.size()!=1)
  {
  Node sl=root.children.get(root.children.size()-2);
  Node skitail=linearise(sl);
   
  Node last=root.children.get(root.children.size()-1);
  root.children.remove(last);
skitail.children.add(last);
  }
  
  return olast;
  
  }
  public static boolean areSimilarStructure(Node r1,Node r2)
  {
  if(r1.children.size()!=r2.children.size())
      return false;
  
  for(int i=0;i<r1.children.size();i++)
  {
  Node c1=r1.children.get(i);
  Node c2=r2.children.get(i);
  boolean res=areSimilarStructure(c1, c2);
  if(res==false)
  {   
      return false;
  
  }
  
  }
  return true;
  }
   public static boolean areMirror(Node r1,Node r2)
  {
  if(r1.children.size()!=r2.children.size())
      return false;
  
  for(int i=0,j=r2.children.size()-1;i<r1.children.size()&&j>0;i++,j--)
  {
  Node c1=r1.children.get(i);
  Node c2=r2.children.get(j);
  boolean res=areSimilarStructure(c1, c2);
  if(res==false)
  {   
      return false;
  
  }
  
  }
  
  
  return true;
  }

   public static boolean isSymmetric(Node root)
   {
  
   
   return areMirror(root,root);
   }
static void predSucc2(Node root,int key,int prev,int curr)
{
prev=curr;
curr=root.data;
if(prev==key)
    succ=curr;
else if(curr==key)
    pred=prev;
for(int i=0;i<root.children.size();i++)
{
predSucc2(root.children.get(i),key,prev,curr);

}

}  
private static class HeapMover{


int res;
int key;

}

        
       static void floorForkthLargest(Node root,HeapMover mover)
        {
        mover.res=root.data<mover.key && root.data>mover.res?root.data:mover.res;
        for(int i=0;i<root.children.size();i++)
            floorForkthLargest(root.children.get(i), mover);
        
        }
       
       static int kthLargest(Node root,int k)
        {
       HeapMover mover=new HeapMover();
            mover.res=Integer.MIN_VALUE;
        mover.key=Integer.MAX_VALUE;
        for(int i=0;i<k;i++)
        {
            floorForkthLargest(root, mover);
            mover.key=mover.res;
            mover.res=Integer.MIN_VALUE;

        }

        return mover.key;
        }
                
   static void LevelOrder(Node root)
   {
       LinkedList<Node> queue=new LinkedList();
       queue.add(root);
       while(queue.size()>0)
       {
       Node fr=queue.getFirst();
       queue.removeFirst();
       System.out.print(fr.data+" ");
       for(int i=0;i<fr.children.size();i++)
           queue.add(fr.children.get(i));
       
       
       }
       
   }
   static void LevelOrderLineWise(Node root)
   {
       LinkedList<Node> queue=new LinkedList();
       queue.add(root);
       queue.add(null);
       while(queue.size()>0)
       {
       Node fr=queue.getFirst();
       queue.removeFirst();
       if(fr==null)
       {
            System.out.println();
            if(queue.size()!=0)
            queue.add(null);
            
       }
       else{
       System.out.print(fr.data+" ");
       for(int i=0;i<fr.children.size();i++)
           queue.add(fr.children.get(i));
       
       
       }
       
       }
       }
       static void LevelOrderLineWise2(Node root)
   {
       LinkedList<Node> queue=new LinkedList();
       LinkedList<Node> next=new LinkedList();
       queue.add(root);
       
       while(queue.size()>0)
       {
       Node fr=queue.getFirst();
       queue.removeFirst();
       
       
       System.out.print(fr.data+" ");
       for(int i=0;i<fr.children.size();i++)
           next.add(fr.children.get(i));
       
       if(queue.size()==0)
       {   queue=next;
        next=new LinkedList();
        System.out.println();
       }
       
       
       }
       
   }
 static void LevelOrderLineWiseZigZag(Node root)
   {
      
       
         LinkedList<Node> queue=new LinkedList();
       LinkedList<Node> next=new LinkedList();
       queue.add(root);
       boolean flag=true;
       while(queue.size()>0)
       {
       Node fr=queue.getFirst();
       queue.removeFirst();
       
       
       System.out.print(fr.data+" ");
       if(flag==true)
       {for(int i=0;i<fr.children.size();i++)
           next.addFirst(fr.children.get(i));
      
       }
       else
       {
       for(int i=fr.children.size()-1;i>=0;i--)
           next.addFirst(fr.children.get(i));
      
       }
       
       
       if(queue.size()==0)
       {   
           queue=next;
        next=new LinkedList();
        flag=!flag;
        System.out.println();
       }
       
      
       }
       
   }
 public static class EHelper{
 
     public Node root;
     public int state;
     EHelper(Node root,int state)
     {
     
     this.root=root;
     this.state=state;
     
     }
 
 
 
 }
static void EulerIteratively(Node root)
{

LinkedList<EHelper> stack = new LinkedList<>();

EHelper rh=new EHelper(root,0);
stack.addFirst(rh);
while(stack.size()>0)
{

    EHelper th = stack.getFirst();
    if(th.state==0)
    {
    
        System.out.println(th.root.data +"pre");
        th.state++;
    
    }
    else if(th.state>=1 && th.state<=th.root.children.size())
    {
        EHelper ch = new EHelper(th.root.children.get(th.state-1),0);
        stack.addFirst(ch);
        if(th.state>=2)
        {
            
           System.out.println(th.root.data +"in"+ (th.state-1));
        }
       
      
        th.state++;
    
    }
    else if(th.state==th.root.children.size()+1)
    {
    System.out.println(th.root.data+"post");
    th.state++;
    
    }
    else if(th.state==th.root.children.size()+2)
    {
        stack.removeFirst();
    
    }

}
}
class kpc{
public String ques;
public String ans;
kpc(String ques,String ans)
{
this.ans=ans;
this.ques=ques;
}

}
String codes[]={"","abc","def","ghi","jkl","mno","pqrs","uvw","xyz"};
void kpc(String ques)
{

LinkedList<kpc> queue;


}
  
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> dlist = new ArrayList();
                dlist.add(10);
                dlist.add(20);
                dlist.add(50);
                dlist.add(-1);
                dlist.add(60);
                dlist.add(-1);
                dlist.add(-1);
                dlist.add(30);
                dlist.add(70);
                dlist.add(-1);
                dlist.add(80);
                dlist.add(110);
                dlist.add(-1);
                dlist.add(120);
                dlist.add(-1);
                dlist.add(-1);
                dlist.add(90);
                dlist.add(-1);
                dlist.add(-1);
                dlist.add(40);
                dlist.add(100);
                dlist.add(-1);
                dlist.add(-1);
                dlist.add(-1);
             
                ArrayList<Integer> d1list = new ArrayList();
                d1list.add(1);
                d1list.add(2);
                d1list.add(5);
                d1list.add(-1);
                d1list.add(6);
                d1list.add(-1);
                d1list.add(-1);
                d1list.add(3);
                d1list.add(7);
                d1list.add(-1);
                d1list.add(8);
                d1list.add(11);
                d1list.add(-1);
                d1list.add(12);
                d1list.add(-1);
                d1list.add(-1);
                d1list.add(9);
                d1list.add(-1);
                d1list.add(-1);
                d1list.add(4);
                d1list.add(10);
                d1list.add(-1);
                d1list.add(-1);
                d1list.add(-1);
             
                
           Node root = build(dlist);
           //this.root=dlist.root;
             Node root1 = build(d1list);
//           //display(root);
//           System.out.println("Height " + height(root));
//           System.out.println("Max "+max(root));
//           System.out.println("Size "+ size(root));
//           System.out.println("Find "+ find(root,120));
//           System.out.println("NodeToRoot "+ nodeToRoot(root,110));
//           System.out.println("LCA "+ lca(root,110,90));
//           System.out.println("Distance "+ distance(root,70,110));
//          // display(root);
//           mirror(root1);
//           //mirror(root);
//          // display(root);
//          // removeLeaf(root);
//           //linearise(root);
//            //display(root1);
//            System.out.println(areSimilarStructure(root, root1));
//            System.out.println(areMirror(root, root1));
//            System.out.println(isSymmetric(root));
//            predSucc2(root, 80, 0, 0);
//           System.out.println(succ);
//          System.out.println("Kth Largest " + kthLargest(root,1));
//          System.out.println("Level Order");
//          LevelOrder(root);
//          System.out.println();
//            System.out.println("Level Order Line Wise");
//          LevelOrderLineWise2(root);
//             LevelOrderLineWiseZigZag(root);
             EulerIteratively(root);
            
            
    }
    
}
