package com.threading;

import java.util.ArrayList;
import java.util.List;

public class ConcurrentModifications extends Thread{
	
	List<String> list;
	public ConcurrentModifications(){
		list = new ArrayList<String>();
		list.add("Rahul");
		
	}
	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public void run(){
		updateArray(list);
	}
	
	public synchronized void updateArray(List<String> list){
		
		System.out.println("Entering updateArray");
		System.out.println(list.size());
		for(int i = 0 ; i < list.size(); i++){
			list.add("Vikas"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(list.size());
		}
	}
}
