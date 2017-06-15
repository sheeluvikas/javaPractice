package com.threading;

public class PCFixed {

	public static void main(String[] args) {
		
		Q q = new Q();
		
		new Producer(q);
		new Consumer(q);
	}

}
