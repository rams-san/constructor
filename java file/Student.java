package com.capgemini.javabasics.constructor;

public class Student {
	String name;
	int id;
	double percentage;

	Student() {
		System.out.println("Student Constructor");
	}

	void printDetails() {
		System.out.println("Name: " + name);
		System.out.println("ID: " + id);
		System.out.println("Percentage: " + percentage);
	}
}
