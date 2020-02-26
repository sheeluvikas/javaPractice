package com.practice.streams;

import java.util.Arrays;
import java.util.List;

/**
 * This class shows the demo of how parallel stream works.
 *
 */
public class ParallelStreamsDemo {

    public static void main(String[] args) {
        List<Long> list = Arrays.asList(2000L, 2000L, 2000L, 2000L, 2000L, 2000L);

        TestClass testClass = new TestClass();

        long startTime = System.currentTimeMillis();
        list.parallelStream().forEach(TestClass::sleep);
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
