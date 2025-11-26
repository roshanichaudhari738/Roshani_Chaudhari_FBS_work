package Day12;

abstract class Employee2 {
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
	 
	 abstract double calsal();
	 
	 public String toString()
	 {
		 return "Employee ID :"+this.id+"\n"+"Employee Name :"+this.name+"\n"+"Employee Salary :"+this.salary+"\n";
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
	
	public String toString()
	{
		return super.toString()+"HR Allowances :"+this.Allowances+"\n";
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
	 
	 public String toString()
		{
			return super.toString()+"SalesManager Incentive :"+this.incentive+"\n"+"SalesManager Target :"+this.target+"\n";
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

	 
	 public String toString()
		{
			return super.toString()+"Admin Allowances :"+this.Allowances+"\n";
		}
	
}

public class TestOverride {

	public static void main(String[] args) {
//		HR h1=new HR();
//		h1.display();
//		System.out.println("\n\n");
		
		Employee2 e;
		e=new HR2(111,"Rahul",4500,63.36);
		System.out.println(e.toString());
		System.out.println("Allowances:"+e.calsal());
		System.out.println("\n");
		
//		Salesmanager s1=new Salesmanager();
//		s1.display();
//		System.out.println("\n\n");
		
		e=new Salesmanager2(112,"Rohit",4500,56.36,70);
		System.out.println(e.toString());
		System.out.println("Total Salary:"+e.calsal());
		System.out.println("\n");
		
//		Admin a1=new Admin();
//		a1.display();
//		System.out.println("\n\n");
		
		e=new Admin2(113,"Riya",5500,60.36);
		System.out.println(e.toString());
		System.out.println("Allowances :"+e.calsal());

	}

}
