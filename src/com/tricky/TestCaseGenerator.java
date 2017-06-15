package com.tricky;

import java.util.Random;

public class TestCaseGenerator {

	public static void main(String[] args){ 
		
		int n = getRandomNumber(2, 7);
		System.out.print(n);
		System.out.println();
		for(int m = 0; m < 2; m++){
			for(int i = 0; i < n; i++){
				System.out.print(getRandomNumber(1, 10));
				
				if(i == n-1){
					break;
				}
				System.out.print(" ");
			}
			if(m == 0){
				System.out.println();
			}
		}
		
	}
	
	public static int getRandomNumber(int minRange, int maxRange){
		Random random = new Random();
		while(true){
			int num = random.nextInt(maxRange);
			if(num >= minRange){
				return num;
			}
		}
	}
}
