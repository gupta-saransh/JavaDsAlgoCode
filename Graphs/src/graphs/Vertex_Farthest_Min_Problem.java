/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import graphs.Graphs.Edge;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Saransh Gupta
 */

public class Vertex_Farthest_Min_Problem {
    static void VFMP(ArrayList<ArrayList<Graphs.Edge>> graph, int src,int[] pmax,boolean[] visited) {

        
        int count=0;
        int max=0;
        LinkedList<Integer> queue = new LinkedList<>();
        queue.add(src);
        
        while(queue.size()>0)
        {
        
            int rem = queue.getFirst();
            queue.remove();
            
            if(visited[rem]==true)
            {
            continue;
            }
            else
                visited[rem] = true;
            count++;
        for(int i=0;i<graph.get(rem).size();i++)
        {
        
            Edge ne= graph.get(rem).get(i);
            if(visited[ne.n]==false)
            {
            queue.add(ne.n);
            
            }
            else
            { 
                
                if(max<count)
                    max=count;
            }
        
        
        }
            
        
        }
        
        pmax[max] = max;
        
        
        
        
    }
    
    static void VFMP_Main(ArrayList<ArrayList<Graphs.Edge>> graph){
        
        boolean[] visited = new boolean[graph.size()];
        int[] pmax = new int[graph.size()];
        
        for(int i=0;i<graph.size();i++)
        {
            if(visited[i]==false)
        VFMP(graph, i, pmax, visited);
        }
        
        for(int i=0;i<pmax.length;i++)
            System.out.print(pmax[i]+" ");
        
    }
    
}
