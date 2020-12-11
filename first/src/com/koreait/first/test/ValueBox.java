package com.koreait.first.test;

public class ValueBox extends Object {
	private int value;

	public ValueBox() {}
	
	public ValueBox(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	@Override
	public boolean equals(Object obj) {
		ValueBox vb = (ValueBox)obj;
		return this.value == vb.value;
	}
}





