package com.koreait.first;

import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("나이를 입력해 주세요 : ");		
		int age = scan.nextInt();		
		System.out.println("나의 나이는 " + age + "살 입니다.");
		
		System.out.print("직업을 입력해 주세요 : ");		
		String job = scan.next();
		System.out.printf("나의 입력은 %s입니다.\n", job);
	}
}
