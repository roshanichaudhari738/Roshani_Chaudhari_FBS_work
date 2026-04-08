package com.aspect;

import com.service.LoginValidationInter;

public class ObjectProviderClass {
		public static LoginValidationInter createObject(String classname) 
		{
			LoginValidationInter obj=null;
			try {
				obj=(LoginValidationInter)Class.forName(classname).newInstance();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
			return obj;
		}
}
