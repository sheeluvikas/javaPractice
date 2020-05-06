package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TempDemo {

    public static void main(String[] args) {

        List<String> address = new ArrayList<>();

        String s = address.stream().collect(Collectors.joining("\n"));
        System.out.println("value is : " + s);


        int i = 2147483647;
        System.out.println(i);
    }
}
