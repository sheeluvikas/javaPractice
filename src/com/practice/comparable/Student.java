package com.practice.comparable;

public class Student  implements Comparable{

    private Integer rollNumber;
    private String name;

    public Integer getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Student(Integer rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;

        if(this.rollNumber < student.rollNumber){
            return 1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                '}';
    }
}
