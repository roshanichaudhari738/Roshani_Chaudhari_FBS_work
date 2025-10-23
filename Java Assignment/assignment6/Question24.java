package assignment6;

public class Question24 {
	public static void main(String[] args) {
		int no=6;
		int temp=no;
		int res=factorial(no);
		System.out.printf("%d of factorial is %d",temp,res);

	}
	static int factorial(int i)
	{
		int fact=1;
		for(int no=i;no>1;no--)
			fact=fact*no;
		return fact;
	}

}
