package assignment5;

public class Question10 {

	public static void main(String[] args) {
		for(int i=1;i<=15;i++)
		{
			for(int j=1;j<=15;j++)
			{
//				if(i==15||i==j&&i>7||i+j==16&&i>8)
				if(i==15||i==j&&i>7||i+j==16&&i>8)
					System.out.printf("* ");
				else
					System.out.printf("  ");
			}
			System.out.printf("\n");

	}

}
}