import java.util.Scanner;
class Student
{
	int Rollno;
	String Name;
	double Marks;
		
	void setRollNo(int r)
	{
		this.Rollno=r;
	}

	int getRollNo()
	{
		return this.Rollno;
	}
	
	void setName(String n)
	{
		this.Name=n;
	}

	String getName()
	{
		return this.Name;
	}

	void setMarks(double m)
	{
		this.Marks=m;
	}

	double getMarks()
	{
		return this.Marks;
	}

	void display()
	{
		System.out.println("Student Rollno :"+this.Rollno);
		System.out.println("Student Name :"+this.Name);
		System.out.println("Student Marks :"+this.Marks);
	}

	Student()
	{
		this.Rollno=0;
		this.Name="Not Assign";
		this.Marks=0;
	}
	
	Student(int i,String n,double m)
	{
		System.out.println("Parameter Constructor");
		this.Rollno=i;
		this.Name=n;
		this.Marks=m;
	}


}
//Student class ends here
class StudentTest
{
	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Student Roll No:");
		int a=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Student Name:");
		String nm=sc.nextLine();
		System.out.println("Enter the Student Marks:");
		double d1=sc.nextDouble();

		Student s1,s2;//Reference
		s1=new Student(a,nm,d1);
		s2=new Student(a,nm,d1);
		
		//s1.setRollNo(1);
		//s1.setName("Supriya");
		//s1.setMarks(78.36);
		s1.display();
		
		System.out.println();
		
		//s2.setRollNo(2);
		//s2.setName("Sushant");
		//s2.setMarks(95.36);
		s2.display();
		
	}//main ends here
}//StudentTest ends here