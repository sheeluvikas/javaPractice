package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Memoization
 * You are climbing a staircase. It takes n steps to reach the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 *
 *
 * Example 1:
 *
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 *
 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 *
 */
public class ClimbingStairs {

    static Map<Integer,  Integer> map = new HashMap<>();

    public static void main(String[] args) {
        System.out.println(climbStairs(3));
    }
    public static int climbStairs(int n) {

        return ways(n + 1);
    }

    public static int ways(int n){
        if(n <= 1){
            return n;
        }
        else {
            return getWays(n -1) + getWays(n -2);
        }
    }

    public static Integer getWays(int x){
        if(x <= 1){
            return x;
        }
        Integer value = map.get(x);
        if(value == null){
            map.put(x, ways(x));
        }
        return map.get(x);
    }
}
