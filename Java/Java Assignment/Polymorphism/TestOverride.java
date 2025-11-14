package inheritance;

class Employee2 {
	int id;
	String name;
	double salary;
	
	Employee2()
	{
		System.out.println("Employee Default Constructor");
		 id=101;
		 name="Not Assign";
		 salary=74125;
	}
	Employee2(int id, String name, double salary) {
		 System.out.println("Employee Parameter Constructor");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	 int getId() {
		return id;
	}
	 void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	 void setName(String name) {
		this.name = name;
	}
	 double getSalary() {
		return salary;
	}
	 void setSalary(double salary) {
		this.salary = salary;
	}
	 
	 double calsal()
	 {
		 return salary;
	 }
	 
	 void display()
		{
			System.out.println("Employee ID :"+this.id);
			System.out.println("Employee Name :"+this.name);
			System.out.println("Employee Salary :"+this.salary);
			System.out.println("Employee Total Salary :"+calsal());
		}
	
	
}

class HR2 extends Employee2
{
	
	double Allowances;
	
	HR2()
	{
		super();
		System.out.println("HR Default Constructor");
		 
		 Allowances=45.36;
	}

	 HR2(int id, String name, double salary, double allowances) {
		 super(id,name,salary);
		 System.out.println("HR Para Constructor");
		Allowances = allowances;
	}


	 double getAllowances() {
		return Allowances;
	}

	 void setAllowances(double allowances) {
		Allowances = allowances;
	}
	
	 double calsal()
	 {
		 return salary + Allowances;
	 }
	
	void display()
	{
		super.display();
//		System.out.println("HR ID :"+this.id);
//		System.out.println("HR Name :"+this.name);
//		System.out.println("HR Salary :"+this.salary);
		System.out.println("HR Allowances :"+this.Allowances);
		System.out.println("HR Salary :"+calsal());
	}
	
}

class Salesmanager2 extends Employee2
{
	int id;
	String name;
	double salary;
	double incentive;
	int target;
	
	Salesmanager2()
	{
		System.out.println("Salesmanager Default Constructor");
		this.id=145;
		this.name="not assign";
		this.salary=471258;
		this.incentive=14.36;
		this.target=50;
	}
	
	 public Salesmanager2(int id, String name, double salary, double incentive, int target) {
		super(id,name,salary);
		System.out.println("Salesmanager Para Constructor");
//		this.id = id;
//		this.name = name;
//		this.salary = salary;
		this.incentive = incentive;
		this.target = target;
	}

	
	 double getIncentive() {
		return incentive;
	}
	 void setIncentive(double incentive) {
		this.incentive = incentive;
	}
	 int getTarget() {
		return target;
	}
	 void setTarget(int target) {
		this.target = target;
	}
	 
	
	 double calsal()
	 {
		 return salary + incentive;
	 }
	 
	 
	 void display()
		{
			super.display();
			System.out.println("SalesManager Incentive :"+this.incentive);
			System.out.println("SalesManager Target :"+this.target);
			System.out.println("SalesManager Salary :"+calsal());
		}
}

class Admin2 extends Employee2
{
	
	double Allowances;
	
	Admin2()
	{
		super();
		System.out.println("Admin Default Constructor");
//		this.id=113;
//		this.name="not assign";
//		this.salary=85000;
		this.Allowances=7836.95;
	}
	
	
	
	  Admin2(int id, String name, double salary, double allowances) {
		  super(id,name,salary);
		  System.out.println("Admin Para Constructor");
		Allowances = allowances;
	}

	 double getAllowances() {
		return Allowances;
	}
	 void setAllowances(double allowances) {
		Allowances = allowances;
	}
	 
	 
	 double calsal()
	 {
		 return salary + Allowances;
	 }
	
	
	 void display()
		{
			super.display();
			System.out.println("Admin Allowances :"+this.Allowances);
			System.out.println("Admin Allowances Salary :"+calsal());

		}
	
}

public class TestOverride {

	public static void main(String[] args) {
//		HR h1=new HR();
//		h1.display();
//		System.out.println("\n\n");
		
		HR2 h2=new HR2(111,"Rahul",4500,63.36);
		h2.display();
		System.out.println("\n\n");
		
//		Salesmanager s1=new Salesmanager();
//		s1.display();
//		System.out.println("\n\n");
		
		Salesmanager2 s2=new Salesmanager2(112,"Rohit",4500,56.36,70);
		s2.display();
		System.out.println("\n\n");
		
//		Admin a1=new Admin();
//		a1.display();
//		System.out.println("\n\n");
		
		Admin2 a2=new Admin2(113,"Riya",5500,60.36);
		a2.display();

	}

}
