package model;

public abstract class Employee {
	
	int ID;
	String name;
	double salary;
	
	public Employee(int iD, String name, double salary) {
		super();
		ID = iD;
		this.name = name;
		this.salary = salary;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
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
	
	public abstract double calsalary();
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee ID :"+ID+
				"\nEmployee Name :"+name+
				"\nEmployee Salary :"+salary;
	}

}
