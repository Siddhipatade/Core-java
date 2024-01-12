package com.inheritance.isa;

public class Student extends Citizen {


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	int rollNo;
	String collegeName;


	 public Student(String name, String adharNo, String address, long phone, int rollNo, String collegeName) {
	        super(name, adharNo, address, phone);
	        this.rollNo = rollNo;
	        this.collegeName = collegeName;
	    }

	    public int getRollNo() {
	        return rollNo;
	    }

	    public void setRollNo(int rollNo) {
	        this.rollNo = rollNo;
	    }

	    public String getCollegeName() {
	        return collegeName;
	    }

	    public void setCollegeName(String collegeName) {
	        this.collegeName = collegeName;
	    }

		@Override
		public String toString() {
			return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", getRollNo()=" + getRollNo()
					+ ", getCollegeName()=" + getCollegeName() + ", getName()=" + getName() + ", getAdharNo()="
					+ getAdharNo() + ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone() + ", getClass()="
					+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}
	


	
	
	
	

}
