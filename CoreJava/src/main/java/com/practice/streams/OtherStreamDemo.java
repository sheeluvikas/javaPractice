package com.practice.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * This Class explains the usage of IntStream and how can we get the nth element
 * using the stream.
 *
 */
public class OtherStreamDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(5);
        list.add(6);
        list.add(8);

        OptionalDouble optionalDouble = IntStream.rangeClosed(0, 5).average();
        System.out.println(optionalDouble.getAsDouble());

        System.out.println("******* 3rd Element **********");

        List<Integer> elementList = IntStream.range(0, list.size())
                .filter(n -> n == 2)
                .mapToObj(list :: get)
                .collect(Collectors.toList());
        elementList.forEach(System.out::println);


    }
}
