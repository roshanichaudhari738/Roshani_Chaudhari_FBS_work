package Day12;

abstract class HospitalStaffmember
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
	 
	 abstract void perfromDuty();
	 
	 public String toString()
	 {
		 return "HospitalStaffmember ID "+this.ID+"\n"+"HospitalStaffmember Name "+this.StaffName+"\n"+"HospitalStaffmember Age "+this.Age;
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
	 
	 public String toString()
	 {
		 return super.toString()+"Doctor experiance of work "+this.experianceofwork+"\n"+"Doctor visiting fees "+this.visitingfees+"\n"+"Doctor specialization "+this.specialization;
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
	 
	 public String toString()
	 {
		 return super.toString()+"Nurse wardAssigned "+this.wardAssigned;
	 }
}

class HospitalStaff {

	public static void main(String[] args) {
		HospitalStaffmember hs1;
//		hs1=new HospitalStaffmember(100,"Ramesh",23);
//		hs1.display();
//		hs1.perfromDuty();
//		System.out.println();
		
		hs1=new Doctor(101,"Gargi",24,6,500,"Surgen");
		System.out.println(hs1.toString());
		hs1.perfromDuty();
		System.out.println();
		
		hs1=new Nurse(102,"Jiya",27,"General");
		System.out.println(hs1.toString());
		hs1.perfromDuty();
		System.out.println();
		
	}

}
