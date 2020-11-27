package com.koreait.first.array;

public class Array3 {

	public static void main(String[] args) {
		int[] arr = {20, 11, 34, 99, 13, 15, 87, 12};
		
		//배열에서 홀수만 출력되도록 해주세요~
		for(int i=0; i<arr.length; i++) {
			if(arr[i] % 2 == 1) {
				System.out.println(arr[i]);
			}
		}

	}

}
