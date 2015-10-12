package com.cisc181.core;

public class PersonException extends Exception {
	private Person rando;
	public  PersonException(Person rando) {
		super("Too old");
	}
	public Person getrando() {
		return rando;
	}
	public PersonException(String phone_number) {
		super("Invalid phone number");
	}
	
}