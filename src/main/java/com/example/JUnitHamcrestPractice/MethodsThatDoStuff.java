package com.example.JUnitHamcrestPractice;

public class MethodsThatDoStuff {

	private Person person;
	
	public MethodsThatDoStuff() {
		//default
		person = new Person();
		person.setFirstName("Bob");
	}
	
	public MethodsThatDoStuff(Person person) {
		this.person = person;
	}

	public String doSomethingWithFirstName(String firstName) {
		return "hello " + person.getFirstName();
	}

	public String combineTwoString() {
		return person.getFirstName() + " " + person.getLastName();
	}

	public String combineTwoString(String firstName, String lastName) {
		person.setFirstName(firstName);
		person.setLastName(lastName);
		return person.getFirstName() + " " + person.getLastName();
	}
}
