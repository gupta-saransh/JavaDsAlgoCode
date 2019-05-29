/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import graphs.Graphs;
import static graphs.Graphs.*;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Saransh Gupta
 */
public class BFS_DFS {

    static class TraversalHelper {

        int vertex;
        String psf;
        int distance;

        public TraversalHelper(int vertex, String psf, int distance) {
            this.distance = distance;
            this.psf = psf;
            this.vertex = vertex;
        }

    }

    static boolean BFS(ArrayList<ArrayList<Graphs.Edge>> graph, int src, int dest) {

        LinkedList<TraversalHelper> queue = new LinkedList<>();
        boolean[] visited = new boolean[graph.size()];

        queue.add(new TraversalHelper(src, "" + src, 0));

        while (queue.size() > 0) {

            // g r m w an
            TraversalHelper rem = queue.getFirst();
            queue.removeFirst();
            System.out.println(rem.vertex + " via " + rem.psf + " @ " + rem.distance);
            if (visited[rem.vertex] == false) {
                visited[rem.vertex] = true;
            } else {
                continue;
            }

            if (rem.vertex == dest) {
                return true;
            }

            for (int n = 0; n < graph.get(rem.vertex).size(); n++) {

                Edge ne = graph.get(rem.vertex).get(n);
                if (visited[ne.n] == false) {
                    queue.addLast(new TraversalHelper(ne.n, rem.psf + ne.n + " ", rem.distance + ne.wt));
                }

            }

        }

        return false;
    }

    static String GetConnectedComponent(ArrayList<ArrayList<Graphs.Edge>> graph, boolean[] visited, int src) {

        LinkedList<Integer> queue = new LinkedList<>();

        queue.add(src);
        String comp = "";
        while (queue.size() > 0) {

            int rem = queue.getFirst();
            queue.removeFirst();

            if (visited[rem] == true) {
                continue;
            } else {
                visited[rem] = true;
            }

            comp += rem;

            for (int n = 0; n < graph.get(rem).size(); n++) {

                Edge ne = graph.get(rem).get(n);
                if (visited[ne.n] == false) {
                    queue.add(ne.n);
                }

            }

        }
return comp;
    }

   static ArrayList<String> GetConnectedComponents(ArrayList<ArrayList<Graphs.Edge>> graph) {

        ArrayList<String> comps = new ArrayList<>();
        boolean[] visited = new boolean[graph.size()];
        for (int i = 0; i < graph.size(); i++) {

            if (visited[i]==false) {
                comps.add(GetConnectedComponent(graph, visited, i));
            }
        }

        return comps;
    }
   static boolean cyclicHelper(ArrayList<ArrayList<Graphs.Edge>> graph,boolean[] visited,int src)
   {
   
       
       LinkedList<Integer> queue = new LinkedList<>();
       
       queue.add(src);
       
       while(queue.size()>0)
       {
           
           int rem = queue.getFirst();
           queue.remove();
           
           if(visited[rem]==true)
               return true;
           else
               visited[rem] = true;
           
           
          for(int i=0;i<graph.get(rem).size();i++)
          {
          
              
              Edge ne = graph.get(rem).get(i);
              if(visited[ne.n]==false)
              queue.add(ne.n);
          
          
          }
           
           
       
       }
       
   
   return false;
   }
   
   static boolean cyclic(ArrayList<ArrayList<Graphs.Edge>> graph)
   {
   boolean[] visited = new boolean[graph.size()];
   boolean var=true;
   for(int i=0;i< graph.size();i++)
   {
   if(visited[i]==false)
       var=cyclicHelper(graph,visited,i);
   
   }
   return var;
   }
   static class BiParHelper{
   
   int vertex;
   int level;
   
   BiParHelper(int vertex,int level)
   {
   this.vertex = vertex;
   this.level=level;
   }
   }
   static boolean isBiPartiteHelper(ArrayList<ArrayList<Graphs.Edge>> graph,int[] visited,BiParHelper src){
   
       LinkedList<BiParHelper> queue = new LinkedList<>();
       queue.add(src);
       
       while(queue.size()>0)
       {
           BiParHelper rem = queue.getFirst();
           queue.remove();
           
           if(visited[rem.vertex]==-1)
           {
              visited[rem.vertex]=rem.level;
           }
           else
           {
           if(visited[rem.vertex]%2!=(rem.level%2))
           {
           return false;
           
           }
          
           }
           
           
           for(int i=0;i<graph.get(rem.vertex).size();i++)
           {
           Edge ne = graph.get(rem.vertex).get(i);
           
           if(visited[ne.n]==-1)
           {
           
           queue.add(new BiParHelper(ne.n, rem.level+1));
           }

           }
           
       
       }
       
   return true;
   }
           
   static  boolean isBiPartite(ArrayList<ArrayList<Graphs.Edge>> graph)
   {
       int[] visited = new int[graph.size()];
       for(int i=0;i<visited.length;i++)
           visited[i]=-1;
       
  
   for(int i=0;i< graph.size();i++)
   {
   if(visited[i]==-1)
   {
       
       boolean var=isBiPartiteHelper(graph,visited,new BiParHelper(i, 0));
       if(var==false)
           return false;
   }
   
   }
   return true;
   
   }
    public static void main(String args[]) {

        ArrayList<ArrayList<Graphs.Edge>> graph = new ArrayList<>();
        for (int i = 0; i < 7; i++) {           //Initialise The ArrayList
            graph.add(new ArrayList<>());
        }

        addEdge(graph, 0, 1, 10);
       // addEdge(graph, 1, 2, 10);
        addEdge(graph, 2, 3, 10);
        addEdge(graph, 0, 3, 40);
        addEdge(graph, 3, 4, 2);
        addEdge(graph, 4, 5, 3);
        addEdge(graph, 4, 6, 8);
        addEdge(graph, 5, 6, 3);
        //display(graph);

        //System.out.print(BFS(graph, 0, 6));
//        System.out.print(GetConnectedComponents(graph));
//        System.out.print(cyclic(graph));
        
            ArrayList<ArrayList<Graphs.Edge>> graph1 = new ArrayList<>();
        for (int i = 0; i < 7; i++) {           //Initialise The ArrayList
            graph1.add(new ArrayList<>());
        }
        
        addEdge(graph1,0,1,1);
        addEdge(graph1,1,2,1);
        addEdge(graph1,0,3,1);
       addEdge(graph1,2,4,1);
        addEdge(graph1,2,3,1);
         addEdge(graph1,3,4,1);
        System.out.println(isBiPartite(graph1));
    }

}
