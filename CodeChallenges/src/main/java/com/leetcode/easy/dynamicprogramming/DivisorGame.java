package com.leetcode.easy.dynamicprogramming;

public class DivisorGame {

    public static void main(String[] args) {
        DivisorGame game = new DivisorGame();
        System.out.println(game.divisorGame(2));
    }

    public boolean divisorGame(int n) {
        if(n == 1){
            return false;
        }
        for (int i = 1; i < n; i++) {
            if(n % i == 0){
                return true;
            }
            if(n % i == 0){
                return divisorGame(n - i);
            }
        }

        return false;
    }
}
