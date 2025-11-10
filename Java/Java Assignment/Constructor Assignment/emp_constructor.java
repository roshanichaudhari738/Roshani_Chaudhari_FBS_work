class Employee
{
	int ID;
	String Name;
	double Salary;
	
	void setId(int x)
	{
		this.ID=x;
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

	void display()
	{
		System.out.println("Employee ID :"+this.ID);
		System.out.println("Employee Name :"+this.Name);
		System.out.println("Employee Salary :"+this.Salary);
	}
	
	Employee()
	{
		System.out.println("Default Constructor");
		this.ID=301;
		this.Name="ABCD";
		this.Salary=4500;
	}

}
//Employee class ends here
class EmployeeTest
{
	public static void main(String[] args)
	{
		Employee e1,e2;//Reference
		e1=new Employee();
		e2=new Employee();
		//e3=new Employee();
		
		//e3.Employee();

		//e1.setId(101);
		//e1.setName("Roshani");
		//e1.setSalary(50000);
		e1.display();

		
		//e2.setId(102);
		//e2.setName("Rocky");
		//e2.setSalary(55000);
		e2.display();

				
	}//main ends here
}//EmployeeTest ends here