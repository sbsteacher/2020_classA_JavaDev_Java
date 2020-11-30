package com.koreait.first.method;

public class Method2 {

	public static void main(String[] args) {
		int r = sum(sum(1,2) , 9);
		
		System.out.println("r : " + r);
		System.out.println("값 : " + sum(10, 9));

	}
	
	public static int sum(int n1, int n2) {
		int sum = n1 + n2;
		return sum;
	}

}
