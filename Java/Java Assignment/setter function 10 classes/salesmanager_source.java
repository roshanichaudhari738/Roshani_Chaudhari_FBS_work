class SalesManager
{
	int ID;
	String Name;
	double Salary;
	double incentive;
	int target;
	
	void setId(int i)
	{
		this.ID=i;
	}

	void setName(String n)
	{
		this.Name=n;
	}

	void setSalary(double s)
	{
		this.Salary=s;
	}

	void setIncentive(double x)
	{
		this.incentive=x;
	}

	void setTarget(int t)
	{
		this.target=t;
	}

}
//Salesmanager class ends here
class SalesManagerTest
{
	public static void main(String[] args)
	{
		SalesManager s1;//Reference
		s1=new SalesManager();
		
		s1.setId(201);
		s1.setName("Priya");
		s1.setSalary(200000);
		s1.setIncentive(600);
		s1.setTarget(50);
		System.out.printf("Salesmanager ID is : "+s1.ID+"\nName is : "+s1.Name+"\nSalary is : "+s1.Salary+"\nIncentive is : "+s1.incentive+"\nTarget is :"+s1.target);
				
	}//main ends here
}//SalesManagerTest ends here