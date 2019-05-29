/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;
/*

USED TO MAKE MINIMUM SPANNING TREE

MSP= A TREE CONTATING ALL VERTICES CONNECTED BY MINIMUM PATH BETWEEN THE EDGES

MINIMUM PATH FOUND BY SEEING LOCAL WEIGHTS

*/

import static graphs.Graphs.*;
import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 *
 * @author Saransh Gupta
 */
public class Prims_Algo {

    static class PHelper implements Comparable<PHelper> {

        int vertex;
        int parent;
        int localWt;

        PHelper(int vertex, int parent, int localWt) {
            this.vertex = vertex;
            this.parent = parent;
            this.localWt = localWt;

        }

        @Override
        public int compareTo(PHelper other) {
            return this.localWt - other.localWt;
        }

    }

    static ArrayList<ArrayList<Edge>> Prims(ArrayList<ArrayList<Graphs.Edge>> graph, int src) {

        PriorityQueue<PHelper> pq = new PriorityQueue<>();
        ArrayList<ArrayList<Graphs.Edge>> rgraph = new ArrayList<>();
        for (int i = 0; i < graph.size(); i++) {           //Initialise The ArrayList
            rgraph.add(new ArrayList<>());
        }

        pq.add(new PHelper(src, -1, 0));
        boolean visited[] = new boolean[graph.size()];
        while (pq.size() > 0) {
            PHelper rem = pq.peek();
            pq.remove();
            // get remove mark* work addChilderen
            if (visited[rem.vertex] == true) {
                continue;
            } else {
                visited[rem.vertex] = true;
            }
            if (rem.parent == -1) {

            } else {
                addEdge(rgraph, rem.vertex, rem.parent, rem.localWt);
            }

           

            for (int n = 0; n < graph.get(rem.vertex).size(); n++) {

                Graphs.Edge ne = graph.get(rem.vertex).get(n);

                if (visited[ne.n] == false) {

                    pq.add(new PHelper(ne.n, rem.vertex, ne.wt));

                }

            }

        }
        return rgraph;
    }

    public static void main(String args[]) {
        ArrayList<ArrayList<Graphs.Edge>> graph = new ArrayList<>();
        for (int i = 0; i < 7; i++) {           //Initialise The ArrayList
            graph.add(new ArrayList<>());
        }

        addEdge(graph, 0, 1, 10);
        addEdge(graph, 1, 2, 10);
        addEdge(graph, 2, 3, 10);
        addEdge(graph, 0, 3, 40);
        addEdge(graph, 3, 4, 2);
        addEdge(graph, 4, 5, 3);
        addEdge(graph, 4, 6, 8);
        addEdge(graph, 5, 6, 3);

        display(Prims(graph, 0));

    }

}
