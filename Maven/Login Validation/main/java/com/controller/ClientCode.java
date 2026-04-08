package com.controller;

import java.util.Scanner;

import com.aspect.ObjectCreate;
import com.service.LoginValidationInter;

public class ClientCode {

	public static void main(String[] args) {
		
		//Taking the data from the client or enduser
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the username");
		String name=sc.nextLine();
		System.out.println("Please enter the userpass");
		String pass=sc.nextLine();
		System.out.println("Please enter the email");
		String email=sc.nextLine();
		
		LoginValidationInter login=ObjectCreate.createObject();
		login.signUp(name, pass,email);
		
		System.out.println("Enter the login username");
		String username=sc.nextLine();
		System.out.println("Enter the login userpass");
		String userpass=sc.nextLine();
		boolean value=login.signIn(username, userpass);
		if(value)
		{
			System.out.println("Welcome User");
		}
		else {
			System.out.println("Please ensure the valid username");
		}
	}

}
