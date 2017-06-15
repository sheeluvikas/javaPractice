package com.interfaces;

public interface InterfaceB {

	
	void methodA();
	void methodB();
	void methodC();
	
	public default void defaultMethod(){
		System.out.println("This is the default method of Interface B");
	}
}
