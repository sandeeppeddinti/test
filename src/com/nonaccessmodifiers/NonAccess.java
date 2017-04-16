package com.nonaccessmodifiers;

public  class NonAccess extends Practise {// cannot extend child class when final
											// keyword is mentioned in parent
											// class

	public static void main(String[] args) {
		NonAccess non = new NonAccess();
		Practise practise = new Practise();// we cannot create object when the
											// class is object
		int i = practise.sum();
		i = 4;
		int x = 1 - 2;
		int y = i - 2;

		System.out.println("print c value::" + i);
		practise.j = 10;// cannot change instance variable when it is final
		System.out.println(practise.j);
	}

	
}
