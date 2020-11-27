package com.koreait.first.loop;

public class For8 {

	public static void main(String[] args) {
		for(int i=2; i<10; i++) {
			for(int z=1; z<10; z++) {
				System.out.printf("%d X %d = %d\n", i, z, i*z);
			}
			if(i < 9) {
				System.out.println("---------");
			}
			
		}

	}

}
