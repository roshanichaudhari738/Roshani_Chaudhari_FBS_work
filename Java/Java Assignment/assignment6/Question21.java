package assignment6;

public class Question21 {

	public static void main(String[] args) {
		int no=1478;
		int res=isArmstrong(no);

		if(res == 1){
			System.out.printf(" Armstrong");
		}else{
			System.out.printf("not a Armstrong");
		}

	}
	static int getCount(int no)
	{
		int count=0;
		while(no>0){
			count++;
			no=no/10;
		}
		return count;
	}//calculate count

	static int power(int base,int exp)
	{
		int power=1;
			for(int i=1;i<=exp;i++)//calculate power
				power=power*base;
			return power;		
	}//power

	static int isArmstrong(int no)
	{
		int temp = no;
		int sum=0;
		int count=getCount(no);
		
		while(no>0)
		{
			int rem=no%10;
			
//			int res=power(rem,count);
			
			sum=sum+power(rem,count);
			no=no/10;
		}
		if(temp == sum)
			return 1;
		else
			return 0;
		
	}

}
