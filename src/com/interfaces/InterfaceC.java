package com.interfaces;

public interface InterfaceC extends InterfaceB {

	
	int c = 0;
	
	default public void defaultMethod(){
//		InterfaceB.super.defaultMethod();
		System.out.println("This is the default method in Interface C");
	}
}
