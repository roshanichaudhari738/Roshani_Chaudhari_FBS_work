package clientCode;

import java.util.Scanner;

import com.beans.hibernate_criteria_practise.User;

import loginValidation.LoginValidation;
import validateinter.ValidateInterface;

public class ClientCode {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the Username :");
//		String name=sc.nextLine();
//		System.out.println("Enter the UserPass :");
//		String pass=sc.nextLine();
//		System.out.println("Enter the Security Que :");
//		String securityQ=sc.nextLine();
//		System.out.println("Enter the Security Ans :");
//		String securityA=sc.nextLine();
		
		ValidateInterface vi=new LoginValidation();
//		vi.SignUp(name, pass, securityQ, securityA);
		
		System.out.println("Enter the Login Username :");
		String username=sc.nextLine();
		System.out.println("Enter the Login UserPass :");
		String userpass=sc.nextLine();
		Boolean value=vi.SignIn(username, userpass);
		
		if(value)
		{
			System.out.println("Welcome User");
		}
		else {
			System.out.println("Please ensure the valid username");
		}
		

	}

}
