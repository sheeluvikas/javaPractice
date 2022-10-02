package com;

public class Utils {

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void print2DArray(int [][] array){
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int minimumArray(int [] array){
        int minimum = array[0];
        for(int i = 1; i < array.length; i++){
            if(minimum < 0 || (array[i] >= 0 && array[i] < minimum)){
                minimum = array[i];
            }
        }
        return minimum;
    }
}
