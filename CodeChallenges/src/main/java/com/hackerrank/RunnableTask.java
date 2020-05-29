package com.hackerrank;

import com.Utils;
import jdk.nashorn.internal.codegen.CompilerConstants;

import java.util.Random;
import java.util.concurrent.Callable;

public class RunnableTask implements Callable {

    private Nearest0Matrix nearest0Matrix ;
    private Nearest0Matrix2 nearest0Matrix2 ;

    RunnableTask(){
        nearest0Matrix = new Nearest0Matrix();
        nearest0Matrix2 = new Nearest0Matrix2();
    }

    @Override
    public Object call() throws Exception {

        Thread.sleep(1000);
        Random rand = new Random();
        int[][] matrix = {
                {rand.nextInt(2)},
                {rand.nextInt(2)},
                {rand.nextInt(2)},
                {rand.nextInt(2)},
                {rand.nextInt(2)},
                {rand.nextInt(2)},
                {rand.nextInt(2)},
                {rand.nextInt(2)},
                {rand.nextInt(2)},
                {rand.nextInt(2)},
                {rand.nextInt(2)},
                {rand.nextInt(2)},
                {rand.nextInt(2)},
                {rand.nextInt(2)},
                {rand.nextInt(2)},
                {rand.nextInt(2)},
                {rand.nextInt(2)}
        };
        int[][] outMatrix = updateMatrix(matrix);
        int[][] matrix2 = nearest0Matrix2.updateMatrix(matrix);
        if(outMatrix != matrix2){
            System.out.println("Input Matrix :: " + Thread.currentThread().getName());
            Utils.print2DArray(matrix);
        }
        return null;
    }

    public int[][] updateMatrix(int[][] matrix) {
        int [][] minArray = matrix;
        for(int i = 0; i < matrix.length; i ++){
            for (int j = 0; j < matrix[i].length; j ++){
                if(matrix[i][j] == 1) {
                    if(matrix[i][j] >= 1) {
                        minArray[i][j] = getMinimumBoundary(matrix, minArray, i, j);
                    }
                }

            }
        }
        for(int i = matrix.length - 1; i >= 0; i --){
            for (int j = matrix[i].length-1; j >= 0; j --){
                if(matrix[i][j] >= 1) {
                    minArray[i][j] = getMinimumBoundary(matrix, minArray, i, j);
                }
            }
        }
        /*for(int i = matrix.length - 1; i >= 0; i --){
            for (int j = 0; j < matrix[i].length; j ++){
                if(matrix[i][j] >= 1) {
                    minArray[i][j] = getMinimumBoundary(matrix, minArray, i, j);
                }

            }
        }
        for(int i = 0; i < matrix.length; i ++){
            for (int j = matrix[i].length-1; j >= 0; j --){
                if(matrix[i][j] >= 1) {
                    minArray[i][j] = getMinimumBoundary(matrix, minArray, i, j);
                }
            }
        }*/

        return minArray;
    }

    public int getMinimumBoundary(int [][] matrix, int [][] minArray, int i, int j){
        int value1 = -1;
        int value2 = -1;
        int value3 = -1;
        int value4 = -1;
        if (j - 1 >= 0) {
            value1 = minArray[i][j - 1] + 1;
        }
        else {
            value1 = Integer.MAX_VALUE;
        }
        if (i - 1 >= 0) {
            value2 = minArray[i - 1][j] + 1;
        }
        else {
            value2 = Integer.MAX_VALUE;
        }
        if (j + 1 < matrix[i].length) {
            value3 = minArray[i][j + 1] + 1;
        }
        else {
            value3 = Integer.MAX_VALUE;
        }
        if (i + 1 < matrix.length) {
            value4 = minArray[i + 1][j] + 1;
        }
        else {
            value4 = Integer.MAX_VALUE;
        }
        int [] arr = {value1, value2, value3, value4};
        return minimumArray(arr);
    }

    private int minimumArray(int [] array){
        int minimum = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < minimum){
                minimum = array[i];
            }
        }
        return minimum;
    }
}
