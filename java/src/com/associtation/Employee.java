package com.associtation;
// parent class
public class Employee {

	
	private String name;
	private int empNo;
	private String department;
	
	// constructor
	
	public Employee( String name, int empNo, String department) {
		super();
		this.name = name;
		this.empNo = empNo;
		this.department = department;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	
	
	 @Override
	    public String toString() {
	        return "Employee [" + name + "," + empNo + "," + department + "]";
	    }
	
	
	
	
	

}
