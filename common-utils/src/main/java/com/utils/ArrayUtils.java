package com.utils;

public class ArrayUtils<T> {

    public void printArray(T []arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public void print2DArray(T [][] arr){
        for(int i = 0; i < arr[0].length; i++){
            for(int j = 0; j < arr.length; j++){
                System.out.println(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
