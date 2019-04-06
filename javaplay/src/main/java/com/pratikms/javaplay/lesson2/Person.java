package com.pratikms.javaplay.lesson2;

import com.pratikms.javaplay.lesson3.Name;

public class Person {
	
	public Name personName;
	
	public Person() {
		
	}
	
	public Person(Name personName) {
		this.personName = personName;
	}

	public String helloWorld() {
		// TODO Auto-generated method stub
		return "Hello world!";
	}

	public String hello(String name) {
		// TODO Auto-generated method stub
		return "Hello " + name;
	}

}
