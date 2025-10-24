package assignment6;

public class Question3 {

	public static void main(String args[])
	{
		palindrome();
	}

	static void palindrome()
	{
		int no=1332;
		int r1,rev=0;
		int temp=no;
		while(no>0)
		{
			r1=no % 10;
			no=no / 10;
			rev=rev*10 + r1;
		}
			
		if(temp == rev)
		{
			System.out.printf("%d is a Palindrome Number",temp);
		} 
		else
		{
			System.out.printf("%d is not a Palindrome Number",temp);
		}
	}

}
