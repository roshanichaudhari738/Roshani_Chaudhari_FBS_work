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

	int getId()
	{
		return this.ID;
	}


	void setName(String n)
	{
		this.Name=n;
	}

	String getName()
	{
		return this.Name;
	}

	void setSalary(double s)
	{
		this.Salary=s;
	}

	double getSalary()
	{
		return this.Salary;
	}

	void setIncentive(double x)
	{
		this.incentive=x;
	}

	double getIncentive()
	{
		return this.incentive;
	}

	void setTarget(int t)
	{
		this.target=t;
	}

	int getTarget()
	{
		return this.target;
	}

	void display()
	{
		System.out.println("SalesManager ID :"+this.ID);
		System.out.println("SalesManager Name :"+this.Name);
		System.out.println("SalesManager Salary :"+this.Salary);
		System.out.println("SalesManager Incentive :"+this.incentive);
		System.out.println("SalesManager Target :"+this.target);
	}

	SalesManager()
	{
		System.out.println("Default Constructor");
		this.ID=145;
		this.Name="Riya";
		this.Salary=471258;
		this.incentive=14.36;
		this.target=50;
	}	

}
//Salesmanager class ends here
class SalesManagerTest
{
	public static void main(String[] args)
	{
		SalesManager s1,s2;//Reference
		s1=new SalesManager();
		s2=new SalesManager();
		
		
		s1.display();

		System.out.println();

		
		s2.display();
				
	}//main ends here
}//SalesManagerTest ends here