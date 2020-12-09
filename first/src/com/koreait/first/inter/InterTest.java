package com.koreait.first.inter;

public class InterTest {

	public static void main(String[] args) {
		InterParent ip = new InterFatherClass();
		ip.print();
		System.out.println(ip.MAX);
		InterParent ip2 = new InterParentClass();
		ip2.print();
	}

}
