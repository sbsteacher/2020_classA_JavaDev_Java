package com.koreait.first.obj2;

public class InheriTest {
	public static void main(String[] args) {
		ClassA cA = new ClassA();
		cA.setName("홍길동");
		//cA.setAge(10); //불가능
		//cA.print(); //불가능
		
		ClassB cB = new ClassB();
		cB.setName("김남길");
		cB.setAge(10);
		//cB.print(); //불가능
		
		ClassC cC = new ClassC("", 0);
		cC.setName("윤두준");
		cC.setAge(20);
		cC.print();
		
		ClassD cD = new ClassD("가나다", 10);
		cD.print();
	
	}
}
