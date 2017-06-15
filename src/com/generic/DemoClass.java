package com.generic;

import java.util.HashSet;
import java.util.*;
import java.util.Set;

public class DemoClass {

	public static void main(String[] args) {
		
		Set<Employee> hset = new HashSet<Employee>();
		
		String[] values = {"10", "20", "40", "10" };
		
		for(String v : values){
			
			System.out.println(hset.add(new Employee(Integer.parseInt(v))));
		}
		
		System.out.println(hset.size());
		int i = 0;
		hset.add(new Employee(++i));
		hset.add(new Employee(++i));
		hset.add(new Employee(++i));
		hset.add(new Employee(++i));
		hset.add(new Employee(++i));
		hset.add(new Employee(++i));
		hset.add(new Employee(++i));
		hset.add(new Employee(++i));
		hset.add(new Employee(++i));
		hset.add(new Employee(++i));
		hset.add(new Employee(++i));
		hset.add(new Employee(++i));
		hset.add(new Employee(++i));
		hset.add(new Employee(++i));
		hset.add(new Employee(++i));
		hset.add(new Employee(++i));
		hset.add(new Employee(++i));
		hset.add(new Employee(++i));
		
	}

}
