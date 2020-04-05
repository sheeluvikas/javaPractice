package com.leetcode;

public class SingleNumber {

    public static void main(String[] args) {
        int number = singleNUmber(new int[]{4, 5, 2, 2, 3, 4, 0, 0, 3, 2, 2});
        System.out.println(number);
    }

    public static int singleNUmber(int[] nums){

        // total sum - the number should divide by 2.
        int ans=0;
        for(int i = 0; i < nums.length; i ++){
            ans = nums[i] ^ ans;
        }
        return ans;
    }
}
