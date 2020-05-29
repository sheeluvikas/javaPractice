package com.practice.threading.temp;

public class OddEvenThreadMain {

    public static void main(String[] args) {
        Print print = new Print();
        Thread t1 = new Thread(new OddEvenTask(true, 10, print));
        Thread t2 = new Thread(new OddEvenTask(false, 10, print));

        t1.start();
        t2.start();
    }
}
