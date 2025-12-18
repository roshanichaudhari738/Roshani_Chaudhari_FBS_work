package customizeexception;

public class StudentMarks {
	int roll;
	String name;
	int marks;
	
	public StudentMarks(int roll, String name, int marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}
	
	void calculateMarks() throws InvalidMarksException,InvalidMarksException1
	{
		if(this.marks<=0) 
		{
			throw new InvalidMarksException();
		}
		else if(this.marks>100)
		{
			throw new InvalidMarksException1();
		}
		else if(this.marks>=35 && this.marks<=49)
		{
			System.out.println("Pass Class");
		}
		else if(this.marks>=50 && this.marks<=59)
		{
			System.out.println("Second Class");
		}
		else if(this.marks>=60 && this.marks<=74)
		{
			System.out.println("First Class");
		}
		else if(this.marks>=75)
		{
			System.out.println("Distinction");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}

}
