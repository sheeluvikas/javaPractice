package com.leetcode;


/**
 * Given an array nums of n integers where n > 1,
 * return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].
 */
public class ArrayProduct {

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5};
        long[] finalArray = new long[5];
/** THe solution is not correct, as this doesn't take into consideration if the one or two elements are zero*/
        long product = 1;

        for(int i = 0; i < array.length;i ++){
            // get the total product
            product *= array[i];
        }
        for(int i = 0; i < array.length; i ++){
            finalArray[i] = product/array[i];
        }

        for(int i = 0; i < finalArray.length; i++) {
            System.out.println(finalArray[i]);
        }
    }
}
