package com.hackerearth;

import java.util.Scanner;

public class LaunchingSattelites {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int R = s.nextInt();
		int C = s.nextInt();
		int N = s.nextInt();
		int arr[][] = new int[R][C];
		for(int i = 0; i < R; i ++){
			for(int j = 0; j < C; j++){
				arr[i][j] = 0;
			}
		}
		for(int i = 0; i < N; i ++){
			String s1 = s.next();
			int x = Integer.parseInt(s1.substring(0, 1));
			int y = Integer.parseInt(s1.substring(2, 3));
			
			arr[x-1][y-1] = 1;
		}
		int maxPos = -1;
		int maxCount = 0;
		for(int i = 0; i < R; i++){
			for(int j = 0; j < C; j++){
				if(arr[i][j] == 1){
					for(int k = i; k < R; k++){
						int m = 0;
						if(k == i){
							m = j + 1;
						}
						for(; m < C; m++){
							if( arr[k][m] == 1){
								int diffX = k - i;
								int diffY = m - j;
								int posX = k + diffX;
								int posY = m + diffY;
								int count = 2;
								while( posX < R && posY < C ){
									if(posY <= 0){
										break;
									}
									if(arr[posX][posY] == 1){
										count = count + 1;
									}
									else break;
									posX = posX + diffX;
									posY = posY + diffY;
								}
								if(maxCount < count){
									maxCount = count;
									maxPos = i;
								}
							}
						}
					}
				}
			}
		}
		
		
		System.out.println(maxCount);
	}
}
