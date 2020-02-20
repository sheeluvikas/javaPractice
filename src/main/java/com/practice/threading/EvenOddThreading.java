package com.practice.threading;

/**
 * This class shows the example for printing Even and Odd numbers in sequence using threads.
 * This will be using the concepts of thread synchronization and inter thread communication.
 *
 * taken from : https://www.baeldung.com/java-even-odd-numbers-with-2-threads
 *
 * for more information in threads please go to https://www.baeldung.com/java-thread-lifecycle
 *
 * @Author Vikas Katiyar email: vikaskatiyar@live.com
 * @Since 06-01-2019
 */
public class EvenOddThreading implements Runnable {

    private int number;
    private int max;
    public synchronized void evenOddTask(){

    }


    @Override
    public void run() {
        while(number <= max){
            if(isEven(number)){
            }
        }

    }

    private boolean isEven(int number){
        if(number %2 == 0){
            return true;
        }
        return false;
    }
}
