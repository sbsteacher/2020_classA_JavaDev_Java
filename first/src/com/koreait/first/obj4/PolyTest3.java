package com.koreait.first.obj4;

public class PolyTest3 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Bird bird = new Bird();
		
		Animal ani = cat;
		System.out.println(ani instanceof Dog);
		polyCry(dog);
		polyCry(cat);
		polyCry(bird);
	}
	
	public static void polyCry(Animal ani) {
		ani.crying();		
		if(ani instanceof Dog) {
			//Dog dog = (Dog)ani;
			//dog.shakeTail();			
			((Dog)ani).shakeTail();
		}
	}	
}






