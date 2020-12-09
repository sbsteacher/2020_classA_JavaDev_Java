package com.koreait.first.abst;

public class AbstractTest {

	public static void main(String[] args) {
		AbstA aa = new AbstB();
		aa.bark();
		
		AbstB ab = (AbstB)aa;
		ab.shakeTail();
		
		((AbstB)aa).shakeTail();
	}

}
