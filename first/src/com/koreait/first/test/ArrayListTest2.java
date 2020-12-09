package com.koreait.first.test;

import java.util.LinkedList;
import java.util.List;

public class ArrayListTest2 {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(1);
		
		
		int a = list.get(0);
		
		System.out.println("a : " + a);

	}

}
