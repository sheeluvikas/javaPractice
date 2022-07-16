package com.leetcode.easy;

public class ReverseString {

    public static void main(String[] args) {

        char [] arr = {'a', 'b', 'c', 'd', 'e'};
        reverseString(arr);

        System.out.println(arr);
    }

    public static void reverseString(char[] s) {

        for(int i = 0; i < s.length/2; i++) {
            char temp = s[s.length - 1 -i];
            s[s.length - 1-i] = s[i];
            s[i] = temp;
        }
    }
}
