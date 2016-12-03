package com.mycompany.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext(
				"com/mycompany/autowire/annotation/autowire_annotation_bean.xml");
		
		Person p=context.getBean("chinese",Person.class);
		p.useAxe();
	}

}
