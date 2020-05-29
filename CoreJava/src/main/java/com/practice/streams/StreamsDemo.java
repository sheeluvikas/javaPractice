package com.practice.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * This class elaborate the concept of Streams in java 8
 *
 */
public class StreamsDemo {

    public static void main(String[] args) {

        /** forEach using List */
        System.out.println("****** List ******");
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        list.stream().forEach(System.out::println);

        //****************
        /** forEach using map */
        System.out.println("****** Map ******");

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Vikas");
        map.put(2, "Rahul");
        map.put(3, "Kumar");
        map.put(4, "Sumit");

        map.forEach((key, value) -> {
            if(key == 4) {
                System.out.println(value);
            }
        });

        IntStream intStream = list.stream().mapToInt(x -> x * x);
        intStream.forEach(System.out::println);


        /*** Other Streams ***/
        System.out.println("*************");

        Stream stream = Stream.of(1, 2,3);
        stream.forEach(System.out::println);

    }
}
