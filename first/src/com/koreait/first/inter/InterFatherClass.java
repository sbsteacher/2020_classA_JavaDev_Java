package com.koreait.first.inter;

public class InterFatherClass 
	implements InterParent, InterGrand  {

	@Override
	public void print() {
		System.out.println("I'm your father.");
	}

	@Override
	public void print2() {		
		
	}

}
