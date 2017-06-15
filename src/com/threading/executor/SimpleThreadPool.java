package com.threading.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleThreadPool {

	public static void main(String[] args) {
		
		ExecutorService executor = Executors.newFixedThreadPool(2);
		//The parameter in the above call means, that at one time, only 2 
			// threads will be active and others will be in sleep.
		
		for(int i = 0; i < 10; i++){
			Runnable worker = new WorkerThread(" "+i);
			executor.execute(worker);
		}
//		executor.shutdown();
		while(!executor.isTerminated()){
			
		}
		System.out.println("Finished All the Threads");
	}

}
