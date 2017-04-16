package com.practice.oops.inheritance;

public class DogClass extends MammalClass {

	public static void main(String[] args) {
		AnimalClass animal = new AnimalClass();

		MammalClass mammal = new MammalClass();

		ReptileClass reptile = new ReptileClass();

		DogClass dog = new DogClass();

		AnimalClass ani = new DogClass();

		AnimalClass animalcalss = new ReptileClass();

		System.out.println(animal instanceof AnimalClass);

		System.out.println(reptile instanceof AnimalClass);

		System.out.println(mammal instanceof AnimalClass);
		System.out.println(dog instanceof AnimalClass);
		System.out.println(dog instanceof MammalClass);
		
		System.out.println(animal instanceof MammalClass);
		
		// System.out.println(dog.abc());
		System.out.println(ani instanceof DogClass);

	}

}
