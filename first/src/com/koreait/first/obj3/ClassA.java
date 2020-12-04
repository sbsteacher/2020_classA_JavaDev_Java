package com.koreait.first.obj3;

public class ClassA {
	private String name;
	private int age;
		
	public ClassA(String a, int b) {
		this.name = a;
		this.age = b;
	}
	
	public void print() {
		System.out.println("A: " + name + "," + age);
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
}
