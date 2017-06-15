package com.threading;

public class Q {

	int n;
	boolean valueSet = false;
	
	synchronized int get(){
		
		while(!valueSet){
			try {
				System.out.println("Called Wait Get method");
				wait();
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		System.out.println("Got: "+n);
		valueSet = false;
		notify();
		return n;
	}
	
	synchronized int put(int n){
		while(valueSet){
			try {
				System.out.println("Called Wait Put method");
				wait();
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
		this.n = n;
		valueSet = true;
		System.out.println("Put: "+n);
		notify();
		return n;
	}
}
