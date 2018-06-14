package com.example.JUnitHamcrestPractice;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class MyTests {

	@Before
	public void testSetup() {
		// do stuff to setup the test
	}
	
	@Test
	public void TestDoSomethingWithFirstNameSaysHello() {
		MethodsThatDoStuff methodsThatDoStuff = new MethodsThatDoStuff();
		
		assertThat(methodsThatDoStuff.doSomethingWithFirstName("Bob"), equalTo("hello Bob"));
	}
	
	@Test
	public void TestCombineTwoStringIntoAName() {
		Person person = mock(Person.class);
		when(person.getFirstName()).thenReturn("Susan");
		when(person.getLastName()).thenReturn("Jones");
		
		MethodsThatDoStuff methodsThatDoStuff = new MethodsThatDoStuff(person);
		assertThat(methodsThatDoStuff.combineTwoString(), equalTo("Susan Jones"));
	}
}
