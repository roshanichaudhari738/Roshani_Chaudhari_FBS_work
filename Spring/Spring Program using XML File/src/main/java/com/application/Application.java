package com.application;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.springdemo.Services;

public class Application {

	public static void main(String[] args) {
		
		Resource res=new FileSystemResource("../springdemo/src/main/resource/Employee.xml");
		BeanFactory f=new XmlBeanFactory(res);
		Services s=(Services)f.getBean("emp");
		s.info();

	}

}
