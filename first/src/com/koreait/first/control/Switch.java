package com.koreait.first.control;

public class Switch {

	public static void main(String[] args) {		
		int num = 5;
		
		switch(num) {
			case 1:
				System.out.println("1입니다.");
			default:
				System.out.println("1~4가 아닙니다.");
			case 2:
				System.out.println("2입니다.");
				break;
			case 3:
				System.out.println("3입니다.");
				
			case 4:
				System.out.println("4입니다.");
				System.out.println("4입니다.");			
		}
		
		System.out.println("-----------------");
		
		String season = "겨울";
		
		switch(season) {
			case "봄":
				System.out.println("꽃이 피었습니다.");
				break;
			case "여름":
				System.out.println("물놀이 가요");
				break;
			case "가을":
				System.out.println("단풍구경 갑시다.");
				break;
			case "겨울":
				System.out.println("눈싸움 해요~~");
				break;
			default:
			
		}

	}

}
