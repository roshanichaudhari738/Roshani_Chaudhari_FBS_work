package validateinter;

public interface ValidateInterface {
	void SignUp(String user,String pass,String securityQ,String securityA);
	Boolean SignIn(String user,String pass);

}
