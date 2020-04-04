package com.practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TempDemo {

    public static void main(String[] args) {
        int arr[] = new int[]{4, 0, 9, 2, 4};

        int pos1 = 0;
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] != 0){
                arr[pos1] = arr[i];
                if(pos1 != i) {
                    arr[i] = 0;
                }
                pos1 = pos1 + 1;
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
