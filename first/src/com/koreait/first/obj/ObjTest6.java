package com.koreait.first.obj;

public class ObjTest6 {

	public static NumberBox2 copyObj(NumberBox2 nbb) {
		NumberBox2 newNbx = new NumberBox2();
		newNbx.a = nbb.a;
		newNbx.b = nbb.b;
		return newNbx;
	}
	
	public static void main(String[] args) {
		NumberBox2 nbb = new NumberBox2();
		nbb.a = 11;
		nbb.b = 22;
		
		NumberBox2 nbb2 = copyObj(nbb);
		nbb2.b = 40;
		
		NumberBox2 nbb3 = copyObj(nbb2);
		nbb3.a = 30;
		
		System.out.println("nbb : " + nbb.sum());  //33, 33, 70
		System.out.println("nbb2 : " + nbb2.sum());//40, 51, 70
		System.out.println("nbb3 : " + nbb3.sum());//30, 70, 70
	}
	
	/*
	public static void main(String[] args) {
		NumberBox2 nbb = new NumberBox2();
		nbb.a = 11;
		nbb.b = 22;
		
		NumberBox2 nbb2 = copyObj(nbb);
		
		System.out.println(nbb.sum()); //33
		System.out.println(nbb2.sum()); //33
		
		nbb2.a = 15;
		nbb2.b = 34;
		
		System.out.println(nbb.sum()); //33
		System.out.println(nbb2.sum()); //49
	}
	*/
	

}
