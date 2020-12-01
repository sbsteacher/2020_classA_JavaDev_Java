package com.koreait.first.obj;

public class CarTest {

	public static void main(String[] args) {
		Car car1 = new Car();
		car1.name = "페라리";
		car1.cc = 5000;
		car1.color = "붉은색";
				
		Car car2 = new Car();
		car2.name = "포르쉐";
		car2.cc = 3500;
		car2.color = "블랙";
		
		
		car1.drive();
		car2.drive();
		
		System.out.println(car1 == car2);

	}

}
