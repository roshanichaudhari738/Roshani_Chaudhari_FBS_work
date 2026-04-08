package com.aspect;

import com.dao.DaoInter;

public class DaoObjectProviderClass {
	//yaha pe obj create horaha hai without using new keyword
	public static DaoInter createObject(String daoclassname) {
		DaoInter obj=null;
		try {
			obj=(DaoInter)Class.forName(daoclassname).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}

}
