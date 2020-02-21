package com.practice.executorService;

import org.apache.log4j.Logger;

import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * This class is a callable task
 *
 * @Author Vikas Katiyar email: vikaskatiyar@live.com
 * @Since 10-03-2019
 */
public class CallableTask implements Callable {

    private final ConcurrentLinkedQueue<Integer> concurrentLinkedQueue;

    public CallableTask(ConcurrentLinkedQueue<Integer> concurrentLinkedQueue) {
        this.concurrentLinkedQueue = concurrentLinkedQueue;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(5000);
        return "CallableTask : Call completed successfully !!!" + concurrentLinkedQueue.poll();
    }
}
