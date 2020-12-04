package com.koreait.first.obj2;

public class AnimalTest {

	public static void main(String[] args) {
		Animal ani_1 = new Animal(); //A (바둑이, 2살)		
		ani_1.crying();
		
		Animal ani_2 = new Animal("나비", 3); //B
		
		Animal ani_3 = new Animal("달미"); //C
		ani_3.crying();
		
		Animal ani_4 = new Animal(4); //D
		ani_4.crying();
	}
}
