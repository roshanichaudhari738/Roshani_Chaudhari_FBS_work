package assignment5;

public class Question3 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1||j==1||i==5||j==5)
					System.out.printf("* ");
				else
					System.out.printf("  ");
			}
			System.out.printf("\n");
		}

	}

}
