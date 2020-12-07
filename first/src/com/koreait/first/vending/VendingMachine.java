package com.koreait.first.vending;

public class VendingMachine {
	private Can[] canArr;
	private int sum;
	
	public VendingMachine() {
		init();
	}
	
	private void init() {
		String[] nmArr = {"콜라", "사이다", "환타", "솔의눈", "데자와"};
		int[] priceArr = {500, 600, 700, 800, 900};
		
		canArr = new Can[nmArr.length];
		
		for(int i=0; i<canArr.length; i++) {
			canArr[i] = new Can(nmArr[i], priceArr[i]);
		}
	}
}
