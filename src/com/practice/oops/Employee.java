package com.practice.oops;

public  class Employee extends Person {

	public int roadNumber=9;
	public static int empId;
	int empSalary;
	int taxId;
//	int tax;
//	public Employee(){
//		System.out.println("This is default constructor");
//	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int inputEmpId,int inputEmpSal,int inputTaxId){
		System.out.println("This is parameterized constructor");
		empId=inputEmpId;
		empSalary=inputEmpSal;
		taxId=inputTaxId;
	}
	
	public Employee(int empIdinPut,int empSal){
		System.out.println("This is parameterized constructor with two parameters");
		empId=empIdinPut;
		empSalary=empSal;
	}
	public Employee(int empIdd,int empSalaryy,int emptaxIdd,int abc){
		
		int tax=abc+empIdd;
		 empId=tax;
		 empSalary=empSalaryy;
		 taxId=emptaxIdd;
	}
	
	public Employee(int empId){
		System.out.println("This is parameterized constructor with one parameters");
		System.out.println(empId);
	}
	
	
	public void disyFieldValues(){
		System.out.println(empId);
		System.out.println(taxId);
		System.out.println(empSalary);
	}
	
	public String sendName(String name){
		
		return name;
	}

	@Override
	public void displayEmpSal() {
		System.out.println("emp1");
		
	}
	
	
}
