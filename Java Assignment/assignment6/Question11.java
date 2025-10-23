package assignment6;

public class Question11 {

	public static void main(String[] args){
		int year=leap();
		if(year==1)
			System.out.printf("leap year");
		else
			System.out.printf("not leap year");
	}

	static int leap()
	{
		int year=2008;
		if(year % 4 ==0 && year % 100!=0 || year % 400==0){
			return 1;
		}
		else{
			return 0;
		}
	}

}
