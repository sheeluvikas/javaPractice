package com.practice.concurrency;

/**
 * There are two processes, a producer and a consumer, that share a common buffer with a limited size.
 * The producer “produces” data and stores it in the buffer, and the consumer “consumes” the data,
 * removing it from the buffer. Having two processes that run in parallel,
 * we need to make sure that the producer will not put new data in the buffer when the buffer is full
 * and the consumer won’t try to remove data from the buffer if the buffer is empty
 *
 * https://dzone.com/articles/the-evolution-of-producer-consumer-problem-in-java
 *
 */
public class ProducerConsumerProblem {

    public static void main(String[] args) throws InterruptedException {
        // create a buffer class
        // create producer and consumer methods in buffer class
        // now, create two threads, one for producer, and another for consumer
        // join both of them (Producer thread and consumer thread)

        Buffer buffer = new Buffer(2);
        Thread producerThread = new Thread(() -> {
            try {
                buffer.produce();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        Thread consumerThread = new Thread(() -> {
            try {
                buffer.consume();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        );
        producerThread.start();
        consumerThread.start();

        producerThread.join();
        consumerThread.join();
    }
}
