package com.koreait.first.loop;

public class For7 {

	public static void main(String[] args) {
		int star = 10;
		for(int i=1; i<=star; i++) {
			for(int z=0; z<star; z++) {
				if(star - i > z) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println("----------");
		
		for(int i=star; i>0; i--) {
			for(int z=1; z<=star; z++) {
				if(i > z) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

}
