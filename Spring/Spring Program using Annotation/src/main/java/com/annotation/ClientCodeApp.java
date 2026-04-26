package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientCodeApp {

	public static void main(String[] args) {
		ApplicationContext context=
				new AnnotationConfigApplicationContext(AppConfig.class);
		
		Employee_Annotation e=context.getBean(Employee_Annotation.class);
		e.info();
		
	}

}
