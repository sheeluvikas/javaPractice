package com.leetcode.easy;

public class Demo {

    public static void main(String[] args) {

    }

    public static int[] getConcatenation(int[] nums) {

        int n = nums.length;

        int [] ans = new int [nums.length * 2];

        for( int i = 0; i < nums.length; i++){
            ans[i] = nums[i];
        }

        for(int i = 0; i < nums.length; i++){
            ans[i + n] = nums[i];
        }

        return ans;
    }
}
