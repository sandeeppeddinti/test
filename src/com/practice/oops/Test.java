package com.practice.oops;

public class Test {

	Test() {

	}

	public static void main(String[] args) {
		

		// Employee emp = new Employee();
		//
		// System.out.println("Tax id :"+emp.taxId);
		// System.out.println("Emp Id :"+emp.empId);
		// System.out.println("Emp Sal :"+emp.empSalary);
		//

		Employee emp1 = new Employee(2, 400, 123, 456);

		System.out.println("Tax id :" + emp1.taxId);
		System.out.println("Emp Id :" + emp1.empId);
		System.out.println("Emp Sal :" + emp1.empSalary);
		// System.out.println("Emp Sal :"+emp1.tax);
		emp1.roadNumber = 29;
		System.out.println(emp1.sendName("test"));
		System.out.println(emp1.roadNumber);

	}

}
