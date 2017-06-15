package com.callable;

import java.util.concurrent.Callable;

public class Factorial implements Callable<Integer>{
	
	int k ;
	
	Factorial(int k){
		this.k = k;
	}
	@Override
	public Integer call() throws Exception {
		
		int factorial = 1;
		for(int i = 1; i <= k; i ++){
			factorial = factorial * i;
		}
		Thread.sleep(10000);
		return factorial;
	}
	
	
	
}
