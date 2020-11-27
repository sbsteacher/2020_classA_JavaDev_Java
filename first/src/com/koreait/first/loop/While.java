package com.koreait.first.loop;

public class While {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			System.out.print(i + ",");
		}
		
		System.out.println();
		
		int i=0;
		while(i<5) {
			System.out.print(i + ",");
			i++;
		}
		
		System.out.println();
		
		
		
		int z=0;
		while(true) {			
			if(z == 5) {
				break;
			}
			System.out.print(z + ",");
			z++;
		}
		
		int y=0;
		for( ;y<10; y++) {
			System.out.print(y);
		}
	}

}
