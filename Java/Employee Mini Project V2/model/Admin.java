package model;

public class Admin extends Employee {
	double allowance;

	public Admin(int iD, String name, double salary, double allowance) {
		super(iD, name, salary);
		this.allowance = allowance;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	public double calsalary()
	{
		return this.getSalary()+this.allowance;
	}

	@Override
	public String toString() {
		
		return super.toString()+"\nAllowance :" + allowance+"\n-------\n";
	}
	
}
