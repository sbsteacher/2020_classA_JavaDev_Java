package com.koreait.first.obj;

public class Car {
	String name;
	int cc;
	String color;
	
	public void drive() {
		System.out.printf("%s 색상의 %dcc의 %s차량이 달린다.\n"
				, color, cc, name);
	}
}
