package com.practice.collections;

import java.util.Objects;

public class Student {

    private Integer id;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }


}
