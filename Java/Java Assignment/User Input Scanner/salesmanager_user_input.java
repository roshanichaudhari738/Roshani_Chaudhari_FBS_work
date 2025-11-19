import java.util.Scanner;
class SalesManager
{
	int ID;
	String Name;
	double Salary;
	double incentive;
	int target;
	
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

	void setIncentive(double x)
	{
		this.incentive=x;
	}

	double getIncentive()
	{
		return this.incentive;
	}

	void setTarget(int t)
	{
		this.target=t;
	}

	int getTarget()
	{
		return this.target;
	}

	void display()
	{
		System.out.println("SalesManager ID :"+this.ID);
		System.out.println("SalesManager Name :"+this.Name);
		System.out.println("SalesManager Salary :"+this.Salary);
		System.out.println("SalesManager Incentive :"+this.incentive);
		System.out.println("SalesManager Target :"+this.target);
	}

	SalesManager()
	{
		System.out.println("Default Constructor");
		this.ID=145;
		this.Name="Riya";
		this.Salary=471258;
		this.incentive=14.36;
		this.target=50;
	}

	SalesManager(int i,String n,double s,double c,int t)
	{
		System.out.println("Parameter Constructor");
		this.ID=i;
		this.Name=n;
		this.Salary=s;
		this.incentive=c;
		this.target=t;
	}	

}
//Salesmanager class ends here
class SalesManagerTest
{
	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the SalesManager ID:");
		int a=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the SalesManager Name:");
		String nm=sc.nextLine();
		System.out.println("Enter the SalesManager Salary:");
		double d1=sc.nextDouble();
		System.out.println("Enter the SalesManager Incentive:");
		double d2=sc.nextDouble();
		System.out.println("Enter the SalesManager Target:");
		int d3=sc.nextInt();

		SalesManager s1,s2;//Reference
		s1=new SalesManager(a,nm,d1,d2,d3);
		s2=new SalesManager(a,nm,d1,d2,d3);
		
		//s1.setId(201);
		//s1.setName("Supriya");
		//s1.setSalary(200000);
		//s1.setIncentive(600);
		//s1.setTarget(50);
		s1.display();

		System.out.println();

		//s2.setId(202);
		//s2.setName("Pranali");
		//s2.setSalary(45000);
		//s2.setIncentive(80);
		//s2.setTarget(100);
		s2.display();
				
	}//main ends here
}//SalesManagerTest ends here