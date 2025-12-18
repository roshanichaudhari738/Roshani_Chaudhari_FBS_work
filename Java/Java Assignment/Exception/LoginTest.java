package customizeexception;

import java.util.Scanner;

public class LoginTest {

	public static void main(String[] args) {
		Login l1=new Login();
		
		Scanner sc=new Scanner(System.in);
		
		try {
			System.out.print("Enter Username: ");
            String user = sc.next();

            // Validate Username
            l1.validateUsername(user);

            // If username correct -> Password attempts start
            int attempts = 3;
            boolean success = false;
            for (int i = 1; i <= attempts; i++) {
                System.out.print("Enter Password: ");
                String pass = sc.next();

                try {
                    l1.validatePassword(pass);
                    System.out.println("Login Successful!");
                    success = true;
                    break; // exit loop
                } 
                catch (InvalidPasswordException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Attempts Left: " + (attempts - i));
                }
            }

            if (!success) {
                System.out.println("Account Locked!");
            }
		} 
        catch (InvalidUsernameException e) {
            System.out.println(e.getMessage());
        }
		sc.close();


	}

}
