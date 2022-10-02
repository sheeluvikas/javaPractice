package com.leetcode.easy;

public class SquareSubMatrix {

    public static void main(String[] args) {
        SquareSubMatrix matrix = new SquareSubMatrix();

        int[][] m = {
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 1, 1, 1}
        };
        System.out.println(matrix.countSquares(m));
    }

    public int countSquares(int[][] matrix) {
        int imax = matrix.length;
        int jmax = matrix.length;
        int count = 0;

        int max = Math.min(imax, jmax);

        return count;
    }
}
