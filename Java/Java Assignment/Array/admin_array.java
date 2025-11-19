class Admin
{
	int ID;
	String Name;
	double Salary;
	double Allowances;
	
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

	void setAllowances(double a)
	{
		this.Allowances=a;
	}

	double setAllowances()
	{
		return this.Allowances;
	}

	void display()
	{
		System.out.println("Admin ID :"+this.ID);
		System.out.println("Admin Name :"+this.Name);
		System.out.println("Admin Salary :"+this.Salary);
		System.out.println("Admin Allowances :"+this.Allowances);

	}

	Admin()
	{
		System.out.println("Default Constructor");
		this.ID=113;
		this.Name="Arman";
		this.Salary=85000;
		this.Allowances=7836.95;
	}

	Admin(int i,String n,double s,double a)
	{
		System.out.println("Parameter Constructor");
		this.ID=i;
		this.Name=n;
		this.Salary=s;
		this.Allowances=a;
	}

}
//Admin class ends here
class AdminTest
{
	public static void main(String[] args)
	{
		Admin arr[] = new Admin[3];
		
		arr[0]=new Admin();
		arr[1]=new Admin(114,"Ronit",36000,4512);
		//arr[2]=new Admin(115,"ABC",8900,7845);

		for(int i=0;i<3;i++)
		{
				System.out.println(arr[i]);
				//arr[i].display();
		}
				
	}//main ends here
}//AdminTest ends here