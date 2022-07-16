package com.leetcode.easy;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GoodPairs {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1, 1, 3};
        GoodPairs goodPairs = new GoodPairs();
        System.out.println(goodPairs.numIdenticalPairs(nums));
    }

    public int numIdenticalPairs(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    count ++;
                }
            }
        }
        return count;
    }
}
