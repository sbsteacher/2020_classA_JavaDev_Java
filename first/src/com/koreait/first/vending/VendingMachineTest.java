package com.koreait.first.vending;

import java.util.Scanner;

public class VendingMachineTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] nmArr = {"콜라", "사이다", "환타", "솔의눈", "데자와"};
		int[] priceArr = {500, 600, 700, 800, 900};
		
		System.out.println("-- 메뉴 --");
		for(int i=0; i<nmArr.length; i++) {
			System.out.printf("%d. %s - (%,d원)\n"
					, i+1, nmArr[i], priceArr[i]);
		}		
		int total = 0;
		while(true) {
			System.out.print("메뉴선택 (0:종료) > ");
			int choiceNo = scan.nextInt();
			if(choiceNo == 0) {
				break;
			}
			total += priceArr[choiceNo - 1];
		}
		System.out.printf("총 구매금액 : %,d원\n", total);
		scan.close();
	}

}
