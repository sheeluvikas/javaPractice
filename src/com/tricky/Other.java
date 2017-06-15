package com.tricky;

public class Other extends A {
	
	public static void main(String args[]){
		int [] arr = {9,7,63,1000000000};
//		System.out.println(getNumbers(arr));
//		System.out.println(GCD(8, 24));
		System.out.println(fabonacci(100));
	}
	
	public static long fabonacci(int n){
		
		if ( n == 1 || n == 2){
			return 1;
		}
		long third = 0;
		long first = 1;
		long second = 1;
		third = first + second;
		for(int i = 3; i < n; i++){
			first = second;
			second = third;
			third = second + first;
		}
		
		return third;
	}
	
	
	public static int GCD(int n, int m){
		if(n == 0){
			return m;
		}
		int num1 = n;
		int num2 = m;
		if(n > m){
			num1 = m;
			num2 = n;
		}
		if(num1 == 1 || n == m){
			return 1;
		}
		return GCD(num2 % num1, num1);
		
	}
	
	
	public static int getNumbers(int arr[]){
		
		int gcd = GCD(arr[0], arr[1]);
		
		for(int i = 2; i < arr.length; i++){
			gcd = GCD(gcd, arr[i]);
		}
		
		return gcd;
	}
}
