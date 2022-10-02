package com.leetcode.easy;

public class Subsequence {

    public static void main(String[] args) {
        Subsequence subsequence = new Subsequence();
        String s = "axc";
        String t = "ahbgdc";

        System.out.println(subsequence.isSubsequence(s, t));
    }

    public boolean isSubsequence(String s, String t) {
        char[] arr_s = s.toCharArray();
        char[] arr_t = t.toCharArray();

        if(arr_s.length == 0){
            return true;
        }
        int index = 0;
        for (int i = 0; i < arr_t.length; i++) {

            if(arr_t[i] == arr_s[index]){
                index++;
            }
            if(index == arr_s.length){
                return true;
            }
        }

        return false;
    }
}
