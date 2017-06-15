package com.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class FightTheMonster {
	
static int getMaxMonsters(int n, int hit, int t, int[] h){
        
	Arrays.sort(h);
    int time = 0;
    int killedMonsters = 0;
    for(int i = 0; i < h.length; i ++){
        int extra = 0;
        if(h[i]%hit > 0){
            extra = 1;
        }
        int temp = h[i]/hit;
        if(temp + extra> t){
            return killedMonsters;
        }
        else {
            t = t - temp - extra;
            time = time + temp + extra;
            killedMonsters = killedMonsters + 1;
        }
    }
    return killedMonsters;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int hit = in.nextInt();
        int t = in.nextInt();
        int[] h = new int[n];
        for(int h_i=0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        int result = getMaxMonsters(n, hit, t, h);
        System.out.println(result);
    }

}
