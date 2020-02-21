package com.practice.comparator;

public class Student implements Comparable {

    private String name;
    private Integer id;

    public Student(Integer id, String name) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public int compareTo(Object o) {
        Student s1 = (Student)o;
        if(s1.id > this.id){
            return -1;
        }
        else if(s1.id == this.id){
            return 0;
        }
        return 1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
