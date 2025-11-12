package inheritance;
class Employee {
	int id;
	String name;
	double salary;
	
	Employee()
	{
		System.out.println("Employee Default Constructor");
		 id=101;
		 name="Not Assign";
		 salary=74125;
	}
	Employee(int id, String name, double salary) {
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
	 
	 void display()
		{
			System.out.println("Employee ID :"+this.id);
			System.out.println("Employee Name :"+this.name);
			System.out.println("Employee Salary :"+this.salary);
		}
	
	
}

class HR extends Employee
{
	
	double Allowances;
	
	HR()
	{
		super();
		System.out.println("HR Default Constructor");
		 
		 Allowances=45.36;
	}

	 HR(int id, String name, double salary, double allowances) {
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
	
	void display()
	{
		super.display();
//		System.out.println("HR ID :"+this.id);
//		System.out.println("HR Name :"+this.name);
//		System.out.println("HR Salary :"+this.salary);
		System.out.println("HR Allowances :"+this.Allowances);
	}
	
}

class Salesmanager extends Employee
{
	int id;
	String name;
	double salary;
	double incentive;
	int target;
	
	Salesmanager()
	{
		System.out.println("Salesmanager Default Constructor");
		this.id=145;
		this.name="not assign";
		this.salary=471258;
		this.incentive=14.36;
		this.target=50;
	}
	
	 public Salesmanager(int id, String name, double salary, double incentive, int target) {
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
	 
	 void display()
		{
			super.display();
			System.out.println("SalesManager Incentive :"+this.incentive);
			System.out.println("SalesManager Target :"+this.target);
		}
}

class Admin extends Employee
{
	
	double Allowances;
	
	Admin()
	{
		super();
		System.out.println("Admin Default Constructor");
//		this.id=113;
//		this.name="not assign";
//		this.salary=85000;
		this.Allowances=7836.95;
	}
	
	
	
	  Admin(int id, String name, double salary, double allowances) {
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
	
	 void display()
		{
			super.display();
			System.out.println("Admin Allowances :"+this.Allowances);

		}
	
}

class DemoInheritance
{
	public static void main(String[] args)
	{
		HR h1=new HR();
		h1.display();
		System.out.println("\n\n");
		
		HR h2=new HR(111,"Rahul",4500,63.36);
		h2.display();
		System.out.println("\n\n");
		
		Salesmanager s1=new Salesmanager();
		s1.display();
		System.out.println("\n\n");
		
		Salesmanager s2=new Salesmanager(112,"Rohit",4500,56.36,70);
		s2.display();
		System.out.println("\n\n");
		
		Admin a1=new Admin();
		a1.display();
		System.out.println("\n\n");
		
		Admin a2=new Admin(113,"Riya",5500,60.36);
		a2.display();
	}
}