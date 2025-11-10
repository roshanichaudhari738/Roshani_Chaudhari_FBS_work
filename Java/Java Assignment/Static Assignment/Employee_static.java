class Employee
{
	String Name;
	double basicSalary;
	static double companyBonusRate;

	static
	{
		companyBonusRate=45.3;
	}

	void setName(String x)
	{
		this.Name=x;
	}

	void setBasicSalary(double y)
	{
		this.basicSalary=y;
	}
	
	static void setCompanyBonusRate(double z) //static function
	{
		companyBonusRate=z;
	}

	String getName()
	{
		return this.Name;
	}

	double getBasicSalary()
	{
		return this.basicSalary;
	}
	
	double getCompanyBonusRate()
	{
		return this.companyBonusRate;
	}
	
	double calculateTotalSalary()
	{
		return this.basicSalary + (this.basicSalary * this.companyBonusRate / 100);
	}

	Employee()
	{
		this.Name="Not Assigned";
		this.basicSalary=0.0;
		//this.companyBonusRate=0.0;
	}

	Employee(String name,double b)
	{
		System.out.println("Default constructor called");
		this.Name=name;
		this.basicSalary=b;
		//this.companyBonusRate=cbr;
	}

	void display()
	{
		System.out.println("Parameter constructor called");
		System.out.println("Employee Name is "+this.Name);
		System.out.println("Employee BasicSalary is "+this.basicSalary);
		System.out.println("Employee companyBonusRate is "+this.companyBonusRate);
		System.out.println("Employee Total Salary is "+calculateTotalSalary());

	}
	

}
class EmployeeTest
{
	public static void main(String[] a)
	{
		Employee e1=new Employee();
		Employee e2=new Employee("Roshani",45000);
		e1.setName("Xyz");
		e1.setBasicSalary(7800);
		Employee.setCompanyBonusRate(84);//static function call
		e1.display();
		e2.display();
		
	}
}