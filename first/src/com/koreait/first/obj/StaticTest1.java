package com.koreait.first.obj;

import java.io.PrintStream;

public class StaticTest1 {

	public static void main(String[] args) {
		Tv tv1 = new Tv();
		tv1.country = "Korea";
		tv1.brand = "Samsung";
		tv1.inch = 50;		
		tv1.printMe();
		
		Tv tv2 = new Tv();
		tv2.country = "USA";
		tv2.brand = "Apple";
		tv2.inch = 40;
		
		Tv.country = "France";
		
		tv2.printMe();
		tv1.printMe();		
	}
}


class Tv {
	static String country;
	String brand;
	int inch;
	
	void printMe() {
		System.out.printf("%s나라의 %s회사의 %d인치 Tv입니다.\n"
				, country, brand, inch);
	}
	
	static String whereCountry() {
		return country;
	}
	
	static int sum(int n1, int n2) {
		return n1 + n2;
	}
}




