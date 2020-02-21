package com.practice.annotations;

@MyAnnotaion(name = "CustomAnnotation")
public class MyAnnotationDemo {

    @MyAnnotaion(name = "AnotherCustomAnnoation")
    public static void main(String args[]){
        System.out.println("This is the main class !!!");
    }
}
