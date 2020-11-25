package com.koreait.first;

public class StringTest {

	public static void main(String[] args) {
		String s1 = new String("안녕");
		String s2 = new String("안녕");
		String s3 = s2;
		
		System.out.println(s2 == s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s1));
		System.out.println("안녕".equals(s1));
		System.out.println("안녕".equals(s2));
		System.out.println("Hello".equals(s2));
	}

}
