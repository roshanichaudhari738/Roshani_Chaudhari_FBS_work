package assignment6;

public class Question5 {

	public static void main(String[] args){
		double basic=6000;
		
		double totalsal=salarytotal(basic);
		System.out.printf("Total Salary is %f",totalsal);
	}

	static double salarytotal(double basic)
	{
		double da,ta,hra;
		if(basic<=5000)
		{
			da=basic*0.10;
			ta=basic*0.20;
			hra=basic*0.25;
		}
		else{
			da=basic*0.15;
			ta=basic*0.25;
			hra=basic*0.30;
		}
		return basic+da+ta+hra;
		
	}

}
