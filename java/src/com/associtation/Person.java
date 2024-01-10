package com.associtation;

public class Person {

	private String name;
	private Address address;
	/**
	 * @param name
	 * @param address
	 */
	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println( "Name: " + name);
		System.out.println("Address: " +address.getStreet() + " " + address.getCity()+ " " + address.getState()+ " "+ address.getPostalcode());
	}
	
	
	
	
}
