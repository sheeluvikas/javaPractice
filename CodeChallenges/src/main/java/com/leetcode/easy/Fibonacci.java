package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    static Map<Integer,  Integer> map = new HashMap<>();
    public static void main(String[] args) {

        System.out.println(fib(30));
    }

    public static int fib(int n) {

        if(n == 0 || n == 1){
            return n;
        }
        else return getFib(n-1) + getFib(n-2);
    }

    public static Integer getFib(int x){
        Integer value = map.get(x);
        if(value == null){
            map.put(x, fib(x));
        }
        return map.get(x);
    }
}
