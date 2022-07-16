package com.practice.recursion;

public class FactorialDemo {

    public static void main(String[] args) {

        System.out.println(factorial(5));
    }

    public static int factorial(int n){
        if(n == 1 || n == 0){
            return n;
        }
        else {
            return n * factorial(n -1);
        }
    }
}
