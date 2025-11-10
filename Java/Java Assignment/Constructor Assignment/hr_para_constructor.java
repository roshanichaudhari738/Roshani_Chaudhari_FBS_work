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
		HR h1,h2;//Reference
		h1=new HR(101,"Manik",8500,85.36);
		h2=new HR(102,"Nandini",65000,45.23);
		
		//h1.setId(201);
		//h1.setName("Priya");
		//h1.setSalary(200000);
		//h1.setAllowances(65000);
		h1.display();
		
		System.out.println();
		
		//h2.setId(202);
		//h2.setName("Priyank");
		//h2.setSalary(45000);
		//h2.setAllowances(60000);
		h2.display();
				
	}//main ends here
}//HRTest ends here