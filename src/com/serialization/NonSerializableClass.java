package com.serialization;

import java.io.Serializable;

public class NonSerializableClass implements Serializable {
	
	private int member1;
	
	private int member2;

	public int getMember1() {
		return member1;
	}

	public void setMember1(int member1) {
		this.member1 = member1;
	}

	public int getMember2() {
		return member2;
	}

	public void setMember2(int member2) {
		this.member2 = member2;
	}
	
	
}
