package com.ash.demos;

public class Employee {
	int eId;
	String name;
	double salary;
	
	
	public Employee(int eId, String name, double salary) {
		super();
		this.eId = eId;
		this.name = name;
		this.salary = salary;
	}
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id "+eId+"\n"+
				"Name "+name+"\n"+
				"Salary "+salary+
				"\n";
	}

}
