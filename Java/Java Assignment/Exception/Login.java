package customizeexception;

public class Login {
	String username="admin";
	String password="1234";
//	String enterusername;
//	String enteruserpass;
	
//	public Login(String enterusername, String enteruserpass) {
//		super();
//		this.enterusername = enterusername;
//		this.enteruserpass = enteruserpass;
//	}
	
	void validateUsername(String enterusername) throws InvalidUsernameException
	{
		if(!enterusername.equals(username))
		{
			throw new InvalidUsernameException();
		}
		else {
			System.out.println("Username Correct");
		}
			
	}
	
	void validatePassword(String enteredPassword) throws InvalidPasswordException
	{
		if(!enteredPassword.equals(password))
		{
			throw new InvalidPasswordException();
		}
	}

}
