package com.koreait.first.obj2;

public class Animal2 {
	private String name;
	private int age;
	
	public void setName(String name) {		
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void crying() {
		System.out.printf("%d살의 %s가 운다\n"
				, age, name);
	}
}
