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

	void setName(String n)
	{
		this.Name=n;
	}

	void setSalary(double s)
	{
		this.Salary=s;
	}

	void setAllowances(double a)
	{
		this.Allowances=a;
	}

}
//Admin class ends here
class AdminTest
{
	public static void main(String[] args)
	{
		Admin a1;//Reference
		a1=new Admin();
		
		a1.setId(111);
		a1.setName("Aman");
		a1.setSalary(100000);
		a1.setAllowances(70000);
		System.out.printf("Admin ID is : "+a1.ID+"\nName is : "+a1.Name+"\nSalary is : "+a1.Salary+"\nAllowances is : "+a1.Allowances);
				
	}//main ends here
}//AdminTest ends here