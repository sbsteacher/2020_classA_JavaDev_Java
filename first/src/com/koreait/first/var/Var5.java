package com.koreait.first.var;

public class Var5 {

	public static void main(String[] args) {
		//오버플로우, 언더플로우
		
		byte d1 = (byte)129;
		System.out.println(d1);
		
		byte d2 = (byte)-129;
		System.out.println(d2);
		
		long d3 = 1010101010010111233L;
		int d4 = (int)d3;
		System.out.println(Integer.MAX_VALUE);
		System.out.println(d4);
	}

}
