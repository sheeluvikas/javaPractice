package com.callable;

import java.util.concurrent.Callable;

public class Sum implements Callable<Integer> {
	
	int stop ;
	public Sum(int a){
		stop = a;
	}
	
	@Override
	public Integer call() throws Exception {
		
		int sum = 0;
		for(int i = 0; i < stop; i ++){
			sum += i;
		}
		Thread.sleep(10000);
		return sum;
	}
	
	
}
