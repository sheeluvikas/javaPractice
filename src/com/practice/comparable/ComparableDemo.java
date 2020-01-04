package com.practice.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

    public static void main(String[] args) {
        Student student1 = new Student(1, "Vikas");
        Student student2 = new Student(2, "Rahul");
        Student student3 = new Student(3, "Amit");


        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);

        Collections.sort(list);

        list.forEach(System.out::println);

    }
}
