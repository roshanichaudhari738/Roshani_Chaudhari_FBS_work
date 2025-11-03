class Employee
{
	int ID;
	String Name;
	double Salary;
	
	void setId(int x)
	{
		this.ID=x;
	}

	void setName(String n)
	{
		this.Name=n;
	}

	void setSalary(double s)
	{
		this.Salary=s;
	}

}
//Employee class ends here
class EmployeeTest
{
	public static void main(String[] args)
	{
		Employee e1;//Reference
		e1=new Employee();
		
		e1.setId(101);
		e1.setName("Roshani");
		e1.setSalary(50000);
		System.out.printf("Employee ID is : "+e1.ID+"\nName is : "+e1.Name+"\nSalary is : "+e1.Salary);
				
	}//main ends here
}//EmployeeTest ends here