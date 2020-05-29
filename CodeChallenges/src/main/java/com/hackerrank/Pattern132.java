package com.hackerrank;

public class Pattern132 {

    public static void main(String[] args) {

        Pattern132 pattern132 = new Pattern132();
        int[] nums = {1,0,1,-4,-3};
        System.out.println(pattern132.find132pattern(nums));
    }

    public boolean find132pattern(int[] nums) {

        for (int index = 0; index < nums.length - 2; index++) {
            for (int p = index + 1; p < nums.length - 1; p++) {
                for (int l = p + 1; l < nums.length; l++) {
                    if (nums[index] < nums[p] && nums[p] > nums[l] && nums[l] > nums[index] && index < p && p < l) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
