package com.practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.stream.Collectors;

public class TempDemo {

    public static void main(String[] args) {
        Event event = new Event();

        String s = event.getLocations()
                .stream()
                .map(l -> l.getAddress().replaceAll("\\s+", ""))
                .collect(Collectors.joining("\n"));

        System.out.println(s);

    }
}
