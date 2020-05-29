package com.practice.concurrency;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {

    // will have one produce method, and one consume method.
    // will have one linked list

    private Queue<Integer> list;
    private int size;

    public Buffer(int size){
        this.list = new LinkedList<>();
        this.size = size;
    }


    /**
     * will continue producing the elements untill the queue is full
     *
     * @throws InterruptedException
     */
    public void produce() throws InterruptedException {
        int value = 0;
        while(true) {
            synchronized (this) {
                while (list.size() >= size) {
                    wait();
                }
                System.out.println("Producing the value : " + value);
                list.add(value++);
                notify();
                Thread.sleep(3000);
            }
        }
    }

    /**
     * Will continue consuming the elements untill the queue is empty
     * @throws InterruptedException
     */
    public void consume() throws InterruptedException {
        while(true) {
            synchronized (this) {
                while (list.size() == 0) {
                    wait();
                }
                System.out.println("Consuming : " + list.poll());
                notify();
                Thread.sleep(3000);
            }
        }
    }
}
