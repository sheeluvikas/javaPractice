package com.practice.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * This class illustrates the findFirst, findAny and other similar methods of the stream().
 */
public class FindDemo {

    public static void main(String[] args) {
        List<Integer> list = Utils.getRandomIntegerList(100, 5);
        System.out.println(list);

        /**
         * findFirst();
         */
        Optional<Integer> i = list.stream().findFirst();
        i.ifPresent(System.out::println);


        /**
         * findAny();
         */
        i = list.stream().findAny();
        i.ifPresent(System.out::println);

        List<List<Integer>> outerList = new ArrayList<>();
        outerList.add(list);
        outerList.add(list);
        outerList.stream().forEach(System.out::println);


        Stream<List> stream = Stream.of(outerList);

        stream = stream.flatMap(x -> outerList.stream());

        System.out.println("********* Printing flatmap stream");
        stream.forEach(System.out::println);
    }
}
