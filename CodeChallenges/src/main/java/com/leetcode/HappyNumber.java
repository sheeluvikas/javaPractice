package com.leetcode;

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
