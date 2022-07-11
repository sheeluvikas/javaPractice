package com.practice.streams;

import java.util.List;
import java.util.stream.Collectors;

public class GroupingByDemo {

    public static void main(String[] args) {
        List<Integer> list = Utils.getRandomIntegerList(100,6);

        System.out.println(list.stream().collect(Collectors.groupingBy(x -> x % 2 == 0)));



    }
}
