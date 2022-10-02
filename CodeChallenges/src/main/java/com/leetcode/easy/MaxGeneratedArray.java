package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class MaxGeneratedArray {

    Map<Integer, Integer> map = new HashMap<>();
    public static void main(String[] args) {

        MaxGeneratedArray array = new MaxGeneratedArray();

        System.out.println(array.getMaximumGenerated(7));
    }

    public int getMaximumGenerated(int n) {
        int max = 0;
        for (int i = 0; i < n + 1; i++) {
            int value = getRecursion(i);
            map.put(i, value);
            if(value > max){
                max = value;
            }
        }

        return max;
    }

    public int getRecursion(int n){
        if(map.containsKey(n)){
            return map.get(n);
        }
        if(n == 0){
            return 0;
        }
        else if(n == 1){
            return 1;
        }
        else if(n % 2 == 0){
            return getRecursion(n/2);
        }
        return getRecursion((n - 1)/2) + getRecursion((n - 1)/2 + 1);
    }
}
