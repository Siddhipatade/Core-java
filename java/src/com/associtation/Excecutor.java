package com.associtation;

public class Excecutor {
// program to demonstrate has a association
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address address=new Address("Vijay chowk", "Mumbai", "MH", "400067");
		Person person= new Person("Siddhi", address);

		person.display();
	}

}
