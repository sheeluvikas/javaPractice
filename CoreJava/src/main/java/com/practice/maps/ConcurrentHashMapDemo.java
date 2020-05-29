package com.practice.maps;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

/**
 * This class is used to ...
 *
 * @Author Vikas Katiyar email: vikaskatiyar@live.com
 * @Since 13-01-2019
 */
public class ConcurrentHashMapDemo {

    public static void main(String args[]) throws InterruptedException {

//        Map<Integer, String> map = new Hashtable<>();
//        Map<Integer, String> map = new HashMap<>();
        Map<Integer, String> map = new ConcurrentHashMap<>();
        ExecutorService executorService  = Executors.newFixedThreadPool(8);
        //here we can create intstream

        long startTime = System.currentTimeMillis();
        IntStream.range(0, 100000).forEach(x -> {
            executorService.submit(() ->
            {
                map.put(x, x + "");
            });
        });

        executorService.shutdown();
        long endTime = System.currentTimeMillis();
        IntStream.range(0, 1000).forEach(x -> {
            System.out.println(x + "->" + map.get(x));
        });
        System.out.println(endTime - startTime);
        executorService.shutdownNow();
    }
}
