package com.aspect;

import java.io.FileInputStream;
import java.util.Properties;

import com.service.LoginValidationInter;

public class ObjectCreate {
	
	//building an object of bussiness logic class aspect --service provider
	public static LoginValidationInter createObject()
	{
		String classname=null;
		LoginValidationInter login=null;
		try {
			FileInputStream fis=new FileInputStream(".//src//main//resource//info.properties");
			Properties p=new Properties();
			p.load(fis);
			classname=p.getProperty("bussinessClassName");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			
			login=(LoginValidationInter)Class.forName(classname).newInstance();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return login;
	}

}
