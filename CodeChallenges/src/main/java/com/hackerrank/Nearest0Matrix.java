package com.hackerrank;


import java.util.Random;
import java.util.concurrent.*;

/**
 * https://leetcode.com/problems/01-matrix/
 *
 * Given a matrix consists of 0 and 1, find the distance of the nearest 0 for each cell.
 *
 * The distance between two adjacent cells is 1.
 *
 *
 *
 * Example 1:
 *
 * Input:
 * [[0,0,0],
 *  [0,1,0],
 *  [0,0,0]]
 *
 * Output:
 * [[0,0,0],
 *  [0,1,0],
 *  [0,0,0]]
 * Example 2:
 *
 * Input:
 * [[0,0,0],
 *  [0,1,0],
 *  [1,1,1]]
 *
 * Output:
 * [[0,0,0],
 *  [0,1,0],
 *  [1,2,1]]
 */
public class Nearest0Matrix {

    private static Future future;
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Nearest0Matrix nearest0Matrix = new Nearest0Matrix();
        Nearest0Matrix2 nearest0Matrix2 = new Nearest0Matrix2();
        Random rand = new Random();

        long startTime = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(8);
        for(int i = 0; i < 1000000; i++) {
            System.out.println(i);
            future = executorService.submit(new RunnableTask());
        }

        System.out.println(future.get());
        long endTime = System.currentTimeMillis();
        System.out.println("Time take : " + (endTime - startTime));
        executorService.shutdownNow();
    }
}
