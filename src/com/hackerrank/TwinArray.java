package com.hackerrank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TwinArray {
	
	 static int twinArrays(int[] ar1, int[] ar2){

		 int minIndex1 = 0;
			int secMinIndex1 = 1;
			if(ar1[minIndex1] > ar1[secMinIndex1]){
				minIndex1 = 1;
				secMinIndex1 = 0;
			}
			for ( int i = 2; i < ar1.length; i ++){
				
				if(ar1[minIndex1] >= ar1[i]) {
					secMinIndex1 = minIndex1;
					minIndex1 = i;
				}
				else if(ar1[minIndex1] < ar1[i] &&  ar1[i] < ar1[secMinIndex1]){
					secMinIndex1 = i;
				}
			}
			
			int minIndex2 = 0;
			int secMinIndex2 = 1;
			if(ar2[minIndex2] > ar2[secMinIndex2]){
				minIndex2 = 1;
				secMinIndex2 = 0;
			}
			for ( int i = 2; i < ar2.length; i ++){
				
				if(ar2[minIndex2] > ar2[i]) {
					secMinIndex2 = minIndex2;
					minIndex2 = i;
				}
				else if(ar2[minIndex2] < ar2[i] &&  ar2[i] < ar2[secMinIndex2]){
					secMinIndex2 = i;
				}
			}
			
			int sum = ar1[minIndex1] + ar2[minIndex2];
			if(minIndex1 == minIndex2){
				sum = ar1[minIndex1] + ar2[secMinIndex2];
				int sum2 = ar1[secMinIndex1] + ar2[minIndex2];
				int sum3 = ar1[secMinIndex1] + ar2[secMinIndex2];
				if(secMinIndex1 == secMinIndex2){
					if(sum < sum2){
						return sum;
					}
					else return sum2;
				}
				else {
					if(sum <= sum2){
						if(sum < sum3){
							return sum;
						}
						else return sum3;
					}
					else {
						if(sum3 < sum2){
							return sum3;
						}
						return sum2;
					}
				}
				
			}
			else return sum;
	    }

	    public static void main(String[] args) throws FileNotFoundException {
	    	
	    	File file = new File("C:/Users/Vikas/workspace/JavaPractice/TestCases.txt");
	    	Scanner in = new Scanner(file);
	    	
//	        Scanner in = new Scanner(System.in);
	        
	        int n = in.nextInt();
	        int[] ar1 = new int[n];
	        for(int ar1_i = 0; ar1_i < n; ar1_i++){
	            ar1[ar1_i] = in.nextInt();
	        }
	        int[] ar2 = new int[n];
	        for(int ar2_i = 0; ar2_i < n; ar2_i++){
	            ar2[ar2_i] = in.nextInt();
	        }
	        int result = twinArrays(ar1, ar2);
	        System.out.println(result);
	    }
	}
