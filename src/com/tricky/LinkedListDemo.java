package com.tricky;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	
	public static void main(String args[]){
		
		int arr[] = {1,1,0,1,1,0};
		int count0 = 0;
		int count1 = 0;
		for(int i = 0; i < arr.length; i ++){
			
			if(arr[i] == 0){
				count0 = count0 + 1;
			}
			else if(arr[i] == 1){
				count1 = count1 + 1;
			}
		}
		
		for(int i = 0 ; i < count0; i ++){
			System.out.print("0 ");
		}
		for(int i = 0 ; i < count1; i ++){
			System.out.print("1 ");
		}
	}
}
