package com.capgemini.javabasics.constructor;

public class MyEmployee {
	String name;
	int id;
	double salary;

	MyEmployee(String name,int id, double salary){
		this.name = name;
		this.id=id;
		this.salary=salary;
	}

	void printDetails() {
		System.out.println("Name: " + name);
		System.out.println("Id: " + id);
		System.out.println("Salary: " + salary);

		System.out.println("************************");
	}

}
