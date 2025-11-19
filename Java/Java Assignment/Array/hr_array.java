class HR
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
		System.out.println("HR ID :"+this.ID);
		System.out.println("HR Name :"+this.Name);
		System.out.println("HR Salary :"+this.Salary);
		System.out.println("HR Allowances :"+this.Allowances);
	}

	HR()
	{
		System.out.println("Default Constructor");
		this.ID=45;
		this.Name="Rohit";
		this.Salary=4785;
		this.Allowances=45.36;
	}

	HR(int i,String n,double s,double a)
	{
		System.out.println("Parameter Constructor");
		this.ID=i;
		this.Name=n;
		this.Salary=s;
		this.Allowances=a;
	}

}
//HR class ends here
class HRTest
{
	public static void main(String[] args)
	{
		
		HR arr[] = new HR[3];
		
		arr[0]=new HR();
		arr[1]=new HR(3,"Ronit",36000,4512);
		arr[2]=new HR(4,"ABC",8900,7845);

		for(int i=0;i<3;i++)
		{
				//System.out.println(arr[i]);
				arr[i].display();
		}
				
	}//main ends here
}//HRTest ends here