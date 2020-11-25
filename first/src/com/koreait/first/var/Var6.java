package com.koreait.first.var;

public class Var6 {

	public static void main(String[] args) {
		//byte > short > int > long > float > double > (String)무적!
		
		byte d1 = 100;
		short d2 = d1;
		int d3 = d2;
		long d4 = d3;
		
		float f1 = d4;
		double f2 = f1;
		
		String s1 = f2 + "입니다";
		System.out.println(s1);
		
		System.out.println("------------------");
		
		int n1 = 10;
		int n2 = 22;
		
		String result = "10 * 22 = " + n1 * n2;
		
		System.out.println(result);
		

	}

}
