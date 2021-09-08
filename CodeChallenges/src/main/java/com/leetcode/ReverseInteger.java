/**
 * https://leetcode.com/problems/reverse-integer/
 *
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 *
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 *
 *
 *
 * Example 1:
 *
 * Input: x = 123
 * Output: 321
 * Example 2:
 *
 * Input: x = -123
 * Output: -321
 * Example 3:
 *
 * Input: x = 120
 * Output: 21
 * Example 4:
 *
 * Input: x = 0
 * Output: 0
 *
 *
 * Constraints:
 *
 * -231 <= x <= 231 - 1
 *
 */

package com.leetcode;

public class ReverseInteger {

    public static void main(String[] args) {

        ReverseInteger reverseInteger = new ReverseInteger();
        int x = reverseInteger.reverse(124);

        x = 2147483647;
        System.out.println(x);
    }

    public int reverse(int x) {

        return 0;

    }
}