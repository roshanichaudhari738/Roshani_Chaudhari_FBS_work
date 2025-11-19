import java.util.Scanner;
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
		this.ID=0;
		this.Name="Not";
		this.Salary=0;
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

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee ID:");
		int no=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Employee Name:");
		String name=sc.nextLine();
		System.out.println("Enter the Employee Salary:");
		double d1=sc.nextDouble();

		System.out.println("Enter the Employee ID:");
		int no1=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Employee Name:");
		String name1=sc.nextLine();
		System.out.println("Enter the Employee Salary:");
		double d11=sc.nextDouble();

		Employee e1,e2;//Reference
		e1=new Employee(no,name,d1);
		e2=new Employee(no1,name1,d11);
		//e3=new Employee();,
		
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