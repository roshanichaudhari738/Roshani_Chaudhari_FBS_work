package assignment6;

public class Question9 {

	public static void main(String[] args)
	{
		int res=evenodd();
		if(res==1)
			System.out.printf("Even");
		else
			System.out.printf("Odd");
	}
	 
	static int evenodd()
	{
		int no=81;
		if(no%2==0)
			return 1;
		else
			return 0;
	}

}
