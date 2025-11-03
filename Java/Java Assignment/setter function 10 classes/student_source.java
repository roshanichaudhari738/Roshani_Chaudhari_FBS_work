class Student
{
	int Rollno;
	String Name;
	double Marks;
		
	void setRollNo(int r)
	{
		this.Rollno=r;
	}

	void setName(String n)
	{
		this.Name=n;
	}

	void setMarks(double m)
	{
		this.Marks=m;
	}


}
//Student class ends here
class StudentTest
{
	public static void main(String[] args)
	{
		Student s1;//Reference
		s1=new Student();
		
		s1.setRollNo(1);
		s1.setName("Supriya");
		s1.setMarks(78.36);
		System.out.printf("Student Rollno is : "+s1.Rollno+"\nName is : "+s1.Name+"\nMark is : "+s1.Marks);
				
	}//main ends here
}//StudentTest ends here