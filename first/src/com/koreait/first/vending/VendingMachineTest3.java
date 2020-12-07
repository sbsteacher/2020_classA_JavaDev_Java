package com.koreait.first.vending;

import java.util.Scanner;

public class VendingMachineTest3 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] nmArr = {"콜라", "사이다", "환타", "솔의눈", "데자와"};
		int[] priceArr = {500, 600, 700, 800, 900};
		
		showMenus(nmArr, priceArr);
		
		//1~5, 0은 종료, 0~5 벗어난 값을 입력하면 "잘 못 입력하셨습니다."
		//0번 입력되면 합계값을 리턴하는 메소드
		int sum = purchase(priceArr, scan);
		System.out.printf("총 구매금액 : %,d원\n", sum);
		scan.close();
	}
	
	public static int purchase(int[] priceArr, Scanner scan) {
		int sum = 0;
		while(true) {
			System.out.print("메뉴선택 (0:종료) > ");
			int choiceNo = scan.nextInt();
			if(choiceNo == 0) {
				break;
			} else if(choiceNo < 0 || choiceNo > priceArr.length) {
				System.out.println("잘 못 입력하였습니다.");				
			}			
			sum += priceArr[choiceNo - 1];
		}
		return sum;
	}
	
	public static void showMenus(String[] nmArr, int[] priceArr) {
		System.out.println("-- 메뉴 --");
		for(int i=0; i<nmArr.length; i++) {
			System.out.printf("%d. %s - (%,d원)\n"
					, i+1, nmArr[i], priceArr[i]);
		}
	}
}






