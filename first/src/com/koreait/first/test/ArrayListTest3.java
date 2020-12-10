package com.koreait.first.test;

import java.util.List;

public class ArrayListTest3 {

	public static void main(String[] args) {
		MyArrayList list = new MyArrayList();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(1, 500);
		
		
		System.out.println(list);
		System.out.println("--del : " + list.remove(1)); // --del : 500
		System.out.println(list.toString());
		
		PrintSt ps = new PrintSt();
		ps.println(list);
		
	}

}

class PrintSt {
	void println(int a) {
		println(String.valueOf(a));
	}
	void println(Object o) {
		String str = o.toString();
		println(str);
	}
	
	void println(String str) {
		System.out.println("string");
	}
}
