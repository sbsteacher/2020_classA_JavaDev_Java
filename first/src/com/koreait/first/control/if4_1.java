package com.koreait.first.control;

import java.util.Scanner;

public class if4_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("성별을 입력해 주세요(남/여) : ");
		String gender = scan.next();
		System.out.print("키를 입력해 주세요 : ");
		int height = scan.nextInt();
		
		
		
		if("남".equals(gender)) { //166
			int avgHeight = 165;
			
			if(height > avgHeight) {
				System.out.println("평균 초과입니다.");
				
			} else if(height < avgHeight) {
				System.out.println("평균 미만입니다.");
				
			} else {
				System.out.println("평균입니다.");
			}
			
		} else if("여".equals(gender)) { //157
			int avgHeight = 157;
			
			if(height > avgHeight) {
				System.out.println("평균 초과입니다.");
				
			} else if(height < avgHeight) {
				System.out.println("평균 미만입니다.");
				
			} else {
				System.out.println("평균입니다.");
			}
		}
		
		scan.close();
	}

}
