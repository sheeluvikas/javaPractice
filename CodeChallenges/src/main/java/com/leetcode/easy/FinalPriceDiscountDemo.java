package com.leetcode.easy;

import com.Utils;

import java.util.Stack;

/**
 * https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
 */
public class FinalPriceDiscountDemo {

    public static void main(String[] args) {
        FinalPriceDiscountDemo demo = new FinalPriceDiscountDemo();
        int [] prices = {8, 4, 6, 2, 3};
        Utils.printArray(demo.finalPrices(prices));
    }

    public int[] finalPrices(int[] prices) {
        int[] discountArr = new int[prices.length];

        Stack<Integer> stack = new Stack<>();



        for (int i = 0, j = 0; i < prices.length; i++) {
            stack.push(prices[i]);
            if(prices[i] <= stack.peek()){
                prices[j] = stack.pop() - stack.peek();
                j++;
            }
        }
        return discountArr;
    }
}
