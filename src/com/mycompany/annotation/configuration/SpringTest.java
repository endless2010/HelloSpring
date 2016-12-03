package com.mycompany.annotation.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext(
				"com/mycompany/annotation/configuration/configuration_bean.xml");
		Person p=context.getBean("chinese",Person.class);
		p.useAxe();
	}

}
