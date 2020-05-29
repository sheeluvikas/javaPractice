package com.practice.concurrency.locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class SharedObject {

    ReentrantLock lock = new ReentrantLock();

    public void perform() throws InterruptedException {
//        lock.lock();
        lock.tryLock(1, TimeUnit.SECONDS);
        System.out.println("***** Is Locked : " + lock.isLocked() +
                ", Thread name : " + Thread.currentThread().getName() + " : " + lock.getHoldCount());

    }
}
