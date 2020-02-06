package com.practice.executorService;

import java.util.concurrent.*;

/**
 * This class is used to give demo example of ExecutorService.
 *
 * @href : https://www.youtube.com/watch?v=6Oo-9Can3H8
 * 
 *
 *
 * @Author Vikas Katiyar email: vikaskatiyar@live.com
 * @Since 10-03-2019
 */
public class ExecutorServiceDemo {

    public static void main(String agrs[]) throws Exception{
//        ExecutorService executorService = new ThreadPoolExecutor(10, 10,
//                1L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
        int coreCount = Runtime.getRuntime().availableProcessors();
        System.out.println("Core count = "+coreCount);
        ExecutorService executorService1 = Executors.newFixedThreadPool(coreCount);

        Future<String> future = executorService1.submit(new CallableTask());
        /** Future is nothing but a place holder which will arrive in sometime of the future*/


        System.out.println("The task in between");
        System.out.println(future.get());// this is the blocking method
        System.out.println("Main Method ends here");
        executorService1.shutdownNow();
    }
}
