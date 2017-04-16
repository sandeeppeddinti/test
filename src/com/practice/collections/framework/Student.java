package com.practice.collections.framework;

public class Student 
{
    private String studentname;
    private int studentage;
    Student(String name, int age)
    {
         this.studentname=name;
         this.studentage=age;
    }
    @Override
    public String toString() {
       return "Name is: "+this.studentname+" & Age is: "+this.studentage;
    }
    
    public String display(){
    	System.out.println("name::"+this.studentname);
    	return this.studentname;
    }
}