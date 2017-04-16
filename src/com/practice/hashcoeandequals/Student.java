package com.practice.hashcoeandequals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Student {
	private String id;
	private String name;
	private String email;
	private int age;

	public Student(String id, String name, String email, int age) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
	}

	public String toString() {
		String studentInfo = "Student " + id;
		studentInfo += ": " + name;
		studentInfo += " - " + email;
		studentInfo += " - " + age;

		return studentInfo;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student another =  (Student) obj;
			if (this.id.equals(another.id) && this.name.equals(another.name) && this.email.equals(another.email)
					&& this.age == another.age) {
				return true;
			}
		}

		return false;
	}
	
	
	
//	public int hashCode() {
//	    return 31 +id.hashCode();
//	}
	
	
	
	public static void main(String[] args) {
		Student student1 = new Student("123", "Tom", "tom@gmail.com", 30);
		Student student2 = new Student("123", "Tom", "tom@gmail.com", 30);
		Student student3 = new Student("456", "Peter", "peter@gmail.com", 23);
		
		System.out.println("one::::"+student1.hashCode());
		System.out.println("two::::"+student2.hashCode());
		System.out.println("three::::"+student3.hashCode());
		 
//		System.out.println("student1 == student2: " + (student1 == student2)+"one::::"+student1.hashCode());
//		System.out.println("student1.equals(student2): " + (student1.equals(student2)+"one::::"+student1.hashCode()));
//		System.out.println("student2.equals(student3): " + (student2.equals(student3)));
		
		Set<Student> setStudents = new HashSet<Student>();
		 
		setStudents.add(student1);
		setStudents.add(student2);
		setStudents.add(student3);
		
		for (Student student : setStudents) {
		System.out.println(student);	
		}
		
		
		 Map<Integer,Student> mapObject = new HashMap<>();
         mapObject.put(1, student1);
         mapObject.put(2, student2);
//         mapObject.put("s3", student3);
//         mapObject.put("s3", student3);
//         mapObject.put("s4", null);
         mapObject.put(null, null);
         mapObject.put(null, null);
		
         
         System.out.println("mapdata::"+mapObject.size());
         System.out.println("mapdata::"+mapObject);
        
	}
}
