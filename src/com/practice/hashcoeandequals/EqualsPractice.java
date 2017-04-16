package com.practice.hashcoeandequals;

import java.util.HashMap;
import java.util.Map;

public class EqualsPractice {
      private Integer  age;
      private String name;
      private Double salary;
	
      public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public EqualsPractice(int ag, double sal,String nam){
		this.age=ag;
		this.salary=sal;
		this.name=nam;
	}
//	@Override
//	public String toString() {
//		String s="EqualsPractice"+ age;
//		s += " "+salary;
//		s+= " "+name;
//		return s;
//	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof EqualsPractice){
			//System.out.println("true");
		EqualsPractice eq = (EqualsPractice) obj;
		if(this.age.equals(eq.age)&&(this.name.equals(eq.name)&&(this.salary.equals(salary)))){
			return true;
			
		}
		
		}
	
		return false;
	}
	
	
      public static void main(String[] args){
    	  
    
    	  EqualsPractice equal = new EqualsPractice(16, 22000, "sandy");
    	  EqualsPractice equal2 = new EqualsPractice(22, 55555, "peddinti");
    	  EqualsPractice equal3 = new EqualsPractice(16, 22000, "sandy");
    	  
    	 
//           equal.setAge(22);
//           equal.setName("sandeep");
//           equal.setSalary(12000);
           System.out.println("print age::"+equal.getAge());
           System.out.println("print name::"+equal.getName());
           System.out.println("print salary::"+equal.getSalary());
           System.out.println("print method::"+equal.age +equal.name +equal.salary );
         //  System.out.println("print method::"+equal.toString() );
           System.out.println("check equalence one:::"+ equal.equals(equal2));
           System.out.println("check equalence two:::"+ equal2.equals(equal3));
           System.out.println("check equalence three:::"+ equal.equals(equal3));
           
          
           
           
      }
}
