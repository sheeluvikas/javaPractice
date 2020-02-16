package com.practice.executorService;

import java.util.concurrent.Callable;

/**
 * This class is a callable task
 *
 * @Author Vikas Katiyar email: vikaskatiyar@live.com
 * @Since 10-03-2019
 */
public class CallableTask implements Callable {


    @Override
    public Object call() throws Exception {
        Thread.sleep(5000);
        return "Call completed successfully";
    }
}
