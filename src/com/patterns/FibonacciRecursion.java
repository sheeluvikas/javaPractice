package com.patterns;

public class FibonacciRecursion {

	static int n = 0;
	static int first = 0;
	static int second = 1;
	static int third = 0;
	public static void main(String[] args) {
		System.out.print(0 + " "+ 1 + " ");
		fibonacci(8);
	}
	
	public static void fibonacci( int size){
		
		if(size - 2 > 0){
			third = first + second;
			second = third;
			first = second;
			System.out.print(third + " ");
			fibonacci(size - 1);
		}
	}

}
