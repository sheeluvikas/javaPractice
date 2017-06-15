package com.tricky;

import com.callable.Sum;

public class NullDemo {

	public static void main(String[] args) {
		
//		method1(null);
		
		long longWithL = 1000*60*60*24*365L;
		long longWithoutL = 1000*60*60*24*365;
		System.out.println(longWithL);
		System.out.println(longWithoutL);
	}
	
	public static void method1(String s){
		
		System.out.println("Method1 String");
	}
	
	public static void method1(Object o){
		System.out.println("Method1 Object");
	}
	
}
