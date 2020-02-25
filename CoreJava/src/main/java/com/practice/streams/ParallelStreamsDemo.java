package com.practice.streams;

import java.util.Arrays;
import java.util.List;

/**
 * This class shows the demo of how parallel stream works.
 *
 */
public class ParallelStreamsDemo {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 60);

        TestClass testClass = new TestClass();

        long startTime = System.currentTimeMillis();
        list.parallelStream().forEach(x -> testClass.sleep(2000L));
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
