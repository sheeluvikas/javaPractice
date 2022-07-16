package com.leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;

/**
 * https://leetcode.com/problems/intersection-of-two-arrays/
 *
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * Example 2:
 *
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * Explanation: [4,9] is also accepted.
 *
 *
 * Constraints:
 *
 * 1 <= nums1.length, nums2.length <= 1000
 * 0 <= nums1[i], nums2[i] <= 1000
 */
public class IntersectionTwoArrays {

    public static void main(String[] args) {

        int [] nums1 = {1,2,2,1};
        int [] nums2 = {2,2};

        int [] arr = intersection(nums1, nums2);

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>(nums1.length);
        HashSet<Integer> set2 = new HashSet<>();

        for(int i = 0; i < nums1.length; i ++) {
            set1.add(nums1[i]);
        }

        for(int i = 0; i < nums2.length; i ++) {
            if(set1.contains(nums2[i])){
                set2.add(nums2[i]);
            }
        }

        int[] arr = new int[set2.toArray().length];
        int i = 0;
        for(Integer x : set2){
            arr[i++] = x;
        }

        return arr;
    }
}
