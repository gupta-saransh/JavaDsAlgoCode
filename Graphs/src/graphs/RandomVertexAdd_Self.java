/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Saransh Gupta
 */
public class RandomVertexAdd_Self {
     /**
     * @param args the command line arguments
     */
    static class Edge {

        int n;  //neighbour(vertex)
        int wt; //Edge Weight

        Edge(int n, int wt) {
            this.n = n;
            this.wt = wt;

        }

    }

    static void addEdge(ArrayList<ArrayList<Edge>> graph, int v1, int v2, int wt) {

        graph.get(v1).add(new Edge(v2, wt));

        graph.get(v2).add(new Edge(v1, wt));

    }

    static void display(ArrayList<ArrayList<Edge>> graph) {

        System.out.println("-------------------------------");

        for (int v = 0; v < graph.size(); v++) {        // To Traverse in the outer vector

            System.out.print(v + " -> ");
            for (int n = 0; n < graph.get(v).size(); n++) {     //To traverse vector of vector
                Edge ne = graph.get(v).get(n);
                System.out.print("[" + ne.n + "@" + ne.wt + "] ");
            }
            System.out.println();

        }

        System.out.println("-------------------------------");

    }

    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < 7; i++) {           //Initialise The ArrayList
            graph.add(new ArrayList<>());
        }

        HashMap<String,Integer> vertex = new HashMap<>();
        vertex.put("A",0);
        vertex.put("B",1);
        vertex.put("C",2);
        vertex.put("D",3);
        vertex.put("E",4);
        vertex.put("F",5);
        vertex.put("G",6);
        
        addEdge(graph,vertex.get("A"),vertex.get("B"),10);
        display(graph);
    }

}
