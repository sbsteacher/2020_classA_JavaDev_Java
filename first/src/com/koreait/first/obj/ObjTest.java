package com.koreait.first.obj;

public class ObjTest {
	public static void main(String[] args) {
		int num = 10;
		
		NumberBox nbx = new NumberBox();//대구 주택
		nbx.num = 10;		
		
		changeVal(num);
		changeVal(nbx);
		
		System.out.println("num: " + num);
		System.out.println("nbx.num: " + nbx.num);		
	}
	
	public static void changeVal(int num) {
		num = 20;
	}	
	public static void changeVal(NumberBox pNbx) {		
		pNbx.num = 20;
	}	
	
}
class NumberBox {
	int num;	
}











