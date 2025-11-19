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

	Employee(int i,String n,double d)
	{
		System.out.println("Parameter Constructor");
		this.ID=i;
		this.Name=n;
		this.Salary=d;
	}

}
//Employee class ends here
class EmployeeTest
{
	public static void main(String[] args)
	{
		Employee arr[] = new Employee[3];
		
		arr[0]=new Employee();
		arr[1]=new Employee(3,"Ronit",36000);
		arr[2]=new Employee(4,"ABC",8900);

		for(int i=0;i<3;i++)
		{
				//System.out.println(arr[i]);
				arr[i].display();
		}

				
	}//main ends here
}//EmployeeTest ends here