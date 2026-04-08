package com.aspect;

import com.dao.AccountDAO;

public class DaoObjectProviderClass {
	public static AccountDAO createObject(String daoclassname) {
		AccountDAO obj=null;
		try {
			obj=(AccountDAO)Class.forName(daoclassname).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}
}
