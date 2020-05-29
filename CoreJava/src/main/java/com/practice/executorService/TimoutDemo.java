package com.practice.executorService;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * https://winterbe.com/posts/2015/04/07/java8-concurrency-tutorial-thread-executor-examples/
 *
 *
 */
public class TimoutDemo {

    private static List<Future<String>> future = new ArrayList<>();
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        final ExecutorService executorService = Executors.newFixedThreadPool(2);

        queue.forEach(x -> {
            future.add(executorService.submit(new CallableTask(queue)));
        });

        future.stream().forEach(x -> {
            try {
                System.out.println(x.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });

        executorService.shutdown();

        /** ******************** ****************** */
        System.out.println("************ Invoke ALL ************");
        final ExecutorService executorService1 = Executors.newFixedThreadPool(2);
        future.clear();



        List<Callable<String>> callables = new ArrayList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        queue.forEach(x -> {
            callables.add(new CallableTask(queue));
        });

        executorService1.invokeAll(callables)
                .stream()
                .map( future -> {
                    try {
                        return future.get();
                    } catch (Exception e) {
                        throw new IllegalStateException();
                    }
                })
                .forEach(System.out::println);
    }
}
