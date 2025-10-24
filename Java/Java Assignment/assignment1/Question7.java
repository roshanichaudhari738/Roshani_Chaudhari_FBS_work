package assignment1;

public class Question7 {

	public static void main(String[] args) {
		char character = 'a';
		if(character == 'a'
		|| character == 'A'|| character == 'e' || character == 'E' || character == 'i' || character == 'I'  
		|| character == 'o' || character == 'O' || character == 'u' || character == 'U'){
			System.out.printf("%c is a vowel",character);
		}
		else{
			System.out.printf("%c is a consonant",character);
		}

	}

}
