package com.leetcode.easy;

public class Sum1DArray {

    public static void main(String[] args) {
        int[] nums = {2, 4, 5, 6, 7, 8, 1, 3};

        Sum1DArray sum =new Sum1DArray();
        int[] arr = sum.runningSum(nums);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public int[] runningSum(int[] nums) {

        int[] sumArr = new int[nums.length];

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            sumArr[i] = sum;
        }
        return sumArr;
    }
}
