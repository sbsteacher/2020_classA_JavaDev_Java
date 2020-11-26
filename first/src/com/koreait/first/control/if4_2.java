package com.koreait.first.control;

import java.util.Scanner;

public class if4_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("성별을 입력해 주세요(남/여) : ");
		String gender = scan.next();
		System.out.print("키를 입력해 주세요 : ");
		int height = scan.nextInt();
		
		int avgHeight = 0;
		
		if("남".equals(gender) || "남자".equals(gender) || "man".equals(gender)) { //166
			avgHeight = 166;
			
		} else if("여".equals(gender) || "여자".equals(gender)|| "woman".equals(gender)) { //157
			avgHeight = 157;
		}
		
		if(height > avgHeight) {
			System.out.println("평균 초과입니다.!!!");
			
		} else if(height < avgHeight) {
			System.out.println("평균 미만입니다.");
			
		} else {
			System.out.println("평균입니다.");
		}
		
		scan.close();
	}

}
