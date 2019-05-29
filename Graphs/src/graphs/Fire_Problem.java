/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.util.LinkedList;

/**
 *
 * @author Saransh Gupta
 */
public class Fire_Problem {

    static class FireHelper {

        int i;
        int j;
        int time;

        public FireHelper(int i, int j, int time) {

            this.i = i;
            this.j = j;
            this.time = time;

        }

        static boolean isValid(int[][] matrix, int i, int j) {

            if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length) {
                return false;

            } else if (matrix[i][j] == -1) {
                return false;

            } else if (matrix[i][j] >= 0) {
                return false;

            } else {
                return true;
            }

        }

        // -2 normal,-1 water, 0 fire
        static void FireStorm(int[][] matrix) {
            LinkedList<FireHelper> queue = new LinkedList<>();
            for (int i = 0; i < matrix.length; i++) {

                for (int j = 0; j < matrix[0].length; j++) {

                    if (matrix[i][j] == 0) {
                        queue.add(new FireHelper(i, j, 0));

                    }

                }
            }

            while (queue.size() > 0) {

                FireHelper rem = queue.getFirst();
                queue.removeFirst();

                if (matrix[rem.i][rem.j] > 0) {
                    continue;
                } else {
                    matrix[rem.i][rem.j] = rem.time;
                }
                System.out.println(rem.i + "" + rem.j + " burnt at " + rem.time);
                if (isValid(matrix, rem.i + 1, rem.j)) {
                    queue.add(new FireHelper(rem.i + 1, rem.j, rem.time + 1));
                }
                if (isValid(matrix, rem.i - 1, rem.j)) {
                    queue.add(new FireHelper(rem.i - 1, rem.j, rem.time + 1));
                }
                if (isValid(matrix, rem.i, rem.j + 1)) {
                    queue.add(new FireHelper(rem.i, rem.j + 1, rem.time + 1));
                }
                if (isValid(matrix, rem.i, rem.j - 1)) {
                    queue.add(new FireHelper(rem.i, rem.j - 1, rem.time + 1));
                }

            }

        }

        public static void main(String args[]) {

            int matrix[][] = {
                {-2, -2, 0, -2, -2, -2},
                {-2, -1, -1, -2, -1, -1},
                {-2, -2, -1, -2, -2, -2},
                {-2, -2, -2, -2, -1, -1},
                {-2, -1, -1, 0, -2, -2}
            };
            FireStorm(matrix);
        }
    }
}
