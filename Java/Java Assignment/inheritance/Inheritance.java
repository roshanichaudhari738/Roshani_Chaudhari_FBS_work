package inheritance;

class Student
{
	int FBid;
	String Name;
	int Distance;
	static int Count=0;
	
	 static int getCount() {
		return Count;
	}
	 static void setCount(int count) {
		Count = count;
	}
	 int getFBid() {
		return FBid;
	}
	 void setFBid(int fBid) {
		FBid = fBid;
	}
	 String getName() {
		return Name;
	}
	 void setName(String name) {
		Name = name;
	}
	 int getDistance() {
		return Distance;
	}
	 void setDistance(int distance) {
		Distance = distance;
	}
	
	Student()
	{
		System.out.println("Student Default Constructor Called");
		FBid=10;
		Name="not assign";
		Distance=100;
		Count++;
	}
	 Student(int fBid, String name, int distance) {
		System.out.println("Student Parameter Constructor Called");
		FBid = fBid;
		Name = name;
		Distance = distance;
		Count++;
	}
	 
	 void display()
	 {
		 System.out.println("Firstbit Id is "+this.FBid);
		 System.out.println("Name is "+this.Name);
		 System.out.println("Distance is "+this.Distance);
	 }
	
}//Student Class end here

class PlacedStudent extends Student //step-1 "is-a"
{
	//step 2 remove state and behavior which is available in super class
	
	String CName;
	String Designation;
	
	 
	 String getCName() {
		return CName;
	}
	 void setCName(String cName) {
		CName = cName;
	}
	 String getDesignation() {
		return Designation;
	}
	 void setDesignation(String designation) {
		Designation = designation;
	}
	 
	 PlacedStudent()
	 {
		super();//Student constructor called step 3 a
		 System.out.println("PlacedStudent Default Constructor Called");
		 CName = "BCCI";
		 Designation = "Coach";
	 }
	 
	  PlacedStudent(int fBid, String name, int distance, String cName, String designation) {
		  super(fBid,name,distance);//step 3 b //super class constructor are called 
		  //pass only varaiable or value not datatype becoz is calling fun
		  System.out.println("PlacedStudent Parameter Constructor Called");
			CName = cName;
			Designation = designation;
			
		}
	  
	  void display()
		 {
		  	super.display();//step 4
			 System.out.println("Company Name is "+this.CName);
			 System.out.println("Designation is "+this.Designation);
		 }
	
}//PlacedStudent Class end here

public class Inheritance {

	public static void main(String[] args) {
//		Student s1=new Student();
//		System.out.println("Student total count :" + Student.getCount());
//		
//		Student s2=new Student(1,"Rohit",300);
//		System.out.println("Student total count :" + Student.getCount());
		
		PlacedStudent ps1 = new PlacedStudent();
		System.out.println("Student total count :"+Student.getCount());
		ps1.display();
		
		System.out.println("\n\n");
		PlacedStudent ps2 = new PlacedStudent(11,"Rahul",600,"TCS","Developer");
		System.out.println("Student total count :"+Student.getCount());
		ps2.display();
		System.out.println(ps2.getName());
		

//		s1.display();
//		s2.display();
		
		
		

	}

}
