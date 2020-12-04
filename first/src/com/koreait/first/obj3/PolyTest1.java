package com.koreait.first.obj3;

public class PolyTest1 {

	public static void main(String[] args) {
		ClassB cb = new ClassB("B", 10);
		ClassA ca = cb;
		ca.print();
		Object obj = ca;
		
		ClassA ca2 = (ClassA)obj;
		ca2.print();
		
		ClassB cb2 = (ClassB)ca2;
		cb2.print();
		cb2.drive();
		
		//String str = (String)ca2;
		

	}

}
