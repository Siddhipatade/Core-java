package com.associtation;

public class Employee {

	private int teamSize;
	
	
	
	public Maneger(String name, int empNo, String departement, int teamSize) {
		super(name, empNo, department);
		this.teamSize = teamSize;
	}

	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	@Override
	public String toString() {
	    return "Employee: " +
	            "name='" + getname() + '\'' +
	            ", empNo=" + getempNo() +
	            ", department='" + getdepartment() + '\'' +
	            ", teamSize=" + getTeamSize();
	}
	

}
