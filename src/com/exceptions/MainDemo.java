package com.exceptions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class MainDemo {

	public static void main(String[] args) {

		ConcurrentHashMap< String, String> map = new ConcurrentHashMap<String, String>();
//		HashMap<String, String> map = new HashMap<String, String>();
		map.put("1", "Vikas");
		
		map.put("3", "Katiyar");
		
		Iterator it = map.keySet().iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
			map.put("2", "Raman");
		}
		
	}

}
