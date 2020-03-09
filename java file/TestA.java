package com.capgemini.javabasics.constructor;

public class TestA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
        s1.name = "Rashmika";
        s1.id = 101;
        s1.percentage=80.83;
        s1.printDetails();
        
        System.out.println("**************************");
        
        Student s2 =new Student();
        s2.name="Akshay";
        s2.id= 102;
        s2.percentage=100.0;
        s2.printDetails();
	}

}
