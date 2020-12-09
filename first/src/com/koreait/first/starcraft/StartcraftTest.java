package com.koreait.first.starcraft;

public class StartcraftTest {

	public static void main(String[] args) {
		Marine m1 = new Marine();
		Marine m2 = new Marine();
		Firebat f1 = new Firebat();
		Medic md = new Medic();
		SCV scv = new SCV();
		
		m1.attack(m2);
		f1.attack(m2);
		
		m1.attack(scv);
		f1.attack(scv);
		
		System.out.println("---- 마린 ");
		m2.showMyHp();
		md.heal(m2);
		m2.showMyHp();
		
		System.out.println("---- SCV ");
		scv.showMyHp();
		md.heal(scv);
		scv.showMyHp();
		

	}

}
