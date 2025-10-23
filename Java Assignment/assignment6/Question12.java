package assignment6;

public class Question12 {

	public static void main(String args[])
	{
		int res=palindrome();
		if(res==1)
			System.out.printf("Palindrome");
		else
			System.out.printf("Not Palindrome");
	}

	static int palindrome()
	{
		int r1,no=1441,rev=0;
		int temp=no;
		while(no>0)
		{
			r1=no%10;
			no=no/10;
			rev=rev*10+r1;
			System.out.printf("%d\n",rev);
		}
		
		return temp==rev?  1:  0;
//		if(temp==rev)
//			return 1;
//		else
//			return 0;

	}

}
