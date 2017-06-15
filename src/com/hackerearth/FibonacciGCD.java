package com.hackerearth;

import java.util.*;

public class FibonacciGCD {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int Q = s.nextInt();
        int array[] = new int[N];
        int query[][] = new int[Q][2];
        for(int i = 0; i < N; i++){
        	array[i] = s.nextInt();
        }
        for(int i = 0; i < Q; i++){
        	query[i][0] = s.nextInt();
        	query[i][1] = s.nextInt();
        }
        
		for(int i = 0; i < Q; i++){
			int L = query[i][0];
			int R = query[i][1];
			double temp[] = new double[R-L+1];
			for(int m = 0, k = L-1; k <= R-1; k++, m++){
				double t = F(array[k]);
				temp[m] = t;
			}
			if(temp.length == 1){
				System.out.println();
			}
			System.out.println(GCD_All(temp));
		}
        
		
	}
	
	public static double F(int n){
		
		if ( n == 1 || n == 2){
			return 1;
		}
		double third = 0;
		double first = 1;
		double second = 1;
		third = first + second;
		for(int i = 3; i < n; i++){
			first = second;
			second = third;
			third = second + first;
		}
		
		return third;
	}
	
	public static double GCD(double n, double m){
		if(n == 0){
			return m;
		}
		if(n == m){
			return n;
		}
		double num1 = n;
		double num2 = m;
		if(n > m){
			num1 = m;
			num2 = n;
		}
		if(num1 == 1 || n == m){
			return 1;
		}
		return GCD(num2 % num1, num1);
		
	}
	
	public static int GCD_All(double arr[]){
		
		double gcd = 0;
		if(arr.length == 1){
			gcd = GCD(arr[0], arr[0]);
		}
		else {
			gcd = GCD(arr[0], arr[1]);
		}
		
		for(int i = 2; i < arr.length; i++){
			gcd = GCD(gcd, arr[i]);
		}
		
		return (int)gcd;
	}

}
