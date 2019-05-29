/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

/**
 *
 * @author Saransh Gupta
 */
import static graphs.Graphs.*;
//import graphs.BFS_DFS.*;
import static graphs.Graphs.addEdge;
import java.util.ArrayList;
import java.util.LinkedList;

//Astronauts in arrays, same index array contains astronaut from same country, send
// them to moon, in pair, such that the pair conatins astronaut from different country
// return number of such pairs;
public class Astronaut_Problem {
    
    
      static int GetConnectedComponent(ArrayList<ArrayList<Graphs.Edge>> graph, boolean[] visited, int src) {

        LinkedList<Integer> queue = new LinkedList<>();

        queue.add(src);
        String comp="";
        int count=0;
        while (queue.size() > 0) {

            int rem = queue.getFirst();
            queue.removeFirst();

            if (visited[rem] == true) {
                continue;
            } else {
                visited[rem] = true;
            }
            
            count++;
            for (int n = 0; n < graph.get(rem).size(); n++) {

                Edge ne = graph.get(rem).get(n);
                if (visited[ne.n] == false) {
                    queue.add(ne.n);
                }

            }

        }
return count;
    }

   static ArrayList<Integer> GetConnectedComponents(ArrayList<ArrayList<Graphs.Edge>> graph) {

        ArrayList<Integer> comps = new ArrayList<>();
        boolean[] visited = new boolean[graph.size()];
        for (int i = 0; i < graph.size(); i++) {

            if (visited[i]==false) {
                comps.add(GetConnectedComponent(graph, visited, i));
            }
        }

        return comps;
    }
    
   static int getNumber(ArrayList<Integer> ano){
       int count=0;
       for(int i=0;i<ano.size();i++)
       {
       
           for(int j=i+1;j<ano.size();j++)
               count=count+ (ano.get(i)*ano.get(j));
       
       }
   
   return count;
   }
   
    static int astronaut(int[] arr1,int[] arr2,int n){
     ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {           //Initialise The ArrayList
            graph.add(new ArrayList<>());
        }
        
        for(int i=0;i<arr1.length;i++)
        {
        
        addEdge(graph,arr1[i],arr2[i],1);
        
        }
    return getNumber(GetConnectedComponents(graph));
    
    
    }
    
    
    public static void main(String args[]){
    
    int arr1[] ={1,6,8,2,9,10,0};
    int arr2[] = {2,9,3,5,5,3,11};
    int n=12;
    
        System.out.print(astronaut(arr1, arr2, n));
    
    
    
    
    }
}
