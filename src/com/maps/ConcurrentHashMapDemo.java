package com.maps;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		
		ConcurrentHashMap<String, String> conMap = 
				new ConcurrentHashMap<String, String>();
		conMap.put("Vikas", "Katiyar");
		conMap.put("Rahul", "Sharma");
	}

}
