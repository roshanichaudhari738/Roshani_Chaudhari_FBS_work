package Day12;


class Farmer
{
	void calSubsidy()
	{
		System.out.println("Subsidy Recived");
	}
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
		Farmer v1 = new Farmer();
        v1.calSubsidy();

        Farmer v2 = new DairyFarmer();
        v2.calSubsidy();

        Farmer v3 = new PowtteryFarmer();
        v3.calSubsidy();

        Farmer v4 = new OrganicFarmer();
        v4.calSubsidy();

	}

}
