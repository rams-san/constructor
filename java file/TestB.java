package com.capgemini.javabasics.constructor;

public class TestB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("sar", 24, 25000);
		e1.printDetails();

		System.out.println("*********************************");
		
		Employee e2 = new Employee("yash", 8055, 20000000);
		e2.printDetails();
	}

}
