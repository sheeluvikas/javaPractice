package com.generic;

public class A extends B{

	@Override
	public SubClass method(){
		
		
		System.out.println("A method");
		
		SubClass s = new SubClass();
		return s;
	}
	
	public String method2(){
		System.out.println("Method 2 of A");
		return null;
	}
}
