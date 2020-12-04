package com.koreait.first.obj3;

public class ClassB extends ClassA {
	public ClassB(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void print() {
		super.print();
		System.out.println("B: " + getName() + "/" + getAge());
	}
}



