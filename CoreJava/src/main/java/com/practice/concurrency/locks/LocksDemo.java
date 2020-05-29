package com.practice.concurrency.locks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LocksDemo {

    public static void main(String[] args) {

        SharedObject sharedObject = new SharedObject();
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for(int i = 0; i < 100; i++) {
            executorService.submit(new CallableTask(sharedObject));
        }

        executorService.shutdown();
    }
}
