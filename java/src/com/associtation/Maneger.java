package com.associtation;
// subclass  or child
public class Maneger extends Employee {

	private String name;
	private int empNo;
	private String department;
	// constructor
	public Maneger(String name, int empNo, String department) {
		super();
		this.name = name;
		this.empNo = empNo;
		this.department = department;
	}
	
	
	// getter and setter
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
	    return "Manager: " +
	            "name='" + getName() + '\'' +
	            ", empNo=" + getEmpNo() +
	            ", department='" + getDepartment() + '\'' +
	            ", teamSize=" + getTeamSize();
	}
	

}
