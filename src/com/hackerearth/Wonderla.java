package com.hackerearth;

import java.util.Scanner;

public class Wonderla {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int M = s.nextInt();
        int currentTime = 0;
        long value[] = new long[M];
        int time[] = new int[M];
        int level[] = new int[M];
        int expiryTime[] = new int[N];
        for (int i = 0; i < N; i++) {
            expiryTime[i] = s.nextInt();
        }
        for (int i = 0; i < M; i++) {
        	value[i] = s.nextInt();
        	time[i] = s.nextInt();
        	level[i] = s.nextInt();
        }
        double ratio = value[0]/time[0];
        
        for(int i = 0; i < M ; i ++){
        	for(int j = 0; j < M ; ){
	        	if(ratio > value[j]/time[j]){
	        		ratio = value[j]/time[j];
	        	}
        	}
        	
        }
        
	}

}
