package model;

public class Salesmanager extends Employee {

	int incentive;
	int target;
	
	public Salesmanager(int iD, String name, double salary, int incentive, int target) {
		super(iD, name, salary);
		this.incentive = incentive;
		this.target = target;
	}

	public int getIncentive() {
		return incentive;
	}

	public void setIncentive(int incentive) {
		this.incentive = incentive;
	}

	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		this.target = target;
	}
	
	public double calsalary()
	{
		return this.getSalary()+this.incentive;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"\nIncentive :"+this.incentive+"\n Target :"+this.target+"\n-------";
	}
	
}
