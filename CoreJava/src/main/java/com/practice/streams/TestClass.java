package com.practice.streams;

public class TestClass {

    public static void sleep(Long time){
        try {
            System.out.println(Thread.currentThread().getId());
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
