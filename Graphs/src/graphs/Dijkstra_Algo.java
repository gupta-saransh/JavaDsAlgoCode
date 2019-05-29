/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;
/*

 USED TO FIND MINIMUM DISTANCE BETWEEN A SOURCE AND ALL THE DESTINATIONS

 */

import static graphs.Graphs.*;
import java.util.*;

/**
 *
 * @author Saransh Gupta
 */
public class Dijkstra_Algo {

    static class DHelper implements Comparable<DHelper> {

        int vertex;
        String psf;
        int dsf;

        DHelper(int vertex, String psf, int dsf) {
            this.vertex = vertex;
            this.psf = psf;
            this.dsf = dsf;

        }

        @Override
        public int compareTo(DHelper other) {
            return this.dsf - other.dsf;
        }

    }

    static void Dijkstra(ArrayList<ArrayList<Edge>> graph, int src) {

        PriorityQueue<DHelper> pq = new PriorityQueue<>();

        pq.add(new DHelper(src, "0", 0));
        boolean visited[] = new boolean[graph.size()];
        while (pq.size() > 0) {
            DHelper rem = pq.peek();
            pq.remove();
            // get remove mark* work addChilderen
            if (visited[rem.vertex] == true) {
                continue;
            } else {
                visited[rem.vertex] = true;
            }

            System.out.println(rem.vertex + " via " + rem.psf + " @ " + rem.dsf);

            for (int n = 0; n < graph.get(rem.vertex).size(); n++) {

                Edge ne = graph.get(rem.vertex).get(n);

                if (visited[ne.n] == false) {

                    pq.add(new DHelper(ne.n, rem.psf + ne.n, rem.dsf + ne.wt));

                }

            }

        }

    }

    public static void main(String args[]) {
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
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

        Dijkstra(graph, 0);

    }
}
