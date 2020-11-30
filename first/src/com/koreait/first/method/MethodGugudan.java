package com.koreait.first.method;

public class MethodGugudan {

	public static void main(String[] args) {
		gugudan(2, 8);
	}

	public static void gugudan(int sNum, int eNum) {
		for(int i=sNum; i<=eNum; i++) {
			gugudan(i);
			System.out.println("------------");
		}
	}
	
	
	public static void gugudan(int n) {
		for(int i=1; i<10; i++) {
			System.out.printf("%d x %d = %d\n", n, i, n*i);
		}
	}
}
