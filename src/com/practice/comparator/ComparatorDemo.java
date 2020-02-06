package com.practice.comparator;

import java.util.*;

public class ComparatorDemo {

    public static void main(String[] args) {

        Student student1 = new Student(1, "Vikas");
        Student student2 = new Student(2, "Rahul");
        Student student3 = new Student(3, "Amit");

        List<Student> list = Arrays.asList(student1, student2, student3);

        Collections.sort(list, Collections.reverseOrder());

        list.forEach(System.out::println);
    }
}
