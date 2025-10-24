package assignment6;

public class Question18 {

	public static void main(String[] args) {
		int no1=16;
		square(no1);
		cube(no1);

	}
	static void square(int no1)
	{
		int sq = no1 * no1;
		System.out.printf("Square of %d is %d \n",no1,sq);
		
	}

	static void cube(int no1)
	{
		int cube = no1 * no1 * no1;
		System.out.printf("Cube of %d is %d",no1,cube);
	}

}
