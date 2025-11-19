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

	SalesManager(int i,String n,double s,double c,int t)
	{
		System.out.println("Parameter Constructor");
		this.ID=i;
		this.Name=n;
		this.Salary=s;
		this.incentive=c;
		this.target=t;
	}	

}
//Salesmanager class ends here
class SalesManagerTest
{
	public static void main(String[] args)
	{
		SalesManager arr[] = new SalesManager[3];
		
		arr[0]=new SalesManager();
		arr[1]=new SalesManager(3,"Ronit",36000,4512,45);
		arr[2]=new SalesManager(4,"ABC",8900,7845,20);

		for(int i=0;i<arr.length;i++)
		{
				//System.out.println(arr[i]);
				arr[i].display();
		}
				
	}//main ends here
}//SalesManagerTest ends here