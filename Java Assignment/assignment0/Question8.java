package assignment0;

public class Question8 {

	public static void main(String[] args) {
		//int sub1,sub2,sub3,sub4,sub5,totalmarks;

		//float percentage;
		int sub1=56,sub2=89,sub3=69,sub4=45,sub5=80;

		int totalmarks = sub1 + sub2 + sub3 + sub4 + sub5;
		System.out.printf("Total is %d ",totalmarks);
		double percentage = (totalmarks / 500.0) * 100;
		System.out.printf("Percentage is %f",percentage);

	}

}
