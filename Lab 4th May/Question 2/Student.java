package com.lab_question2;

public class Student {
	// instance variables
	int id;
	String name;
	
	// parameterized constructor
	Student(int id, String name){
		this.id=id;
		this.name=name;
	}
	
	public String toString() { // to string method
		return "ID : "+id+" and  Name : "+name; // 
	}
}
