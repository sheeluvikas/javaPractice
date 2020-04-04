package com.leetcode;

/**
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3286/
 *
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 *
 * Example:
 *
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Note:
 *
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 */
public class MoveZeros {
    public static void main(String[] args) {
        int arr[] = new int[]{4, 0, 9, 2, 4};

        int pos1 = 0;
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] != 0){
                arr[pos1] = arr[i];
                if(pos1 != i) {
                    arr[i] = 0;
                }
                pos1 = pos1 + 1;
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
