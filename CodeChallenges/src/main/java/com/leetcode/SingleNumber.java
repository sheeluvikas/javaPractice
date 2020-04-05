package com.leetcode;

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 *
 * Input: [2,2,1]
 * Output: 1
 * Example 2:
 *
 * Input: [4,1,2,1,2]
 * Output: 4
 */
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
