package assignment6;

public class Question6 {

	public static void main(String[] args)
	{
		int res; //calling function
		res=add();
		System.out.printf("Sum is %d",res);
	}

	static int add()
	{
		int num1=50,num2=30;
		int sum=num1+num2;
		
		return sum;
	}

}
