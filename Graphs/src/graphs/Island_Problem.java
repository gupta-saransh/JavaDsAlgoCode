/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Saransh Gupta
 */
//Other version of get connected components
public class Island_Problem {

    static class IHelper {

        int i;
        int j;

        IHelper(int i, int j) {

            this.i = i;
            this.j = j;

        }

    }

    static boolean isValid(int[][] matrix, int i, int j) {

        if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length) {
            return false;

        } else if (matrix[i][j] == -1) {
            return false;

        } else if (matrix[i][j] > 0) {
            return false;

        } else {
            return true;
        }

    }
    static int count = 0;

    static String Island_GCCHelper(int[][] matrix, int i, int j) {
        String comp = "";
        LinkedList<IHelper> queue = new LinkedList<>();
        queue.add(new IHelper(i, j));
        while (queue.size() > 0) {

            IHelper rem = queue.getFirst();
            queue.removeFirst();

            if (matrix[rem.i][rem.j] > 0) {
                continue;
            } else {
                matrix[rem.i][rem.j] = 1;

            }
            comp += rem;
            if (isValid(matrix, rem.i + 1, rem.j)) {
                queue.add(new IHelper(rem.i + 1, rem.j));
            }
            if (isValid(matrix, rem.i - 1, rem.j)) {
                queue.add(new IHelper(rem.i - 1, rem.j));
            }
            if (isValid(matrix, rem.i, rem.j + 1)) {
                queue.add(new IHelper(rem.i, rem.j + 1));
            }
            if (isValid(matrix, rem.i, rem.j - 1)) {
                queue.add(new IHelper(rem.i, rem.j - 1));
            }

        }
        return comp;
    }

    static void Island_GCC(int[][] matrix) {

        ArrayList<String> al = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] == -1) {
                    al.add(Island_GCCHelper(matrix, i, j));
                    count++;
                }

            }

        }

        //System.out.print(al);
    }

    public static void main(String args[]) {
        int matrix[][] = {
            {0, 0, -1, 0, 0},
            {0, -1, -1, -1, -1},
            {-1, 0, 0, 0, -1},
            {0, -1, 0, -1, 0},
            {0, -1, -1, -1, 0}

        };

        Island_GCC(matrix);
        System.out.print(count);
    }

}
