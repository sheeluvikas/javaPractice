package com.practice.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * This class is to explain the concept of Functional Programming and Lambda Expression
 * with custom Functional Interface and the other one using Predicate.
 *
 */
public class LambdaDemo {

    public static void main(String args[]){
        Greeter greeter1 = (s) -> System.out.println(s);
        greeter1.perform("Katiyar");

        List<String> list = new ArrayList<>();
        list.add("Vikas");
        list.add("Sheelu");
        list.add("Rahul");
        list.add("Zahir");
        Predicate<String> predicate = s -> s.charAt(0) != 'Z';
        list = list.stream().filter(predicate).collect(Collectors.toList());
        System.out.println(list);
    }
}
