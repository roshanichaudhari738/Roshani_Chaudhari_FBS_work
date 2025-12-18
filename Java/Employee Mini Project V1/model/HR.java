package model;

public class HR extends Employee {
	double commission;

	public HR(int iD, String name, double salary, double commission) {
		super(iD, name, salary);
		this.commission = commission;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}
	
	public double calsalary()
	{
		return this.getSalary()+this.commission;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nCommission :"+commission+"\n-------";
	}
}
