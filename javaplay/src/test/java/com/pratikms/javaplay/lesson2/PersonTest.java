package com.pratikms.javaplay.lesson2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.pratikms.javaplay.lesson2.Person;

public class PersonTest {
	
	@Test
	public void shouldReturnHelloWorld() {
		Person person = new Person();
		assertEquals("Hello world!", person.helloWorld());
	}
	
	@Test
	public void shouldReturnHelloPratik() {
		Person person = new Person();
		assertEquals("Hello Pratik", person.hello("Pratik"));
	}

}
