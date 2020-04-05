package com.leetcode;


/**
 *
 * https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3284/
 *
 * Write an algorithm to determine if a number is "happy".
 *
 * A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
 *
 * Example:
 *
 * Input: 19
 * Output: true
 * Explanation:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 */
public class HappyNumber {

    public static void main(String args[]) {
        System.out.println(isHappy(1111111));
    }

    public static boolean isHappy(int n) {
        int encounteredArray[] = new int [9];
        while(true){
            int[] array = getElements(n, size(n));
            int sum = 0;
            for(int i = 0; i < size(n); i ++){
                sum = sum + array[i] * array[i];
            }
            if(sum / 10 == 0){
                if(encounteredArray[sum-1] == sum){
                    return false;
                }
                if(sum == 1){
                    return true;
                }
                encounteredArray[sum-1] = sum;
            }
            n = sum;
        }
    }

    public static int size(int n ){
        int size = 0;
        int i = 0;
        while(n / 10 != 0){
            n = n / 10;
            size = size + 1;
        }
        return size + 1;
    }

    public static int[] getElements(int n, int size){
        int[] elements = new int[size];
        int i = 0;
        while(n /10 != 0 && i < size){
            elements[i] = n % 10;
            n = n / 10;
            i ++;
        }
        elements[i] = n;
        return elements;
    }
}
