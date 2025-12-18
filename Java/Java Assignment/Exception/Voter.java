package customizeexception;

public class Voter {

	int age;
	
	Voter(int age)//only parameterized
	{
		this.age=age;
	}
	
	void validAge() throws InvalidAgeException
	{
		if(this.age<18)
		{
				throw new InvalidAgeException();
		}
		else
		{
			System.out.println("Valid Age you can vote!!!");
		}
	}
}
