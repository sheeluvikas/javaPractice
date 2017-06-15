package com.threading;

public class MyThreadDemo {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new MyThreadClass());
		
		thread.start();
		
	}

}
