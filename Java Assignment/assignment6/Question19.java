package assignment6;

public class Question19 {

	public static void main(String[] args) {
		int start=1,end=6;
		startend(start,end);

	}
	static void startend(int a,int b)
	{
		int sum=0;
		while(a<=b){
			sum=sum+a;
			a++;
		}
		System.out.printf("%d",sum);
	}

}
