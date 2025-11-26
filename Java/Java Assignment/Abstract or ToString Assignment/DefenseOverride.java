package Day12;

abstract class Defence
{
	String nameOfHead;
	int nooftrrops;
	double budget;
	int noofdept;
	int noofvehicle;
	String locationofheadquarter;
	String countryname;
	int manpowercount;
	int noofmissionperformed;
	int noofcasualties;
	
	Defence()
	{
		System.out.println("Defence Default Constructor Call");
		 nameOfHead="ABC";
		 nooftrrops=30;
		 budget=78000;
		 noofdept=3;
		 noofvehicle=20;
		 locationofheadquarter="Not assign";
		 countryname="Xyz";
		 manpowercount=33;
		 noofmissionperformed=5;
		 noofcasualties=6;
	}
	
	  Defence(String nameOfHead, int nooftrrops, double budget, int noofdept, int noofvehicle,
			String locationofheadquarter, String countryname, int manpowercount, int noofmissionperformed,
			int noofcasualties) {
		 System.out.println("Defence Parameter Constructor Call");
		this.nameOfHead = nameOfHead;
		this.nooftrrops = nooftrrops;
		this.budget = budget;
		this.noofdept = noofdept;
		this.noofvehicle = noofvehicle;
		this.locationofheadquarter = locationofheadquarter;
		this.countryname = countryname;
		this.manpowercount = manpowercount;
		this.noofmissionperformed = noofmissionperformed;
		this.noofcasualties = noofcasualties;
	}

	String getNameOfHead() {
		return nameOfHead;
	}
	 void setNameOfHead(String nameOfHead) {
		this.nameOfHead = nameOfHead;
	}
	 int getNooftrrops() {
		return nooftrrops;
	}
	 void setNooftrrops(int nooftrrops) {
		this.nooftrrops = nooftrrops;
	}
	 double getBudget() {
		return budget;
	}
	 void setBudget(double budget) {
		this.budget = budget;
	}
	 int getNoofdept() {
		return noofdept;
	}
	 void setNoofdept(int noofdept) {
		this.noofdept = noofdept;
	}
	 int getNoofvehicle() {
		return noofvehicle;
	}
	 void setNoofvehicle(int noofvehicle) {
		this.noofvehicle = noofvehicle;
	}
	 String getLocationofheadquarter() {
		return locationofheadquarter;
	}
	 void setLocationofheadquarter(String locationofheadquarter) {
		this.locationofheadquarter = locationofheadquarter;
	}
	 String getCountryname() {
		return countryname;
	}
	 void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	 int getManpowercount() {
		return manpowercount;
	}
	 void setManpowercount(int manpowercount) {
		this.manpowercount = manpowercount;
	}
	 int getNoofmissionperformed() {
		return noofmissionperformed;
	}
	 void setNoofmissionperformed(int noofmissionperformed) {
		this.noofmissionperformed = noofmissionperformed;
	}
	 int getNoofcasualties() {
		return noofcasualties;
	}
	 void setNoofcasualties(int noofcasualties) {
		this.noofcasualties = noofcasualties;
	}
	 
	abstract void attack();

	 
//	 void display()
//	 {
//		 System.out.println("Defence Name Of Head :"+this.nameOfHead);
//		 System.out.println("Defence No Of Troops :"+this.nooftrrops);
//		 System.out.println("Defence Budget :"+this.budget);
//		 System.out.println("Defence No Of Department :"+this.noofdept);
//		 System.out.println("Defence No Of Vehicle :"+this.noofvehicle);
//		 System.out.println("Defence Location Of Headquarter :"+this.locationofheadquarter);
//		 System.out.println("Defence Country Name :"+this.countryname);
//		 System.out.println("Defence Man Power Count :"+this.manpowercount);
//		 System.out.println("Defence No of Mission Performed :"+this.noofmissionperformed);
//		 System.out.println("Defence No Of Casualties :"+this.noofcasualties);
//		
//	 }
	 
	 public String toString()
	 {
		 return "Defence Name Of Head :"+this.nameOfHead+"\n"+"Defence No Of Troops :"+this.nooftrrops+"\n"+"Defence Budget :"+this.budget+
				 "\n"+"Defence No Of Department :"+this.noofdept+"\n"+"Defence No Of Vehicle :"+this.noofvehicle+"\n"+"Defence Location Of Headquarter :"+this.locationofheadquarter+"\n"+
				 "Defence Country Name :"+this.countryname+"\n"+"Defence Man Power Count :"+this.manpowercount+"\n"+"Defence No of Mission Performed :"+this.noofmissionperformed
				 +"\n"+"Defence No Of Casualties :"+this.noofcasualties;
	 }
}

class Army extends Defence
{
	int nooftank;
	int noofguns;
	int noofgrenates;
	int noofbatalian;
	
	Army()
	{
		super();
		System.out.println("Army Default Constructor Called");
		 nooftank=2;
		 noofguns=20;
		 noofgrenates=4;
		 noofbatalian=10;
	}
	
	  Army(String nameOfHead,int nooftrrops,double budget,int noofdept,int noofvehicle,String locationofheadquarter,String countryname,int manpowercount,int noofmissionperformed,int noofcasualties,int nooftank, int noofguns, int noofgrenates, int noofbatalian) {
		 super(nameOfHead,nooftrrops,budget,noofdept,noofvehicle,locationofheadquarter,countryname,manpowercount,noofmissionperformed,noofcasualties);
		 System.out.println("Army Paramter Constructor Called");
		this.nooftank = nooftank;
		this.noofguns = noofguns;
		this.noofgrenates = noofgrenates;
		this.noofbatalian = noofbatalian;
	}

	int getNooftank() {
		return nooftank;
	}
	 void setNooftank(int nooftank) {
		this.nooftank = nooftank;
	}
	 int getNoofguns() {
		return noofguns;
	}
	 void setNoofguns(int noofguns) {
		this.noofguns = noofguns;
	}
	 int getNoofgrenates() {
		return noofgrenates;
	}
	 void setNoofgrenates(int noofgrenates) {
		this.noofgrenates = noofgrenates;
	}
	 int getNoofbatalian() {
		return noofbatalian;
	}
	 void setNoofbatalian(int noofbatalian) {
		this.noofbatalian = noofbatalian;
	}
	 
	 void attack()
	 {
		 System.out.println("Army Defense Attack");
	 }
	 
//	 void display()
//	 {
//		 super.display();
//		 System.out.println("Army No of Tank :"+this.nooftank);
//		 System.out.println("Army No of Guns :"+this.noofguns);
//		 System.out.println("Army No of Grenates :"+this.noofgrenates);
//		 System.out.println("Army No of Batalian :"+this.noofbatalian);
//	 }
	 
	 public String toString()
	 {
		 return super.toString()+"Army No of Tank :"+this.nooftank+"\n"+"Army No of Guns :"+this.noofguns+"\n"+"Army No of Grenates :"+this.noofgrenates
				 +"\n"+"Army No of Batalian :"+this.noofbatalian;
	 }
}

class Navy extends Defence
{
	int noofships;
	
	int noofsubmarine;
	int nooftorpidos;
	
	Navy() {
		super();
		System.out.println("Navy Default Constructor Called");
		noofships = 5;
		noofsubmarine = 0;
		nooftorpidos = 0;
	}
	
	 Navy(String nameOfHead,int nooftrrops,double budget,int noofdept,int noofvehicle,String locationofheadquarter,String countryname,int manpowercount,int noofmissionperformed,int noofcasualties,int noofships, int noofsubmarine, int nooftorpidos) {
		 super(nameOfHead,nooftrrops,budget,noofdept,noofvehicle,locationofheadquarter,countryname,manpowercount,noofmissionperformed,noofcasualties);
		 System.out.println("Navy Para Constructor Called");
		this.noofships = noofships;
		this.noofsubmarine = noofsubmarine;
		this.nooftorpidos = nooftorpidos;
	}
	
	 int getNoofships() {
		return noofships;
	}
	 void setNoofships(int noofships) {
		this.noofships = noofships;
	}
	 int getNoofsubmarine() {
		return noofsubmarine;
	}
	 void setNoofsubmarine(int noofsubmarine) {
		this.noofsubmarine = noofsubmarine;
	}
	 int getNooftorpidos() {
		return nooftorpidos;
	}
	 void setNooftorpidos(int nooftorpidos) {
		this.nooftorpidos = nooftorpidos;
	}
	 
	 void attack()
	 {
		 System.out.println("Navy Defense Attack");
	 }
	 
//	 void display()
//	 {
//		 super.display();
//		 System.out.println("Navy No of Ships :"+this.noofships);
//		 System.out.println("Navy No of Submarines :"+this.noofsubmarine);
//		 System.out.println("Navy No of Torpidos :"+this.nooftorpidos);
//	 }
	 
	 public String toString()
	 {
		 return super.toString()+"Navy No of Ships :"+this.noofships+"\n"+"Navy No of Submarines :"+this.noofsubmarine+"\n"+"Navy No of Torpidos :"+this.nooftorpidos;
	 }
}

class Airforce extends Defence
{
	int noofaircrafts;
	int noofsquadrons;
	int noofmissiles;
	
	Airforce() {
		super();
		System.out.println("Airforce Default Constructor Called");
		noofaircrafts = 45;
		noofsquadrons = 00;
		noofmissiles = 36;
	}
	
	  Airforce(String nameOfHead,int nooftrrops,double budget,int noofdept,int noofvehicle,String locationofheadquarter,String countryname,int manpowercount,int noofmissionperformed,int noofcasualties,int noofaircrafts, int noofsquadrons, int noofmissiles) {
		  super(nameOfHead,nooftrrops,budget,noofdept,noofvehicle,locationofheadquarter,countryname,manpowercount,noofmissionperformed,noofcasualties);
		  System.out.println("Airforce Para Constructor Called");
		this.noofaircrafts = noofaircrafts;
		this.noofsquadrons = noofsquadrons;
		this.noofmissiles = noofmissiles;
	}
	int getNoofaircrafts() {
		return noofaircrafts;
	}
	 void setNoofaircrafts(int noofaircrafts) {
		this.noofaircrafts = noofaircrafts;
	}
	 int getNoofsquadrons() {
		return noofsquadrons;
	}
	 void setNoofsquadrons(int noofsquadrons) {
		this.noofsquadrons = noofsquadrons;
	}
	 int getNoofmissiles() {
		return noofmissiles;
	}
	 void setNoofmissiles(int noofmissiles) {
		this.noofmissiles = noofmissiles;
	}
	 
	 void attack()
	 {
		 System.out.println("Air force Defense Attack");
	 }
	 
//	 void display()
//	 {
//		 super.display();
//		 System.out.println("Airforce No of Aircrafts :"+this.noofaircrafts);
//		 System.out.println("Airforce No of squadrons :"+this.noofsquadrons);
//		 System.out.println("Airforce No of missiles :"+this.noofmissiles);
//	 }
	 
	 public String toString()
	 {
		 return super.toString()+"Airforce No of Aircrafts :"+this.noofaircrafts+"\n"+"Airforce No of squadrons :"+this.noofsquadrons+
				 "\n"+"Airforce No of missiles :"+this.noofmissiles;
	 }
}

class DefenseOverride {

	public static void main(String[] args) {
		Defence d1;
//		Defence d1=new Defence("XYZ",42,852000,20,100,"US","USA",30,50,30);
//		d1.display();
//		d1.attack();		
//		System.out.println("\n\n");
		
		d1=new Army();
		System.out.println(d1);
		System.out.println("\n\n");
		
		d1=new Army("AWS",42,852000,20,100,"US","USA",30,50,30,45,200,623,478);
		System.out.println(d1);
		d1.attack();
		System.out.println("\n\n");
		
		d1=new Navy();
		System.out.println(d1);
		System.out.println("\n\n");
		
		d1=new Navy("QSW",46,452000,36,100,"UK","USA",33,53,47,100,60,85);
		System.out.println(d1);
		d1.attack();
		System.out.println("\n\n");
		
		d1=new Airforce();
		System.out.println(d1);
		System.out.println("\n\n");
		
		d1=new Airforce("FRD",82,9652000,45,100,"Canada","USA",30,93,75,800,65,200);
		System.out.println(d1);
		d1.attack();
		System.out.println("\n\n");

	}

}
