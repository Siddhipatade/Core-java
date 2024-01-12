package com.associtation;
// subclass  or child
public class Maneger extends Employee {

	private int teamSize;
	
	

	public Maneger(String name, int empNo, String department, int teamSize) {
		super(name, empNo, department);
		this.teamSize = teamSize;
	}

	// getter and setter
	public int getTeamSize() {
		return teamSize;
	}


	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}


	@Override
    public String toString() {
        return "Manager [teamSize=" + teamSize + "," + getName() + "," + getEmpNo() + ","
                + getDepartment() + "]";
    }


	

	
	

	
	

}
