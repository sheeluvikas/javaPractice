package com.practice;

public class TempDemo {

    public static void main(String[] args) {

       int i = 10;
       method(i);

    }
    static void method(Object o){
        System.out.println("Object called");
    }
    static void method(Number n){
        System.out.println("Number Called");
    }
}
