package com.hackerrank;

import com.Utils;

import java.util.Random;

/**
 * https://leetcode.com/problems/01-matrix/
 *
 */
public class Nearest0Matrix2 {


    public static void main(String[] args) {
        Nearest0Matrix2 nearest0Matrix2 = new Nearest0Matrix2();
        Random rand = new Random();

            int[][] matrix = {
                    {rand.nextInt(2),rand.nextInt(2),rand.nextInt(2),rand.nextInt(2)},
                    {rand.nextInt(2),rand.nextInt(2),rand.nextInt(2),rand.nextInt(2)},
                    {rand.nextInt(2),rand.nextInt(2),rand.nextInt(2),rand.nextInt(2)},
                    {rand.nextInt(2),rand.nextInt(2),rand.nextInt(2),rand.nextInt(2)},
                    {rand.nextInt(2),rand.nextInt(2),rand.nextInt(2),rand.nextInt(2)},
            };
            System.out.println("Input Matrix :: ");
            Utils.print2DArray(matrix);
            int[][] matrix2 = nearest0Matrix2.updateMatrix(matrix);
        System.out.println("Output Matrix ::");
        Utils.print2DArray(matrix2);
    }
    public int[][] updateMatrix(int[][] matrix) {
        int zeroCount = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    zeroCount ++;
                }
            }
        }


        int[][] location = new int[zeroCount][2];
        int pos = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 0){
                    location[pos][0] = i;
                    location[pos][1] = j;
                    pos++;
                }
            }
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 1){
                    matrix[i][j] = distance(i, j, location);
                }
            }
        }
        return matrix;
    }

    private int distance(int i, int j, int[][] array) {
        int smallestDistance = -1;
        for(int k = 0; k < array.length; k++){
            int value1 = Math.abs(array[k][0] - i);
            int value2 = Math.abs(array[k][1] - j);
            if(smallestDistance == -1){
                smallestDistance = value1 + value2;
            }
            else if(smallestDistance > (value1 + value2)){
                smallestDistance = value1 + value2;
            }
        }
        return smallestDistance;
    }
}
