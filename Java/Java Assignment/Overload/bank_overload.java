class Student
{
	int rollno;
	String name;
	double percentage;


	 Student(int i,String n,double p)
	{
		System.out.println("Parameter Constructor called");
		this.rollno=i;
		this.name=n;
		this.percentage=p;
	}
}//Student class end here
class Employee
{
	int id;
	String name;
	double annualSalary;

	 Employee(int i,String n,double a)
	{
		System.out.println("Parameter Constructor called");
		this.id=i;
		this.name=n;
		this.annualSalary=a;
	}
}//Employee class end here

class Bank
{
	void approveLoan(Student s)
	{
		System.out.println("Student percentage:"+s.percentage);

		if(s.percentage>80)
		{
			System.out.println("Approve Loan 2 Lakh");
		}
		else if(s.percentage>60 && s.percentage<80)
		{
			System.out.println("Approve Loan 1 Lakh");
		}
		else if(s.percentage>40 && s.percentage<60)
		{
			System.out.println("Approve Loan 50k");
		}
		else if(s.percentage>40)
		{
			System.out.println("No Approve Loan");
		}
	}

	void approveLoan(Employee e)
	{
		System.out.println("Employee annualSalary is:"+e.annualSalary);

		if(e.annualSalary>12)
		{
			System.out.println("Approve Loan 7 Lakh");
		}
		else if(e.annualSalary>10 && e.annualSalary<12)
		{
			System.out.println("Approve Loan 6 Lakh");
		}
		else if(e.annualSalary>6 && e.annualSalary<10)
		{
			System.out.println("Approve Loan 5 Lakh");
		}
		else if(e.annualSalary>4 && e.annualSalary<6)
		{
			System.out.println("Approve Loan 4 Lakh");
		}
		else if(e.annualSalary>4)
		{
			System.out.println("No Approve Loan");
		}
	}
}

class Test
{
	public static void main(String[] a)
	{
		Student s1=new Student(10,"Roshani",80.5);

		Employee e1=new Employee(111,"Riya",11);

		Bank b=new Bank();
		b.approveLoan(s1);
		b.approveLoan(e1);
	}
}