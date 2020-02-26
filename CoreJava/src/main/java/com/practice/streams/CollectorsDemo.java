package com.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * This Class explains the usage of the various Collectors methods like groupingBy, partitioningBy, etc.
 *
 */
public class CollectorsDemo {

    public static void main(String[] args) {
        List<Integer> list = Utils.getRandomIntegerList(100,6);
        System.out.println(list);

        /** Groups them */
        Map<Integer, List<Integer>> groupingMap = list.stream().collect(Collectors.groupingBy(Integer::intValue));
        System.out.println("********* Grouping Map ***********");
        System.out.println(groupingMap);

        /** Partitioning Collector, partition them into TWO groups, based on the given predicate
         * The two keys will be false and true. */
        Predicate<Integer> greaterThan30Predicate = (Integer i) -> i > 30;

        Map<Boolean, List<Integer>> partitionMap = list.stream()
                .collect(Collectors.partitioningBy(greaterThan30Predicate));
        System.out.println("************ Paritioning Map **********");
        System.out.println(partitionMap);

    }
}
