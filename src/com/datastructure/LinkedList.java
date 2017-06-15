package com.datastructure;

public class LinkedList<E> {
	
	private Node start;
	private Node end;
	private int size;
	
	public LinkedList(){
		start = null;
		end = null;
		size = 0;
	}
	
	public void insertAtStart(E data){
		
		Node node = new Node(data, null);
		if(start == null){
			start = node;
			end = start;
		}
		else {
			
			node.setLink(start);
			start = node;
		}
	}
	
	public void insertAtEnd(E data){
		
		Node node = new Node(data, null);
		
		if (start == null){
			start = node;
			end = start;
		}
		else {
			end.setLink(node);
			end = node;
		}
	}
	
	public void insertAtPos(E data, int pos){
		
		Node node = new Node(data, null);
		Node ptr = start;
		
		for (int i = 0; i < size; i ++){
			if(i == pos){
				Node temp = ptr.getLink();
				ptr.setLink(node);
				node.setLink(temp);
				break;
			}
			
			ptr = ptr.getLink();
		}
		size++;
		
	}
	
	public void display()
	{
		Node ptr = start;
		int flag = 0;
		do {
			E data = (E) ptr.getData();
			ptr = ptr.getLink();
			
			System.out.println(data);
			if(ptr == null){
				flag = 1;
				break;
			}
		}while(ptr.getLink() != null);
		if(flag == 0)
			{
				System.out.println(ptr.getData());
			}
	}
}
