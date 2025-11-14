package Day12;

class HospitalStaffmember
{
	int ID;
	String StaffName;
	int Age;
	
	 HospitalStaffmember(int iD, String staffName, int age) {
		ID = iD;
		StaffName = staffName;
		Age = age;
	}
	 int getID() {
		return ID;
	}
	 void setID(int iD) {
		ID = iD;
	}
	 String getStaffName() {
		return StaffName;
	}
	 void setStaffName(String staffName) {
		StaffName = staffName;
	}
	 int getAge() {
		return Age;
	}
	 void setAge(int age) {
		Age = age;
	}
	 
	 void perfromDuty()
	 {
		 System.out.println("Staff is performing their duty.");
	 }
	 
	 void display()
	 {
		 System.out.println("HospitalStaffmember ID "+this.ID);
		 System.out.println("HospitalStaffmember Name "+this.StaffName);
		 System.out.println("HospitalStaffmember Age "+this.Age);
	 }
	
}

class Doctor extends HospitalStaffmember
{
	int experianceofwork;
	double visitingfees;
	String specialization;
	
	 Doctor(int iD, String staffName, int age, int experianceofwork, double visitingfees,
			String specialization) {
		super(iD, staffName, age);
		this.experianceofwork = experianceofwork;
		this.visitingfees = visitingfees;
		this.specialization = specialization;
	}
	 int getExperianceofwork() {
		return experianceofwork;
	}
	 void setExperianceofwork(int experianceofwork) {
		this.experianceofwork = experianceofwork;
	}
	 double getVisitingfees() {
		return visitingfees;
	}
	 void setVisitingfees(double visitingfees) {
		this.visitingfees = visitingfees;
	}
	 String getSpecialization() {
		return specialization;
	}
	 void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	 
	 void perfromDuty()
	 {
		 System.out.println("Doctor is diagnosing patients and writing prescriptions.");
	 }
	 
	 void display()
	 {
		 super.display();
		 System.out.println("Doctor experiance of work "+this.experianceofwork);
		 System.out.println("Doctor visiting fees "+this.visitingfees);
		 System.out.println("Doctor specialization "+this.specialization);
	 }
}

class Nurse extends HospitalStaffmember
{
	String wardAssigned;

	 Nurse(int iD, String staffName, int age, String wardAssigned) {
		super(iD, staffName, age);
		this.wardAssigned = wardAssigned;
	}

	 String getWardAssigned() {
		return wardAssigned;
	}

	 void setWardAssigned(String wardAssigned) {
		this.wardAssigned = wardAssigned;
	}
	 
	 void perfromDuty()
	 {
		 System.out.println("Nurse is checking vitals and giving medication.");
	 }
	 
	 void display()
	 {
		 super.display();
		 System.out.println("Nurse wardAssigned "+this.wardAssigned);
	 }
}

class HospitalStaff {

	public static void main(String[] args) {
		HospitalStaffmember hs1;
		hs1=new HospitalStaffmember(100,"Ramesh",23);
		hs1.display();
		hs1.perfromDuty();
		System.out.println();
		
		hs1=new Doctor(101,"Gargi",24,6,500,"Surgen");
		hs1.display();
		hs1.perfromDuty();
		System.out.println();
		
		hs1=new Nurse(102,"Jiya",27,"General");
		hs1.display();
		hs1.perfromDuty();
		System.out.println();
		
	}

}
