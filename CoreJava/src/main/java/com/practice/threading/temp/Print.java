package com.practice.threading.temp;

public class Print {

    public void print(int number, boolean isEvenThread) throws InterruptedException {
        if(number % 2 == 0 && isEvenThread){
            System.out.println(number);
            notify();
        }
        else if(number % 2 == 0 && !isEvenThread){
            wait();
        }
        else if(number %2 != 0 && isEvenThread){
            wait();
        }
        else {
            System.out.println(number);
            notify();
        }
    }
}
