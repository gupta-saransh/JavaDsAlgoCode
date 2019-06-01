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
public class Knights_Tour {

    static boolean isValid(int[][] chess, int row, int col) {

        if (row < 0 || row >= chess.length || col < 0 || col >= chess[0].length) {
            return false;

        } else if (chess[row][col] != -1) {
            return false;
        } else {

            return true;
        }

    }

    static int count = 0;

    static void KnightsTour(int[][] chess, int row, int col, int move) {
        if (move == chess.length * chess[0].length - 1) {

            chess[row][col] = move;
            count++;
//            System.out.println("--------" + count + "-----------");
//            for (int i = 0; i < chess.length; i++) {
//                for (int j = 0; j < chess[0].length; j++) {
//                    System.out.print(chess[i][j] + " \t");
//                }
//                System.out.println();
//            }
//
//            System.out.println("--------" + count + "-----------");
            chess[row][col] = -1;
            return;

        }

        chess[row][col] = move;
        if (isValid(chess, row - 2, col + 1)) {//-2,1
            KnightsTour(chess, row - 2, col + 1, move + 1);
        }
        if (isValid(chess, row - 1, col + 2)) {//-1,2
            KnightsTour(chess, row - 1, col + 2, move + 1);
        }
        if (isValid(chess, row + 1, col + 2)) {//1,2
            KnightsTour(chess, row + 1, col + 2, move + 1);
        }
        if (isValid(chess, row + 2, col + 1)) {//2,1
            KnightsTour(chess, row + 2, col + 1, move + 1);
        }
        if (isValid(chess, row + 2, col - 1)) {//2,-1
            KnightsTour(chess, row + 2, col - 1, move + 1);
        }
        if (isValid(chess, row + 1, col - 2)) {//1,-2
            KnightsTour(chess, row + 1, col - 2, move + 1);
        }
        if (isValid(chess, row - 1, col - 2)) {//-1,-2
            KnightsTour(chess, row - 1, col - 2, move + 1);
        }
        if (isValid(chess, row - 2, col - 1)) {//-2,-1
            KnightsTour(chess, row - 2, col - 1, move + 1);
        }

        chess[row][col] = -1;

    }

    public static void main(String args[]) {

        int[][] chess = new int[5][6];
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[0].length; j++) {
                chess[i][j] = -1;
            }
        }

        KnightsTour(chess, 1, 1, 0);
        System.out.print(count);

    }
}
