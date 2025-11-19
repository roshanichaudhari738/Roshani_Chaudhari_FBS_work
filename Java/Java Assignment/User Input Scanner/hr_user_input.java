import java.util.Scanner;
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
		this.ID=0;
		this.Name="not assign";
		this.Salary=0;
		this.Allowances=0;
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

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the HR ID:");
		int no=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the HR Name:");
		String name=sc.nextLine();
		System.out.println("Enter the HR Salary:");
		double d1=sc.nextDouble();
		System.out.println("Enter the HR Allowances:");
		double d2=sc.nextDouble();
	
		System.out.println("Enter the HR ID:");
		int no1=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the HR Name:");
		String name1=sc.nextLine();
		System.out.println("Enter the HR Salary:");
		double d11=sc.nextDouble();
		System.out.println("Enter the HR Allowances:");
		double d21=sc.nextDouble();

		

		HR h1,h2;//Reference
		h1=new HR(no,name,d1,d2);
		h2=new HR(no1,name1,d11,d21);
		
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