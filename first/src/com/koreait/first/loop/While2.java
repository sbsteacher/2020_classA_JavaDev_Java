package com.koreait.first.loop;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int result = 0;
		System.out.print("숫자를 입력하세요(종료:0) :");		
		int val = scan.nextInt();		
		
		while(val != 0) {
			result += val;
			
			System.out.print("숫자를 입력하세요(종료:0) :");		
			val = scan.nextInt();
		}
		
		System.out.println("합계 : " + result);
		scan.close();
	}

}
