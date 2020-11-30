package com.koreait.first.method;

public class Method1 {

	public static void main(String[] args) {
		sum("값", 1, 2);
		sum(10, 20, "값");
		System.out.println("값 : ");
	}
	//오버로딩!!!
	public static void sum(String str, int n1, int n2) {
		System.out.printf("%s : %d + %d = %d\n", str, n1, n2, n1+n2);
	}
			
	public static void sum(int n1, int n2, String str) {
		sum(str, n1, n2);
	}

	
}
