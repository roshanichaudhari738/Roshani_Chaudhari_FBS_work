package customizeexception;

public class Test {

	public static void main(String[] args) {
		Voter v1=new Voter(17);
		try {
			v1.validAge();
		} catch (InvalidAgeException e) {
			System.out.println(e);
		}
	}

}
