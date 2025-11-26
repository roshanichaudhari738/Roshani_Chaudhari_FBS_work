package Day12;


abstract class Farmer
{
	abstract void calSubsidy();
}

class DairyFarmer extends Farmer
{
	void calSubsidy()
	{
		System.out.println(" DairyFarmer Subsidy Recived");
	}
}

class PowtteryFarmer extends Farmer
{
	void calSubsidy()
	{
		System.out.println(" PowtteryFarmer Subsidy Recived");
	}
}

class OrganicFarmer extends Farmer
{
	void calSubsidy()
	{
		System.out.println("OrganicFarmer Subsidy Recived");
	}
}

public class SubsidyOverride {

	public static void main(String[] args) {
		Farmer v1;
//		 v1 = new Farmer();
//        v1.calSubsidy();

         v1 = new DairyFarmer();
        v1.calSubsidy();

         v1 = new PowtteryFarmer();
        v1.calSubsidy();

         v1 = new OrganicFarmer();
        v1.calSubsidy();

	}

}
