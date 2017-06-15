package com.exceptions;

import java.sql.SQLException;

public class SuperClass {
	
	public void method() throws SQLException, ArrayIndexOutOfBoundsException{
		System.out.println("This is method in super Class");
	}
}