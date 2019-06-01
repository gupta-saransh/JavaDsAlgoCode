/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import graphs.Graphs.Edge;
import graphs.Kruskal_Algo.KEdge;
import java.util.ArrayList;

/**
 *
 * @author Saransh Gupta
 */
public class BellmanFord_Algo {

    void bellmanFord(ArrayList<ArrayList<Edge>> graph, int src) {

        int res[] = new int[graph.size()];

        res[src] = 0;

        ArrayList<KEdge> alledges = new ArrayList<>();

        for (int v = 0; v < graph.size(); v++) {

            for (int n = 0; n < graph.get(v).size(); n++) {
                Edge ne = graph.get(v).get(n);
                KEdge ke = new KEdge(v, ne.n, ne.wt);
                alledges.add(ke);
            }
        }

        for (int i = 0; i < graph.size() - 1; i++) {

            for (int j = 0; j < alledges.size(); j++) {
                KEdge ke = alledges.get(j);

                if (res[ke.u] != Integer.MAX_VALUE) {

                    if (res[ke.u] + graph.get(ke.u).get(ke.v).wt < res[ke.v]) {

                        res[ke.v] = res[ke.u] + graph.get(ke.u).get(ke.v).wt;
                    }

                }

            }
        }

    }
}
