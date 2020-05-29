package com.practice.threading.join;

public class ThreadProcess extends Thread {

    public  void run(){
        System.out.println("This is the run : " + Thread.currentThread().getName());
    }
}
