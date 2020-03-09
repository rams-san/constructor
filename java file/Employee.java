package com.capgemini.javabasics.constructor;

public class Employee {
	String name;
	int id;
	double salary;
	
	Employee(String ename, int eid, double esalary){
		name=ename;
		id=eid;
		salary=esalary;
	}
	void printDetails(){
		System.out.println("Name: "+name);
		System.out.println("Id: "+id);
		System.out.println("Salary: "+salary);
	}
}

