package com.generic;

public class Employee implements Comparable {
	
	static int i = 0;
	private int id = 0;
	
	public Employee(int id){
		this.setId(id);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public boolean equals(Object o){
		Employee e = (Employee) o;
		
		if(e.getId() == this.getId()){
			return true;
		}
		return false;
	}

	@Override
	public int compareTo(Object o) {
		if(((Employee)o).getId() < this.getId()){
			return 1;
			
		}
		else if(((Employee)o).getId() > this.getId()){
			return -2;
		}
		return 0;
	}
	
	/*@Override
	public int hashCode(){
//		System.out.println("Inside hashCode method of Employee Class");
		System.out.println(this.getId() +" : "+super.hashCode());
		return super.hashCode();
//		return this.getId();
	}*/
}
