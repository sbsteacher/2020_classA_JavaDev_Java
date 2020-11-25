package com.koreait.first.var;

public class Var4 {
	public static void main(String[] args) {
		int n1 = 10; //리터럴 Literal (10, 20, 10.1)
		int n2 = 20;
		int n3 = n1 + n2;
		
		System.out.println(n3);
		
		float f1 = 10.1F;
		double f2 = 10.1D;
		
		int n4 = (int)f2;
		System.out.println(n4);
		
		//------------------------------------------
		
		System.out.println("-----------------");

		int num1 = 10;
		int num2 = 3;
		float result = (float)num1 / num2;
		
		System.out.println(result);
	}
}
