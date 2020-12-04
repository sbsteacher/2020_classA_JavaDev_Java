package com.koreait.first.obj;

import java.util.Arrays;

public class ObjTest4 {

	public static void main(String[] args) {
		int[] arr = { 4, 7, 1, 9, 3, 8 };
		int[] arr3 = arr; //'얕은 복사'라고 칭한다.
				
		//배열 복사하는 메소드 (깊은 복사)
		int[] arr2 = copyArr(arr);
		
		
		System.out.println(Arrays.toString(arr)); //[4, 7, 1, 9, 3]
		System.out.println(Arrays.toString(arr2)); //[4, 7, 1, 9, 3]
		
		orderBy(arr2);
				
		System.out.println(Arrays.toString(arr)); //[4, 7, 1, 9, 3]
		System.out.println(Arrays.toString(arr2)); //[1, 3, 4, 7, 9]
	}
	
	public static int[] copyArr(int[] arr) {
		int[] cArr = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			cArr[i] = arr[i];
		}
		return cArr;
	}
	
	public static void orderBy(int[] arr) {
		Arrays.sort(arr);
	}

}











