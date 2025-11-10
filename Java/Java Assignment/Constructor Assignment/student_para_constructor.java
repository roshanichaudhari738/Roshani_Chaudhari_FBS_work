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
		this.Rollno=36;
		this.Name="Pranit";
		this.Marks=78;
	}
	
	Student(int i,String n,int m)
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
		Student arr[] = new Student[3];
		
		arr[0]=new Student();
		arr[1]=new Student(3,"Ronit",95.3);
		arr[2]=new Student(4,"Piu",75);

		for(int i=0;i<3;i++)
		{
				//System.out.println(arr[i]);
				arr[i].display();
		}
		
	}//main ends here
}//StudentTest ends here