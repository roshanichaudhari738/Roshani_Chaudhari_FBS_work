package assignment6;

public class Question10 {

	public static void main(String[] args){
		int time=min();
		System.out.printf("%d",time);
		int hrtime=hr();
		System.out.printf("%d",hrtime);
	}

	static int min()
	{
		int min=500;
		int hr,rmin;
		hr=min/60;
		rmin=min%60;
		System.out.printf("Total hour and min of %d is %d hr , %d min",min,hr,rmin);
		return rmin;
	}

	static int hr()
	{
		int min=500;
		int hr;
		hr=min/60;
		System.out.printf("Total hour and min of %d is %d hr ",min,hr);
		return hr;
	}

}
