/**
 * Given an integer x, return true if x is palindrome integer.
 *
 * An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.
 *
 * Example 1:
 *
 * Input: x = 121
 * Output: true
 * Example 2:
 *
 * Input: x = -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 *
 * Input: x = 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * Example 4:
 *
 * Input: x = -101
 * Output: false
 *
 */
package com.leetcode;

public class Palindrome {

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(10));
    }

    public boolean isPalindrome(int x) {

        // take the number in an array

        if ( x < 0){
            return false;
        }
        int  size = 0;

        int y = x;

        /// not working if the value is 10, fix that

        while(y % 10 != 0){

            y = y % 10;
            size++;
        }
        int[] array = new int[size];
        y = x;
        int index = 0;
        while( y % 10 != 0){
            array[index] = y % 10;
            y = y / 10;
            index++;
        }

        for(int i = 0, j = array.length -1; i < array.length/2; i++, j--){
            if (array[i] != array[j]){
                return false;
            }
        }

     return true;
    }


}
