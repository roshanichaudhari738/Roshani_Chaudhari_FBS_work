package assignment6;

public class Question17 {

	public static void main(String[] args) {
		int no=17;
		prime(no);

	}
	static void prime(int num)
	{
		int flag=0;
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
				flag=1;
				break;
		}
		
		
		if(flag==0)
			System.out.printf("Prime");
		else
			System.out.printf("not Prime");
	}

}
