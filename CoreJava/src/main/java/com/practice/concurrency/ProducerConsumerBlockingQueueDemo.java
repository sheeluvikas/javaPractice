package com.practice.concurrency;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * Producer Consumer problem with the help of BlockingQueue
 *
 */
public class ProducerConsumerBlockingQueueDemo {


    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<Integer> blockingQueue = new LinkedBlockingDeque<>(10);
        // create a producer thread
        // create a consumer thread
        // use a blocking Queue to put and take the elements
        // start both the threads
        // join both the threads

        Thread producerThread = new Thread(() -> {
            int value = 0;
            try {
                while (true) {
                    System.out.println("Producing the value : " + value);
                    blockingQueue.put(value++);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread consumerThread = new Thread(() -> {
            int value = 0;
            try {
                while (true) {
                    value = blockingQueue.take();
                    System.out.println("Consuming : " + value);
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producerThread.start();
        consumerThread.start();

        producerThread.join();
        consumerThread.join();
    }
}
