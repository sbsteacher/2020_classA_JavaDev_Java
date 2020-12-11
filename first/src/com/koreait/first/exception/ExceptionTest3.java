package com.koreait.first.exception;

public class ExceptionTest3 {

	public static void main(String[] args) {
		try {
			div(10, 0);
		} catch(ArithmeticException e) {
			System.out.println("수학적인 에러가 발생하였습니다.");
		} catch(ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("안녕");
	}

	public static void div(int n1, int n2) throws ArithmeticException, ClassNotFoundException {
		System.out.println(n1 / n2);
	}
}
