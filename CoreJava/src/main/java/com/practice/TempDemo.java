package com.practice;

import java.util.Arrays;
import java.util.List;

public class TempDemo {

    public static void main(String[] args) {

        int x[] = {1, 2, 3};
        int y[] = x;
        x[2] = 5;
        for (int i = 0; i < 3; i++){
            System.out.println(y[i]);
        }
    }
}
