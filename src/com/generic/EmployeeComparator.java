package com.generic;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		if(o1.getId() > o2.getId()){
			return -1;
		}
		else if(o1.getId() < o2.getId()){
			return 1;
		}
		return 0;
	}

}
