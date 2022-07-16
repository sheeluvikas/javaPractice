package com.leetcode.easy.stack;

import java.sql.Array;
import java.util.Stack;

public class OuterParenthesesDemo {

    public static void main(String[] args) {

        OuterParenthesesDemo outerParenthesesDemo = new OuterParenthesesDemo();
        String s = "()";
        System.out.println(outerParenthesesDemo.removeOuterParentheses(s));
    }

    public String removeOuterParentheses(String s) {

        char[] arr = s.toCharArray();

        StringBuilder out = new StringBuilder();

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if('(' == arr[i]){
                count++;
                if(count != 1) {
                    out.append(arr[i]);
                }
            } else {
                    count --;
                    if(count != 0) {
                        out.append(arr[i]);
                    }
            }
        }
        return out.toString();
    }
}
