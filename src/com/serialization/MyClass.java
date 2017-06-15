package com.serialization;

import java.io.Serializable;

public class MyClass  extends ClassSuper  implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String s ;
	int i;
	Double d;
	private transient int abc;
	private static int p;
	private NonSerializableClass n = new NonSerializableClass();
	public MyClass(String s, int i, Double d) {
		super();
		this.s = s;
		this.i = i;
		this.d = d;
	}
	@Override
	public String toString() {
		return "MyClass [s=" + s + ", i=" + i + ", d=" + d + "]";
	}
	
	
	
}
