package com.practice.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class FunctionDemo {
    public static void main(String[] args) {
        Function<Integer, Integer> function = (i) -> i * i;

        System.out.println(function.apply(5));

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);

        list = list.stream().map(function).collect(Collectors.toList());

        list.stream().forEach(System.out::println);
    }


}
