package assignment6;

public class Question20 {

	public static void main(String[] args) {
		char character='A';
		upperlowercase(character);

	}
	static void upperlowercase(char character)
	{
		
		if(character >= 'A'&& character <= 'Z')
			System.out.printf("%c is a Uppercase",character);
		else
			System.out.printf("%c is a lowercase",character);
	}

}
