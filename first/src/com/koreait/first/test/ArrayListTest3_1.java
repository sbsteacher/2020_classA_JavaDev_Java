package com.koreait.first.test;

import java.util.ArrayList;

public class ArrayListTest3_1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList();
		list.add(110);
		list.add(220);
		list.add(1, 330);
		
		String str = "ddd";
		System.out.println(str);
		System.out.println(list.toString());
		
		System.out.println(list.remove(1));
		
		System.out.println(list.toString());
		

	}

}
