package com.practice.threading.join;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * This class explains the usage of synchronized and locks.
 *
 */
public class ThreadJoinDemo {

    public static void main(String[] args) throws InterruptedException {

        Number  number = new Number();

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for(int i = 0; i < 100; i++) {
            executorService.submit(() -> {
                Random random = new Random();
                int value = random.nextInt(10);
                try {
                    /** getFactorial method uses synchronized, and getLockFactorial uses lock*/
//                    long val = number.getFactorial(value); // uncomment and comment the below line
                    long val = number.getLockFactorial(value);
                    System.out.println("Factorial of :" + value + " is :" + val);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }
}
