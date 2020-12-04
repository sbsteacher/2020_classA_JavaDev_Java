package com.koreait.first.obj2;

public class Animal {
	String name;
	int age;
	
	public Animal() {		
		this("바둑이");
	}
	
	public Animal(String name) {
		this(name, 2);
	}	
	
	public Animal(int age) {
		this("바둑이", age);
	}
	
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;		
	}



	public void crying() {
		System.out.printf("%d살의 %s가 운다\n"
				, age, name);
	}
}
