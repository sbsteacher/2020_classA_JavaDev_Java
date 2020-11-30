package com.koreait.first.array;

import java.util.Arrays;

public class Array5 {
	//선택정렬!!
	public static void main(String[] args) {
		int[] arr = {9, 4, 7, 5, 1, 3, 0};
		
		for(int i=0; i<arr.length-1; i++) {	
			int least = i;
			for(int z=i+1; z<arr.length; z++) {				
				if(arr[least] > arr[z]) { //자리 바꾸기
					least = z;
				}
			}			
			if(i != least) {
				int temp = arr[least];
				arr[least] = arr[i];
				arr[i] = temp;
			}
		}
		
		System.out.println(Arrays.toString(arr));

	}

}
