package com.koreait.first.exception;

public class ExceptionTest {

	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 0;
		
		try {
			System.out.println(n1 / n2);
			System.out.println("에러 안났음!");
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("에러 발생!!");
		} finally {
			System.out.println("Finally!!");
		}
		System.out.println("안녕하세요!!");
	}

}
