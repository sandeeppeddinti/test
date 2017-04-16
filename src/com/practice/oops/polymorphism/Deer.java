package com.practice.oops.polymorphism;

public class Deer extends Animal implements Vegetarian {

	public void add(){
		System.out.println("Deer is vegetarian");
	}
	public void abc(){
		System.out.println("==================");
	}
	public static void main(String[] args) {
         Deer d = new Deer();
         Animal a=d;
         Vegetarian v=d;
         d.add();
         d.abc();
         d.sub();
         Vegetarian.mul();
	}

}
