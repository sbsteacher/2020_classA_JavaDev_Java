package com.koreait.first.obj3;

public class PolyTest2 {

	public static void main(String[] args) {
		ClassB cb = new ClassB("B", 20);
		ClassA ca = cb;
		Object obj = ca;
		ca.print();
		
		ClassC cc = (ClassC)obj;

	}

}
