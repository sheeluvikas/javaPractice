package com.practice.threading;

public class Print {

    synchronized public void printEven(int number) throws InterruptedException {
        if(number %2 == 0) {
            System.out.println(number);
            notify();
        }
        else {
            wait();
        }
    }

    synchronized public void printOdd(int number) throws InterruptedException {
        if(number % 2 != 0){
            System.out.println(number);
            notify();
        }
        else {
            wait();
        }
    }
}
