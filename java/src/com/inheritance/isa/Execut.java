package com.inheritance.isa;

public class Execut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creating a Citizen object
        Citizen citizen = new Citizen("John Doe", "123456789", "123 Main St", 1234567890);

        // Displaying Citizen details
        System.out.println("Citizen Details:");
        System.out.println(citizen);

        // Creating a Student object
        Student student = new Student("Alice Smith", "987654321", "456 University Ave", 987654321, 101, "ABC College");

        // Displaying Student details
        System.out.println("\nStudent Details:");
        System.out.println(student);
    }
	

}
