package com.koreait.first.obj3;

public class OverrideTest2 {

	public static void main(String[] args) {
		ClassA ca = new ClassB("B", 20);
		//ClassB cb = (ClassB)new ClassA("A", 10);
		ca.print();
		//ca.drive();
		ClassB cb = (ClassB)ca;
		cb.print();
		cb.drive();
		
		ClassA ca2 = cb;
		

	}

}
