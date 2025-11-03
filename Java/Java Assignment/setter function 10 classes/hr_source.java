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
//HR class ends here
class HRTest
{
	public static void main(String[] args)
	{
		HR h1;//Reference
		h1=new HR();
		
		h1.setId(201);
		h1.setName("Priya");
		h1.setSalary(200000);
		h1.setAllowances(65000);
		System.out.printf("HR ID is : "+h1.ID+"\nName is : "+h1.Name+"\nSalary is : "+h1.Salary+"\nAllowances is : "+h1.Allowances);
				
	}//main ends here
}//HRTest ends here