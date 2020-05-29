package com.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {

    public static void main(String[] args) {

        List list = Arrays.asList("Vikas", "Katiyar");
        List list1 = Arrays.asList("Rahul", "Sharma");
        List<List<String>> lists = Arrays.asList(list, list1);

        List<String> newList = lists.stream().flatMap(l -> l.stream())
                .collect(Collectors.toList());

        newList.stream().forEach(System.out::println);

    }
}
