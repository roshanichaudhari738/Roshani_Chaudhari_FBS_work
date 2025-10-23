package assignment6;

public class Question14 {

	public static void main(String args[])
	{
		int res=prime();
		if(res==1)
			System.out.printf("Prime");
		else
			System.out.printf("Not Prime");
	}

	static int prime()
	{
		int no=17,status=0;
		int i=2;
		while(i<=(no/2))
		{
			if(no%i==0)
			{
				status=1;
				break;
			}
			i++;
		}
		
		if(status==0)
			return 1;
		else
			return 0;
	}

}
