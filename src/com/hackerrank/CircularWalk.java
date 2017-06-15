package com.hackerrank;

import java.util.Scanner;

public class CircularWalk {
	
	static int circularWalk(int n, int s, int t, int r_0, int g, int seed, int p){
		
		
		return 0;
	}
	
	static int R(int i, int R0, int g, int seed, int p){
		if(i == 0){
			return R0;
		}
		return (R(i-1, R0, g, seed, p)*g+seed)%p;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = in.nextInt();
        int t = in.nextInt();
        int r_0 = in.nextInt();
        int g = in.nextInt();
        int seed = in.nextInt();
        int p = in.nextInt();
        int result = circularWalk(n, s, t, r_0, g, seed, p);
        System.out.println(result);
    }
}
