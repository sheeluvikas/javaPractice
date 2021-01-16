package com.practice.maps;

import java.util.Objects;

public class Student {

    private Integer id;
    private String name;



    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
