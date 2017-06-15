package com.techgig;

public class BallCount {

	public static void main(String[] args) {
		
		int A[] = {2,3,4,5,7,23};
		System.out.println(ballCounting(A, 14, 3));
//		for(int i = 0; i < A.length; i++){
//			System.out.println(SortedArray.doSelectionSort(A)[i]);
//		}
	}
	
	public static int ballCounting(int A[], int F, int K){
		
		int Arr[] = SortedArray.doSelectionSort(A);
		int N = Arr.length;
		int sum = 0;
		int actualSum = 0;
		
		for(int m = 0; m < K; m++){
				sum = sum + Arr[m];
		}
		for(int j = K-1; j >=0; j--){
			
			
			for(int i = N-1; i >= N-K; i--){
				int temp = sum - Arr[j] + Arr[i];
				if(temp % F ==0 && temp >= F){
					sum = temp;
					if(sum == 14){
						System.out.println();
					}
					if(actualSum == 0){
						actualSum = sum;
					}
					else if(sum < actualSum){
						actualSum = sum;
					}
				}
			}
		}
		if(actualSum > 0)
			return actualSum;
		else return -1;
	}

}
