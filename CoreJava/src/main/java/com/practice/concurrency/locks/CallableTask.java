package com.practice.concurrency.locks;

import java.util.concurrent.Callable;

public class CallableTask implements Callable {

    private SharedObject sharedObject;

    public CallableTask(SharedObject sharedObject) {
        this.sharedObject = sharedObject;
    }

    @Override
    public Object call() throws Exception {
        sharedObject.perform();
        return 1;
    }
}
