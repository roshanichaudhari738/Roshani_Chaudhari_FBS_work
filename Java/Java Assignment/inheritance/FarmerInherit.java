package inheritance;
class Farmer
{
	int FarmerID;
	String FarmerName;
	long Landarea;
	String City;
	double AnnualIncome;
	int Noofequipment;
	double Insuranceamt;
	
	Farmer()
	{
		System.out.println("Farmer Default Constructor Called");
		 FarmerID=101;
		 FarmerName="not assign";
		 Landarea=147852369;
		 City="Jalgaon";
		 AnnualIncome=456.36;
		 Noofequipment=2;
		 Insuranceamt=369;
	}
	
	  Farmer(int farmerID, String farmerName, long landarea, String city, double annualIncome, int noofequipment,
			double insuranceamt) {
		  System.out.println("Farmer Parameter Constructor Called");
		FarmerID = farmerID;
		FarmerName = farmerName;
		Landarea = landarea;
		City = city;
		AnnualIncome = annualIncome;
		Noofequipment = noofequipment;
		Insuranceamt = insuranceamt;
	}

	int getFarmerID() {
		return FarmerID;
	}
	 void setFarmerID(int farmerID) {
		FarmerID = farmerID;
	}
	 String getFarmerName() {
		return FarmerName;
	}
	 void setFarmerName(String farmerName) {
		FarmerName = farmerName;
	}
	 long getLandarea() {
		return Landarea;
	}
	 void setLandarea(long landarea) {
		Landarea = landarea;
	}
	 String getCity() {
		return City;
	}
	 void setCity(String city) {
		City = city;
	}
	 double getAnnualIncome() {
		return AnnualIncome;
	}
	 void setAnnualIncome(double annualIncome) {
		AnnualIncome = annualIncome;
	}
	 int getNoofequipment() {
		return Noofequipment;
	}
	 void setNoofequipment(int noofequipment) {
		Noofequipment = noofequipment;
	}
	 double getInsuranceamt() {
		return Insuranceamt;
	}
	 void setInsuranceamt(double insuranceamt) {
		Insuranceamt = insuranceamt;
	}
	 
	 void display()
	 {
		 System.out.println("Farmer ID is:"+this.FarmerID);
		 System.out.println("Farmer Name is:"+this.FarmerName);
		 System.out.println("Farmer Land area is:"+this.Landarea);
		 System.out.println("Farmer City is:"+this.City);
		 System.out.println("Farmer Annual Income is:"+this.AnnualIncome);
		 System.out.println("Farmer No of equipment is:"+this.Noofequipment);
		 System.out.println("Farmer Insurance Amount is:"+this.Insuranceamt);
	 }
}

class DairyFarmer extends Farmer
{
	int Noofcattles;
	String Milkproduceproduction;
	int DairylicenseNo;
	
	DairyFarmer()
	{
		super();
		System.out.println("DairyFarmer Default Constructor Called");
		Noofcattles=2;
		Milkproduceproduction="Not Assign";
		DairylicenseNo=74125;
	}
	
	DairyFarmer(int farmerID, String farmerName, long landarea, String city, double annualIncome, int noofequipment,
			double insuranceamt,int noofcattles, String milkproduceproduction, int dairylicenseNo) {
		super(farmerID,farmerName, landarea, city, annualIncome, noofequipment, insuranceamt);
		  System.out.println("DairyFarmer Para Constructor Called");
		Noofcattles = noofcattles;
		Milkproduceproduction = milkproduceproduction;
		DairylicenseNo = dairylicenseNo;
	}
	int getNoofcattles() {
		return Noofcattles;
	}
	 void setNoofcattles(int noofcattles) {
		Noofcattles = noofcattles;
	}
	 String getMilkproduceproduction() {
		return Milkproduceproduction;
	}
	 void setMilkproduceproduction(String milkproduceproduction) {
		Milkproduceproduction = milkproduceproduction;
	}
	 int getDairylicenseNo() {
		return DairylicenseNo;
	}
	 void setDairylicenseNo(int dairylicenseNo) {
		DairylicenseNo = dairylicenseNo;
	}
	 void display()
	 {
		 super.display();
		 System.out.println("DairyFarmer No of Cattle is:"+this.Noofcattles);
		 System.out.println("DairyFarmer Milk Produce Production is:"+this.Milkproduceproduction);
		 System.out.println("DairyFarmer Dairy License No:"+this.DairylicenseNo);
	 }
}

class PowtteryFarmer extends Farmer
{
	int Noofchickend,hens;
	int Noofshades;
	int Eggsproduceday;
	int PowtteryFarmerno;
	
	PowtteryFarmer()
	{
		super();
		System.out.println("PowtteryFarmer Default Constructor Called");
		Noofchickend = 0;
		hens = 5;
		Noofshades = 6;
		Eggsproduceday = 45;
		PowtteryFarmerno = 4785;
	}
	
	  PowtteryFarmer(int farmerID, String farmerName, long landarea, String city, double annualIncome, int noofequipment,
				double insuranceamt,int noofchickend, int hens, int noofshades, int eggsproduceday, int powtteryFarmerno) {
		  super(farmerID,farmerName, landarea, city, annualIncome, noofequipment, insuranceamt);
		  System.out.println("PowtteryFarmer Para Constructor Called");
		Noofchickend = noofchickend;
		this.hens = hens;
		Noofshades = noofshades;
		Eggsproduceday = eggsproduceday;
		PowtteryFarmerno = powtteryFarmerno;
	}
	int getNoofchickend() {
		return Noofchickend;
	}
	 void setNoofchickend(int noofchickend) {
		Noofchickend = noofchickend;
	}
	 int getHens() {
		return hens;
	}
	 void setHens(int hens) {
		this.hens = hens;
	}
	 int getNoofshades() {
		return Noofshades;
	}
	 void setNoofshades(int noofshades) {
		Noofshades = noofshades;
	}
	 int getEggsproduceday() {
		return Eggsproduceday;
	}
	 void setEggsproduceday(int eggsproduceday) {
		Eggsproduceday = eggsproduceday;
	}
	 int getPowtteryFarmerno() {
		return PowtteryFarmerno;
	}
	 void setPowtteryFarmerno(int powtteryFarmerno) {
		PowtteryFarmerno = powtteryFarmerno;
	}
	 
	 void display()
	 {
		 super.display();
		 System.out.println("PowtteryFarmer No of Chicken and hens:"+this.Noofchickend +"and"+this.hens);
		 System.out.println("PowtteryFarmer No of Shades:"+this.Noofshades);
		 System.out.println("PowtteryFarmer Eggs Produce Day:"+this.Eggsproduceday);
		 System.out.println("PowtteryFarmer No:"+this.PowtteryFarmerno);
	 }
}

class OrganicFarmer extends Farmer
{
	int OrganicID;
	String Fertilizerused;
	
	OrganicFarmer()
	{
		super();
		System.out.println("OrganicFarmer Default Constructor Called");
		OrganicID = 0;
		Fertilizerused = "XYZ";
	}
	
	  OrganicFarmer(int farmerID, String farmerName, long landarea, String city, double annualIncome, int noofequipment,
				double insuranceamt,int organicID, String fertilizerused) {
		  super(farmerID,farmerName, landarea, city, annualIncome, noofequipment, insuranceamt);
		  System.out.println("OrganicFarmer Para Constructor Called");
		OrganicID = organicID;
		Fertilizerused = fertilizerused;
	}
	int getOrganicID() {
		return OrganicID;
	}
	 void setOrganicID(int organicID) {
		OrganicID = organicID;
	}
	 String getFertilizerused() {
		return Fertilizerused;
	}
	 void setFertilizerused(String fertilizerused) {
		Fertilizerused = fertilizerused;
	}
	 void display()
	 {
		 super.display();
		 System.out.println("Organic ID is:"+this.OrganicID);
		 System.err.println("Organic Used is:"+this.Fertilizerused);
	 }
}
class FarmerInherit {

	public static void main(String[] args) {
		DairyFarmer df1=new DairyFarmer();
		df1.display();
		System.out.println("\n\n");
		
		DairyFarmer df2=new DairyFarmer(101,"Rahul",74125,"Jalna",4785.36,10,452689.36,20,"Curd",4578963);
		df2.display();
		System.out.println("\n\n");
		
		PowtteryFarmer pf1=new PowtteryFarmer();
		pf1.display();
		System.out.println("\n\n");
		
		PowtteryFarmer pf2=new PowtteryFarmer(102,"Umesh",7369,"Solapur",8520000,30,452689.36,50,60,100,15,1001);
		pf2.display();
		System.out.println("\n\n");
		
		OrganicFarmer of1=new OrganicFarmer();
		of1.display();
		System.out.println("\n\n");
		
		OrganicFarmer of2=new OrganicFarmer(103,"Shree",85236,"Jalgaon",634000,10,452689.36,5601,"CleanSoil");
		of2.display();
		System.out.println("\n\n");

	}

}
