package com.tcs;

public class Starter {

	public static void main(String[] args) {
		// Employee object will be created with the help of default constructor
		Employee emp = new Employee();
		System.out.println(emp);
		System.out.println(emp.hashCode());

		Employee emp2;
		// emp, emp2 object references
		// emp is referring to actual object
		// emp2 is null
//		System.out.println(emp2);

		Employee emp3 = new Employee(100, "test");
		System.out.println(emp3);
		
		emp.setId(200);
		emp.setName("ABC");
		
		System.out.println(emp);
	}

}