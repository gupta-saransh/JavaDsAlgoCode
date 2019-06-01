/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import static graphs.Graphs.Edge;
import static graphs.Graphs.display;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Saransh Gupta
 */
public class Topological_Sort {
    
    static void TopologicalSlave(ArrayList<ArrayList<Edge>> graph,int src,LinkedList<Integer> stack,boolean[] visited)
    {
    
        visited[src]=true;
        for(int n=0;n<graph.get(src).size();n++)
        {
        
            Edge ne = graph.get(src).get(n);
            
            if(visited[ne.n]==false)
            {
            TopologicalSlave(graph,ne.n,stack,visited);
            
            }
            
       
        }
        
        
    
     stack.addFirst(src);
    
    }
    
    static void TopologicalMaster(ArrayList<ArrayList<Edge>> graph)
    {
    
        LinkedList<Integer> stack = new LinkedList<>();
        boolean visited[] = new boolean[graph.size()];
        
        for(int i=0;i<graph.size();i++)
        {
        
        
            if(visited[i]==false)
            {
            
                TopologicalSlave(graph, i, stack, visited);
            
            }
        }
        
        while(stack.size()>0)
        {
        
         System.out.print(stack.removeFirst()+" ");
        
        
        }
      
    
    
    }
    
    
    
    public static void main(String args[])
    {
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
             for (int i = 0; i < 7; i++) {           //Initialise The ArrayList
                graph.add(new ArrayList<>());
            }

             graph.get(0).add(new Edge(1,2));
             graph.get(0).add(new Edge(4,4));
             graph.get(1).add(new Edge(2,8));
             graph.get(2).add(new Edge(3,1));
             graph.get(5).add(new Edge(4,5));
             graph.get(6).add(new Edge(3,1));
              graph.get(5).add(new Edge(6,5));
    
              display(graph);
              TopologicalMaster(graph);
              
    
    }
    
}
