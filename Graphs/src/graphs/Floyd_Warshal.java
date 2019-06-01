    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package graphs;

    import graphs.Graphs.Edge;
    import java.util.ArrayList;

    /**
     *
     * @author Saransh Gupta
     */
    public class Floyd_Warshal {



        static void FloydWarshal(ArrayList<ArrayList<Edge>> graph) {
            int res[][] = new int[graph.size()][graph.size()];

            for (int i = 0; i < res.length; i++) {
                for (int n = 0; n < res[i].length; n++) {
                    res[i][n] = Integer.MAX_VALUE;

                }
            }

            for (int i = 0; i < graph.size(); i++) {
                res[i][i] = 0;
                for (int n = 0; n < graph.get(i).size(); n++) {
                    Edge ne = graph.get(i).get(n);
                    res[i][ne.n] = ne.wt;

                }
            }

            for (int i = 0; i < graph.size(); i++) {
                for (int s = 0; s < graph.size(); s++) {
                    for (int d = 0; d < graph.size(); d++) {

                        if (i == s || i == d || s == d) {
                            continue;
                        } else if (res[i][d] == Integer.MAX_VALUE || res[s][i] == Integer.MAX_VALUE) {
                            continue;
                        } else {

                            if (res[s][i] + res[i][d] < res[s][d]) {
                                res[s][d] = res[s][i] + res[i][d];
                            }

                        }

                    }
                }
            }

            for(int i=0;i<graph.size();i++)
            {

            for(int j=0;j<graph.size();j++)
            {

                System.out.print(res[i][j]+"\t\t\t\t");
            }
            System.out.println();
            }

        }
        public static void main(String args[])
        {

             ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
             for (int i = 0; i < 4; i++) {           //Initialise The ArrayList
                graph.add(new ArrayList<>());
            }

             graph.get(0).add(new Edge(1,2));
             graph.get(0).add(new Edge(2,4));
             graph.get(0).add(new Edge(3,8));
             graph.get(1).add(new Edge(2,1));
             graph.get(1).add(new Edge(3,5));
             graph.get(2).add(new Edge(3,1));

             FloydWarshal(graph);



        }

    }
