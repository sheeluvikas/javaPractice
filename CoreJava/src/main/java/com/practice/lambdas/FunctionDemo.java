package com.practice.lambdas;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class FunctionDemo {
    private static final Logger log = Logger.getLogger(FunctionDemo.class);
    public static void main(String[] args) {
        Function<Integer, Integer> function = (i) -> i * i;

        System.out.println(function.apply(5));

        List<Integer> list = new ArrayList<>();

        Predicate<Integer> p = (a) -> a == 10;



        list.add(1);
        list.add(2);
        list.add(3);

        list = list.stream().map(function).collect(Collectors.toList());

        list.stream().forEach(System.out::println);


        log.info("********** BiConsumer *************");
        BiConsumer<Integer, Integer> printSum = (x, y) -> System.out.println(x + y);
        BiConsumer<Integer, Integer> printSum1 = (x, y) -> System.out.println(x * y);
        BiConsumer<Integer, Integer> printSum2 = (x, y) -> System.out.println(x - y);

        printSum.accept(10, 20);
        printSum.andThen(printSum1).andThen(printSum2).accept(30, 20);


        log.info("********** Function *************");
        Function<Integer, Integer> squareFunction = (x) -> x * x;

        log.info(squareFunction.compose(squareFunction).apply(2));

        /*********************************  Predicate examples **************************************/

        log.info("********** Predicate *************");

        Predicate<Integer> equalTo10 = (x) -> 10 == x;
        Predicate<Integer> equalTo15 = (x) -> 15 == x;

        log.info(equalTo10.test(11));

        log.info(equalTo10.negate().test(11));

        log.info("Equal to 10 or 15 :" + equalTo10.or(equalTo15).test(15));

        Predicate<Integer> divisibleBy2 = (x) -> x % 2 == 0;
        Predicate<Integer> divisibleBy3 = (x) -> x % 3 == 0;

        log.info("Divisible by 2 and 3 :" + divisibleBy2.and(divisibleBy3).test(36));


    }


}
