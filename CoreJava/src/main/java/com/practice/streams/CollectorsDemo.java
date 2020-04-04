package com.practice.streams;

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * This Class explains the usage of the various Collectors methods like groupingBy, partitioningBy, etc.
 *
 */
public class CollectorsDemo {

    private static final Logger log = Logger.getLogger(CollectorsDemo.class);
    public static void main(String[] args) {
        List<Integer> list = Utils.getRandomIntegerList(100,6);
        log.info(list);

        /** Groups them */
        Map<Integer, List<Integer>> groupingMap = list.stream().collect(Collectors.groupingBy(Integer::intValue));
        log.info("********* Grouping Map ***********");
        log.info(groupingMap);

        /** Partitioning Collector, partition them into TWO groups, based on the given predicate
         * The two keys will be false and true. */
        Predicate<Integer> greaterThan30Predicate = (Integer i) -> i > 30;

        Map<Boolean, List<Integer>> partitionMap = list.stream()
                .collect(Collectors.partitioningBy(greaterThan30Predicate));
        log.info("************ Paritioning Map **********");
        log.info(partitionMap);


        /** BiConsumer to take two values and print the Sum of those two */
    }
}
