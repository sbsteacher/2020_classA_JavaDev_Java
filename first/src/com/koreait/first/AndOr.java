package com.koreait.first;

public class AndOr {

	public static void main(String[] args) {
		boolean r1 = false && true && true;		
		System.out.println("r1: " + r1);
		
		boolean r2 = true && true && false;		
		System.out.println("r2: " + r2);
		
		boolean r3 = true || false || false;		
		System.out.println("r3: " + r3);
		
		boolean r4 = false || false || false;	
		System.out.println("r4: " + r4);

	}

}
