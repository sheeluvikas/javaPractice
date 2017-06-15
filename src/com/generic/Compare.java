package com.generic;

import java.util.*;

public class Compare {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<Employee>();
		int i = 0;
		list.add(new Employee(5));
		list.add(new Employee(3));
		list.add(new Employee(7));
		list.add(new Employee(0));
		list.add(new Employee(9));
		list.add(new Employee(11));
		
//		Collections.sort(list);
		list.sort(new EmployeeComparator());
		for(Employee e : list){
			System.out.println(e.getId());
		}
		System.out.println();

	}

}
