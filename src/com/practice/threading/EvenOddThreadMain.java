package com.practice.threading;

/**
 * This class is used to ...
 *
 * @Author Vikas Katiyar email: vikaskatiyar@live.com
 * @Since 06-01-2019
 */
public class EvenOddThreadMain {

    public static void main(String[] args) {
        Print print = new Print();
        Thread t1 = new Thread(new OddEvenTask(print, 20, false), "Odd");
        Thread t2 = new Thread(new OddEvenTask(print, 20, true), "Even");

        t1.start();
        t2.start();
    }
}