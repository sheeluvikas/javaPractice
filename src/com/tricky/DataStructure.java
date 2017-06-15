package com.tricky;

import java.util.Arrays;

public class DataStructure {
	public static void main(String args[]){
		int []arr = {123, 156, 177, 164, 143, 150, 194, 150, 144};
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+" ");
		}
//		sorting(arr);
	}
	
	public static void sorting(int []sum){
		for(int j = 0; j < sum.length; j ++){
			long large = sum[j];
			for(int k = j; k < sum.length; k++){
				if(sum[k] > large){
					int temp = sum[k];
					sum[k] = sum[j];
					sum[j] = temp;
					large = temp;
				}
			}
		}
		for(int i = 0; i < sum.length; i++){
			System.out.print(sum[i]+" ");
		}
	}
}