package com.practice.nonaccessmodifiers;

import javafx.geometry.NodeOrientation;

public class NonAccessModifierTest {
	
	
	int number=4;

	public static void main(String[] args) throws ClassNotFoundException {
//		Parent parent = new Parent();
		NonAccessModifierTest nonObject = new NonAccessModifierTest();
		System.out.println(nonObject.number);
		
		Child child = new Child("Test");
		System.out.println(Parent.name);
		child.displayName();
		NonAccessModifierTest nonObject2 = new NonAccessModifierTest();
		
		Class.forName("com.sandeep.datatypes.TestConstructor");

	}
//	static {
//		System.out.println("this is static block");
//	}
//	static {
//		int x=10;
//		System.out.println("this is static block"+ nonObject2.x);
//	}
	
		
}

