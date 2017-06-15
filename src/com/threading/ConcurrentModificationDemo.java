package com.threading;

import java.util.ArrayList;
import java.util.List;

public class ConcurrentModificationDemo {

	public static void main(String[] args) {
		
		
		
		ConcurrentModifications c = new ConcurrentModifications();
		List<String> list = new ArrayList<String>();
		list.add("Rahul");
//		c.setList(list);
		Thread t = new Thread(c);
		t.start();
		Thread t1 = new Thread(c);
		t1.start();
	}

}
