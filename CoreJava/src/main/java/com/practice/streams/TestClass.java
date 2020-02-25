package com.practice.streams;

public class TestClass {

    public void sleep(Long time){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
