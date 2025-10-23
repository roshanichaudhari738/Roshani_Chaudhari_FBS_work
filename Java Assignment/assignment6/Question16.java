package assignment6;

public class Question16 {

	public static void main(String[] args) {
		int no=153;
		isArmstrong(no);

	}
	static void isArmstrong(int num)
	{
		int sum=0,rem=0,count=0;
		int temp = num;
		while(temp>0)
		{
			count++;
			temp=temp/10;
		}
		temp=num;
		while(num>0)
		{
			rem=num%10;
			int power=1;
			for(int i=1;i<=count;i++)//calculate power
			{	
				power=power*rem;	
			}
			sum=sum+power;
			num=num/10;
		}
		if(temp == sum){
			System.out.printf("%d is a Armstrong",temp);
		}else{
			System.out.printf("%d is not a Armstrong",temp);
		}
	}

}
