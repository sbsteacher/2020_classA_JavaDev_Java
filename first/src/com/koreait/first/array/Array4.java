package com.koreait.first.array;

import java.util.Arrays;

public class Array4 {
	//버블 정렬
	public static void main(String[] args) {
		int[] arr = {9, 4, 7, 5, 1, 3, 0};
		
		System.out.println("시작: " + Arrays.toString(arr));
		
		for(int i=arr.length-1; i>0; i--) {	
			for(int z=0; z<i; z++) {
				if(arr[z] > arr[z+1]) {
					int temp = arr[z+1];
					arr[z+1] = arr[z];
					arr[z] = temp;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+",");
		}

	}

}
