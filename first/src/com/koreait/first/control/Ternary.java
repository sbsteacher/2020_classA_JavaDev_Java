package com.koreait.first.control;

public class Ternary {

	public static void main(String[] args) {
		
		//( A ? B : C )
		
		//A: 식
		//B : true인 경우 사용
		//C : false인 경우 사용
		
		int num = 110;
		
		String result = num > 100 ? "100보다 큼" : "100보다 작음";
		
		System.out.println(result);

	}

}
