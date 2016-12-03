package com.mycompany.aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext(
				"com/mycompany/aware/aware_bean.xml");
		Person p=context.getBean("person",Person.class);
		System.out.println(p);
	}

}
