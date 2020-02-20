package com.practice.threading;

/**
 * This class is used to spawn even and odd threads for printing even and odd numbers in sequence.
 *
 * @Author Vikas Katiyar email: vikaskatiyar@live.com
 * @Since 06-01-2019
 */
public class EvenOddThreadMain {

    public static void main(String[] args) throws InterruptedException {
        Print print = new Print();
        Thread t1 = new Thread(new OddEvenTask(print, 20, false), "Odd");
        Thread t2 = new Thread(new OddEvenTask(print, 20, true), "Even");

        t1.start();
        t2.start();

        t1.join();
        System.out.println("Main completed !!!");
    }
}