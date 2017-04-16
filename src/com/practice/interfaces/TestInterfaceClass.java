package com.practice.interfaces;

public class TestInterfaceClass implements LearnInterface ,Learn2Interface{

	@Override
	public void height(int height) {
		System.out.println("inside heigh method");
		System.out.println("inside heigh method");
		System.out.println("inside heigh method");
		
	}

	@Override
	public void setHeight() {
		System.out.println("inside heigh setHeight");
		
	}
	
	public static void main(String[] args) {
		
		TestInterfaceClass testInter = new TestInterfaceClass();
		testInter.setHeight();
	}

	public void setWidth() {
		// TODO Auto-generated method stub
		
	}

}
