/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import static graphs.Graphs.*;
import java.util.*;

/**
 *
 * @author Saransh Gupta
 */
public class Kruskal_Algo {

    static class KEdge implements Comparable<KEdge> {

        int u;
        int v;
        int wt;

        KEdge(int u, int v, int wt) {

            this.u = u;
            this.v = v;
            this.wt = wt;

        }

        @Override
        public int compareTo(KEdge other) {
            return this.wt - other.wt;
        }

    }

    static int find(int[] pointerArr,int vtx)
    {
    
        if(pointerArr[vtx]==vtx)
            return vtx;
        else
        {
        int val=find(pointerArr,pointerArr[vtx]);
        return val;
        }
    
    }
    static void merge(int[] pa,int[] ra,int v1sL,int v2sL)
    {
    
        if(ra[v1sL]<ra[v2sL])
        {
            pa[v1sL]=v2sL;
            
            
        }
        else if(ra[v2sL]<ra[v1sL])
        {
            pa[v2sL]=v1sL;
            
        
        }
        else
        {
            pa[v2sL]=v1sL;
            ra[v1sL]++;

        }
    
    }
    static ArrayList<ArrayList<Edge>> Kruskal(ArrayList<ArrayList<Edge>> graph) {

        PriorityQueue<KEdge> pq = new PriorityQueue<>();
        ArrayList<ArrayList<Graphs.Edge>> mst = new ArrayList<>();
        for (int i = 0; i < graph.size(); i++) {           //Initialise The ArrayList
            mst.add(new ArrayList<>());
        }

        int pointerArr[] = new int[graph.size()];
        int rankArr[] = new int[graph.size()];

        for (int i = 0; i < graph.size(); i++) {
            pointerArr[i] = i;
        }
        for (int i = 0; i < graph.size(); i++) {
            rankArr[i] = 1;
        }

        for (int v = 0; v < graph.size(); v++) {
            for (int n = 0; n < graph.get(v).size(); n++) {
                Edge ne = graph.get(v).get(n);

                if (v < ne.n) {
                    pq.add(new KEdge(v, ne.n, ne.wt));
                    System.out.println(v+" "+ ne.n+" "+ ne.wt);
                }

            }
        }
        int count = 0;
        while (pq.size() > 0 && count < graph.size() - 1) {
            KEdge Ke = pq.peek();
            pq.remove();
            int v1setLeader = find(pointerArr, Ke.u);
            int v2setLeader = find(pointerArr, Ke.v);

            if (v1setLeader != v2setLeader) {
                addEdge(mst, Ke.u, Ke.v, Ke.wt);
                merge(pointerArr, rankArr, v1setLeader, v2setLeader);
                count++;
            }

        }
return mst;
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

        display(Kruskal(graph));
    }

}
