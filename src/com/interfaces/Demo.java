package com.interfaces;

public class Demo {

	public static void main(String[] args) {
		
		InterfaceA classA = new ClassA();
		
		classA.defaultMethod();
		System.out.println("**************");
		InterfaceB c = new ClassC();
		
		c.defaultMethod();
		
	}

}
