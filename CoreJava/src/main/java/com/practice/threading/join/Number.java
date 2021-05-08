package com.practice.threading.join;

import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class Number {

    private int number;
    private long fact;

    private static ReentrantLock lock = new ReentrantLock();

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    /**
     * Here is an example of synchronized method.
     * if we remove the synchronized, the output will be weird there would be no thread safety.
     *
     * @param n
     * @return
     * @throws InterruptedException
     */
    synchronized public long getFactorial(int n) throws InterruptedException {
        fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }
        Random random = new Random();
        Thread.sleep(random.nextInt(200));
        return fact;
    }

    /**
     * Here is an example of Reentrant Lock.
     *
     * @param n
     * @return
     * @throws InterruptedException
     */
    public long getLockFactorial(int n) throws InterruptedException {
        lock.lock();
        fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }
        Random random = new Random();
        Thread.sleep(random.nextInt(200));
        lock.unlock();
        return fact;
    }

}
