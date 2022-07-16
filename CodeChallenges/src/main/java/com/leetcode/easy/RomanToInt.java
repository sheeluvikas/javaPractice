package com.leetcode.easy;

public class RomanToInt {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {

        int value = 0;

        char [] arr = s.toCharArray();

        for(int i = 0; i < arr.length; i++){
            int number = getValue(arr[i]);
            if(i > 0 && number > getValue(arr[i - 1])){
                value = value - getValue(arr[i - 1]);
                value = value + getValue(arr[i]) - getValue(arr[i - 1]);
            }
            else {
                value += number;
            }
        }

        return value;
    }

    private static int getValue(char x){
        switch (x){
            case 'M' : return 1000;
            case 'D' : return 500;
            case 'C' : return 100;
            case 'L' : return 50;
            case 'X' : return 10;
            case 'V' : return 5;
        }
        return 1;
    }
}
