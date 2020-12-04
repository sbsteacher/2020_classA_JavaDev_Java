package com.koreait.first.obj2;

public class InheriTest3 {

	public static void main(String[] args) {
		ClassC cA = new ClassD("김남길", 20);
		
		cA.print();
		//cA.ddd();
		
		ClassD cD = (ClassD)cA;
		
		cD.ddd();
		

	}

}
