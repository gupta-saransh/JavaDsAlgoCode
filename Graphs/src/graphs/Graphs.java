/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import static graphs.BFS_DFS.BFS;
import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Saransh Gupta
 */
public class Graphs {

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

    static boolean hasPath(ArrayList<ArrayList<Edge>> graph, int src, int dest, boolean visited[]) {

        if (src == dest) {
            return true;
        }
        visited[src] = true;
        for (int i = 0; i < graph.get(src).size(); i++) {

            if (visited[graph.get(src).get(i).n] == false) {

                if (hasPath(graph, graph.get(src).get(i).n, dest, visited) == true) {
                    return true;
                }
            }
        }

        return false;
    }

    static void AllPath(ArrayList<ArrayList<Edge>> graph, int src, int dest, boolean visited[], String psf, int sum) {

        if (src == dest) {
            String print = psf + "->" + dest + "@" + sum;
            System.out.println(print);
            //psf="";
            return;
        }
        visited[src] = true;
        //psf+=src+"->";

        for (int i = 0; i < graph.get(src).size(); i++) {

            Edge ne = graph.get(src).get(i);

            if (visited[ne.n] == false) {
                AllPath(graph, ne.n, dest, visited, psf + src + "->", sum + ne.wt);

            }

        }
        visited[src] = false;
    }

    static void AllPath_Inclusive(ArrayList<ArrayList<Edge>> graph, int src, int dest, boolean visited[], String psf, int sum) {

        if (src == dest) {
            String print = psf + "@" + sum;
            System.out.println(print);
            //psf="";
            return;
        }

        for (int i = 0; i < graph.get(src).size(); i++) {

            Edge ne = graph.get(src).get(i);

            if (visited[ne.n] == false) {
                visited[ne.n] = true;
                AllPath_Inclusive(graph, ne.n, dest, visited, psf + ne.n + "->", sum + ne.wt);
                visited[ne.n] = false;
            }

        }

    }
    static int max = Integer.MIN_VALUE;
    static String lpath;
    static int min = Integer.MAX_VALUE;
    static String spath;

    static void LargestPath(ArrayList<ArrayList<Edge>> graph, int src, int dest, boolean visited[], String psf, int sum) {

        if (src == dest) {

            if (sum > max) {
                lpath = psf;
                max = sum;
            }
            //psf="";
            return;
        }

        for (int i = 0; i < graph.get(src).size(); i++) {

            Edge ne = graph.get(src).get(i);

            if (visited[ne.n] == false) {
                visited[ne.n] = true;
                LargestPath(graph, ne.n, dest, visited, psf + ne.n + "->", sum + ne.wt);
                visited[ne.n] = false;
            }

        }

    }

    static void SmallestPath(ArrayList<ArrayList<Edge>> graph, int src, int dest, boolean visited[], String psf, int sum) {

        if (src == dest) {

            if (sum < min) {
                spath = psf;
                min = sum;
            }
            //psf="";
            return;
        }

        for (int i = 0; i < graph.get(src).size(); i++) {

            Edge ne = graph.get(src).get(i);

            if (visited[ne.n] == false) {
                visited[ne.n] = true;
                SmallestPath(graph, ne.n, dest, visited, psf + ne.n + "->", sum + ne.wt);
                visited[ne.n] = false;
            }

        }

    }
    static String cpath;
    static int cmin = Integer.MAX_VALUE;

    static void CeilPath(ArrayList<ArrayList<Edge>> graph, int src, int dest, boolean visited[], String psf, int sum, int ceil) {

        if (src == dest) {

            if (sum > ceil && sum < cmin) {
                cpath = psf;
                cmin = sum;
            }
            //psf="";
            return;
        }

        for (int i = 0; i < graph.get(src).size(); i++) {

            Edge ne = graph.get(src).get(i);

            if (visited[ne.n] == false) {
                visited[ne.n] = true;
                CeilPath(graph, ne.n, dest, visited, psf + ne.n + "->", sum + ne.wt, ceil);
                visited[ne.n] = false;
            }

        }

    }
    static String fpath;
    static int fmax = Integer.MIN_VALUE;

    static void FloorPath(ArrayList<ArrayList<Edge>> graph, int src, int dest, boolean visited[], String psf, int sum, int floor) {

        if (src == dest) {

            if (sum < floor && sum > fmax) {
                fpath = psf;
                fmax = sum;
            }
            //psf="";
            return;
        }

        for (int i = 0; i < graph.get(src).size(); i++) {

            Edge ne = graph.get(src).get(i);

            if (visited[ne.n] == false) {
                visited[ne.n] = true;
                FloorPath(graph, ne.n, dest, visited, psf + ne.n + "->", sum + ne.wt, floor);
                visited[ne.n] = false;
            }

        }

    }
    static String kfpath;
    static int kfmax = Integer.MIN_VALUE;

    //TO Find Floor of FLoor K times to get Kth largest path
    static void KLargestPath(ArrayList<ArrayList<Edge>> graph, int src, int dest, boolean visited[], int sum, int k) {

        int limit = Integer.MIN_VALUE;
        String kpath = "";

        for (int i = 0; i < k; i++) {
            fmax = Integer.MIN_VALUE;
            fpath = "";
            visited[src] = true;
            String psf = "";
            FloorPath(graph, src, dest, visited, psf + src, sum, limit);
            //fp and fpd will contain values
            limit = fmax;
            psf = fpath;

        }

    }

    static void HamilTonian(ArrayList<ArrayList<Edge>> graph) {

        boolean[] visited = new boolean[graph.size()];
        ArrayList<Integer> psf = new ArrayList<>();
        HamilTonianHelper(graph, psf, visited, 2);

    }

    static void HamilTonianHelper(ArrayList<ArrayList<Edge>> graph, ArrayList<Integer> psf, boolean[] visited, int src) {

        if (psf.size() == graph.size() -1) {

            psf.add(src);

            int last = src;
            boolean cycle = false;
            for (int i = 0; i < graph.get(psf.get(0)).size(); i++) {

                Edge ne = graph.get(psf.get(0)).get(i);

                if (ne.n == last) {
                    cycle = true;
                    break;
                }

            }

            System.out.println(psf);

            if (cycle == true) {
                System.out.print("*");
            } else {
                System.out.print(".");
            }
            //psf="";
            psf.remove(psf.size() - 1);
            return;
        }
        visited[src] = true;
        //psf+=src+"->";

        for (int i = 0; i < graph.get(src).size(); i++) {

            Edge ne = graph.get(src).get(i);

            if (visited[ne.n] == false) {
                psf.add(src);
                HamilTonianHelper(graph, psf, visited, ne.n);
                psf.remove(psf.size() - 1);

            }

        }
        visited[src] = false;

    }

    public static void main(String[] args) {
        // TODO code application logic here

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
        addEdge(graph, 2, 5, 10);
        display(graph);
//        graph.add(new ArrayList<>());       //Add New Vertex
//        addEdge(graph, 7, 4, 1);
//        addEdge(graph, 7, 6, 1);
//        display(graph);
        boolean visited[] = new boolean[7];
        //System.out.println(hasPath(graph, 0, 6, visited));
//        AllPath(graph, 0, 6, visited, "", 0);
        // visited[0] = true;
        //     AllPath_Inclusive(graph, 0, 6, visited, ""+"0"+"->",0);

//        LargestPath(graph, 0, 6, visited, "0->", 0);
//        System.out.println(lpath);
//        SmallestPath(graph, 0, 6, visited, "0->", 0);
//        System.out.println(spath);
//        CeilPath(graph, 0, 6, visited, "0->", 0, 45);
//        System.out.println(cpath);
//        //FloorPath(graph, 0, 6, visited, "0->", 0, 45);
//
//        KLargestPath(graph, 0, 6, visited, 0, 0);
//        System.out.println(fpath + fmax);
        HamilTonian(graph);

    }

}
