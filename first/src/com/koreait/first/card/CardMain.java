package com.koreait.first.card;

public class CardMain {

	public static void main(String[] args) {
		//52개의 카드 객체를 담을 수 있는 배열 생성
		//52개의 서로 다른 값을 가지고 있는 카드 객체를 모두
		//담아 주세요~
		String[] shapes = {"spade", "heart", "clover", "diamond"};
		
		Card[] cardList = new Card[52];
		int idx = 0;
		for(String shape : shapes) {
			for(int z=1; z<=13; z++) {
				String val;
				switch(z) {
				case 1:
					val = "A";
					break;
				case 11:
					val = "J";
					break;
				case 12:
					val = "Q";
					break;
				case 13:
					val = "K";
					break;
				default:
					val = String.valueOf(z);
				}
				cardList[idx++] = new Card(shape, val);
			}
		}
		
		//forEach //iterator
		for(Card c : cardList) {
			System.out.println(c);
		}
		
		
		
	}

}
