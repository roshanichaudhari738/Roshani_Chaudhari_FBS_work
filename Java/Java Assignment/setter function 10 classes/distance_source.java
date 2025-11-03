class Distance
{
	int km,m;

	void setDistance(int k,int m)
	{
		this.km=k;
		this.m=m;

	}
}
class DistanceTest
{
	public static void main(String[] args)
	{
		Distance d;
		d=new Distance();

		d.setDistance(5,9);
		
		System.out.printf("kilometer is : "+d.km+"\nmeter is : "+d.m);
	}
}