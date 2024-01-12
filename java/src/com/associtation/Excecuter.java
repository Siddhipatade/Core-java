package com.associtation;
//program to demonstrate is a reletionship inheritance
public class Excecuter {

	public static void main(String[] args) {
		// Creating an Employee object
        Employee employee = new Employee("Siddhi", 101, "CTC2");

        // Creating a Manager object
        Maneger manager = new Maneger("Kishor kumar", 102, "CTC2", 5);

        // Displaying Employee details
        System.out.println("Employee Details:");
        System.out.println(employee);

        // Displaying Manager details
        System.out.println("\nManager Details:");
        System.out.println(manager);
    }
	

}
