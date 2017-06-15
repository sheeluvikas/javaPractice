package com.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CallableDemo {

	public static void main(String[] args) {
		
		ExecutorService es = Executors.newFixedThreadPool(3);
		
		Future<Integer> f1 = es.submit(new Sum(5));
		Future<Double> f2 = es.submit(new Hypot(4,6));
		Future<Integer> f3 = es.submit(new Factorial(5));
		
		
		try {
			
			System.out.println(f2.get());
			System.out.println(f1.get(5000, TimeUnit.MILLISECONDS));
			System.out.println(f3.get());
			
			
		} catch (InterruptedException | ExecutionException | TimeoutException e) {
			e.printStackTrace();
		}
		finally{
			es.shutdown();
		}
		System.out.println("Completed");
	}

}
