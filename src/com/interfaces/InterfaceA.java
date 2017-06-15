package com.interfaces;

public interface InterfaceA {

	public static final int a = 0;
	
	public void methodA();
	public void methodB();
	public default void defaultMethod(){
		System.out.println("This is the default method of Interface A");
	}
}
