package assignment6;

public class Question22 {

	public static void main(String[] args) {
		int r;
		double pi;
		r=5;
		pi=3.14;
		double res=areacircle(r,pi);
		System.out.printf("result is %f",res);

	}
	static double areacircle(int a,double pi)
	{
		return pi*a*a;
	}

}
