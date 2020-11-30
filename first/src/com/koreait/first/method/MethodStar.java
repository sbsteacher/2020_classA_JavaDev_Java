package com.koreait.first.method;

public class MethodStar {

	public static void main(String[] args) {
		printStarReverseTri(6);
	}	
	
	public static void printStarReverseTri(int star) {
		for(int i=star-1; i>=0; i--) {
			printShape(i, " ");
			printStar(star-i);
			System.out.println();
		}
	}
	
	public static void printStarTri(int star) {
		for(int i=1; i<=star; i++) {
			printStar(i);
			System.out.println();
		}
	}
	
	public static void printStarSquare(int star) {
		for(int i=0; i<star; i++) {
			printStar(star);
			System.out.println();
		}
	}
	
	public static void printShape(int star, String shape) {
		for(int i=0; i<star; i++) {
			System.out.print(shape);
		}
	}
	
	public static void printStar(int star) {
		printShape(star, "*");
	}

}
