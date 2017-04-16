package com.practice.objectexample;

public class Person implements Cloneable {
	
	int a=8;
	
public static void main(String[] args) throws CloneNotSupportedException {
		
		Person person = new Person();
		System.out.println("Test::"+person.a);
		Person p1=(Person)person.clone();
		
		System.out.println("Test::"+p1.a);
		
		System.out.println(p1.equals(person));
		System.out.println("Test::"+p1.getClass());
		System.out.println("P1 --Hashcode::"+p1.hashCode());
		System.out.println("P1 --Hashcode::"+p1.hashCode());
		System.out.println("person --Hashcode::"+person.hashCode());
//		person.notifyAll();
		System.out.println("toString::"+person.toString());
		
	}

//@Override
//public String toString() {
//	// TODO Auto-generated method stub
//	return "person";
//}

}
