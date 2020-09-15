package com.practice.comparator;

import java.util.*;
import java.util.function.Function;

public class ComparatorDemo {

    public static void main(String[] args) {

        Student student1 = new Student(1, "Vikas");
        Student student2 = new Student(2, "Rahul");
        Student student3 = new Student(3, "Amit");
        Student student4 = new Student(4, "Amit");
        Student student5 = new Student(4, "Amit");

        List<Student> list = Arrays.asList(student1, student2, student3, student4, student5);

        Collections.sort(list, Collections.reverseOrder());

        list.forEach(System.out::println);

        System.out.println("******************** sort by Name and then by ID");
        Collections.sort(list, Comparator.comparing(Student::getName).thenComparing(s -> s.getId()));
        list.forEach(System.out::println);

        System.out.println("************ Natural order");
        list.sort(new StudentComparator());
        list.sort((x1, x2) -> x1.compareTo(x2));

        list.forEach(System.out::println);

    }

    private static class StudentComparator implements Comparator<Student>{
        @Override
        public int compare(Student o1, Student o2) {
            return o1.compareTo(o2);
        }
    }
}
