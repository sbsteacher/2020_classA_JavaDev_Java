package com.koreait.first.array;

public class Array {

	public static void main(String[] args) {
		int[] intArr = new int[900]; //정수형 배열
				
		System.out.println("intArr.length : " + intArr.length);
		intArr[0] = 100;
		
		int n1 = 100;
		
		System.out.println(n1);
		System.out.println(intArr[0]);
		System.out.println(intArr[1]);
		
		
		
		float[] floatArr = new float[10]; //실수형 배열
		floatArr[0] = 10.1f;
		System.out.println(floatArr[0]);
		System.out.println(floatArr[1]);
		
		String[] strArr = new String[10];
		System.out.println(strArr[0]);
		
		String str = "안녕";
		
	}

}






