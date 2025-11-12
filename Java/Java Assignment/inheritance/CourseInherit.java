package inheritance;

class Course
{
	int CourseID;
	String Name;
	int Duration;
	
	Course() {
		System.out.println("Course Default constructor Called");
		CourseID = 0;
		Name = "Not Assign";
		Duration = 0;
	}
	
	 Course(int courseID, String name, int duration) {
		System.out.println("Course Parameter constructor Called");
		CourseID = courseID;
		Name = name;
		Duration = duration;
	}
	 
	int getCourseID() {
		return CourseID;
	}
	 void setCourseID(int courseID) {
		CourseID = courseID;
	}
	 String getName() {
		return Name;
	}
	 void setName(String name) {
		Name = name;
	}
	 int getDuration() {
		return Duration;
	}
	 void setDuration(int duration) {
		Duration = duration;
	}
	 
	 void display()
	 {
		 System.out.println("Course ID is "+this.CourseID);
		 System.out.println("Course Name is "+this.Name);
		 System.out.println("Course Duration is "+this.Duration);
	 }
}

class OnlineCourse extends Course
{
	String Platform;
	String Instructor;
	
	 OnlineCourse() {
		super();
		System.out.println("OnlineCourse Default constructor Called");
		Platform ="Not Assign";
		Instructor ="Not Assign";
	}
	
	 OnlineCourse(int courseID, String name, int duration,String platform, String instructor) {
		super( courseID, name, duration);
		System.out.println("OnlineCourse Para constructor Called");
		Platform = platform;
		Instructor = instructor;
	}
	
	 String getPlatform() {
		return Platform;
	}
	 void setPlatform(String platform) {
		Platform = platform;
	}
	 String getInstructor() {
		return Instructor;
	}
	 void setInstructor(String instructor) {
		Instructor = instructor;
	}
	 
	 void display()
	 {
		 super.display();
		 System.out.println("OnlineCourse Platform is "+this.Platform);
		 System.out.println("OnlineCourse Instructor is "+this.Instructor);
	 }
}

class OfflineCourse extends Course
{
	int ClassRommNo;
	
	 OfflineCourse() {
			super();
			System.out.println("OfflineCourse Default constructor Called");
			ClassRommNo = 0;
		}

	 OfflineCourse(int courseID, String name, int duration,int classRommNo) {
		super(courseID, name, duration);
		System.out.println("OfflineCourse Para constructor Called");
		ClassRommNo = classRommNo;
	}

	 int getClassRommNo() {
		return ClassRommNo;
	}

	 void setClassRommNo(int classRommNo) {
		ClassRommNo = classRommNo;
	}
	 
	 void display()
	 {
		 super.display();
		 System.out.println("OfflineCourse Class Romm No is "+this.ClassRommNo);
	 }
}

public class CourseInherit {

	public static void main(String[] args) {
		OnlineCourse oc1=new OnlineCourse();
		oc1.display();
		System.out.println("\n\n");
		
		OnlineCourse oc2=new OnlineCourse(147,"Java",6,"Google Meet","Vinayk Sir");
		oc2.display();
		System.out.println("\n\n");
		
		OfflineCourse ofc1=new OfflineCourse();
		ofc1.display();
		System.out.println("\n\n");
		
		OfflineCourse ofc2=new OfflineCourse(147,"Python",6,1023);
		ofc2.display();
		System.out.println("\n\n");

	}

}
