package com.koreait.first;

public class Print {

	public static void main(String[] args) {
		System.out.println("안녕");
		System.out.println("안녕");
		System.out.println("---------------");
		System.out.print("Hello\n");
		System.out.print("Hello\n");

		String name = "홍길동";
		int age = 22;
		float height = 176.4f;
		double weight = 60.2;
		char bloodType = 'A';
		
		//내 이름은 홍길동입니다. 제 나이는 22살이고, 키는 176.4cm이고,
		// 몸무게는 60.2kg이고, 혈액형은 A형입니다.
		
		System.out.println("내 이름은 " + name + "입니다. 제 나이는 " + age +"살이고, 키는 "
				+ height + "cm이고, 몸무게는 " + weight + "kg이고, 혈액형은 " 
				+ bloodType + "형입니다.");
		
		System.out.printf("내 이름은 %s입니다. 제 나이는 %d살이고, 키는 %.4fcm이고, 몸무게는 "
				+ "%.1fkg이고, 혈액형은 %c형입니다.\n", name, age, height, weight, bloodType);
		
		System.out.printf("%c : %d\n", bloodType, (int)bloodType);
		System.out.printf("%c : %d\n", (char)66, 66);
		
		int y = 2020;
		int m = 12;
		int d = 4;
		
		String format = String.format("%d%02d%02d", y, m, d);
		System.out.println("format : " + format);
		
	}

}
