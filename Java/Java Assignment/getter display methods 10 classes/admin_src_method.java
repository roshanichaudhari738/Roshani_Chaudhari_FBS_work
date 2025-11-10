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

}
//Admin class ends here
class AdminTest
{
	public static void main(String[] args)
	{
		Admin a1,a2;//Reference
		a1=new Admin();
		a2=new Admin();
		
		a1.setId(111);
		a1.setName("Aman");
		a1.setSalary(100000);
		a1.setAllowances(70000);
		a1.display();
		
		a2.setId(112);
		a2.setName("Navya");
		a2.setSalary(4500);
		a2.setAllowances(7356);
		a2.display();
				
	}//main ends here
}//AdminTest ends here