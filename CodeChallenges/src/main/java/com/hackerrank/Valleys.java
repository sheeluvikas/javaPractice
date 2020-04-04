package com.hackerrank;

/**
 * https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 *
 */
public class Valleys {

    public static void main(String[] args) {
        int n = 14;
        String s = "DUUDDUUDDUUDDU";

        int level = 0;
        int valleyCount = 0;
        int previousLevel = 0;
        for(int i = 0; i < n; i++){
            char step = s.charAt(i);
            if(step == 'D'){
                level = level - 1;
            }
            else if(step == 'U'){
                level = level + 1;
            }
            if(level < 0 && previousLevel > -1){
                valleyCount ++;
            }
            previousLevel = level;
        }

        System.out.println(valleyCount);
    }
}
