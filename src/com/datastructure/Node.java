package com.datastructure;

public class Node<E> {
	
	private E data;
	
	private Node link;

	
	public Node(E data, Node link) {
		super();
		this.data = data;
		this.link = link;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public Node getLink() {
		return link;
	}

	public void setLink(Node link) {
		this.link = link;
	}
	
	
}
