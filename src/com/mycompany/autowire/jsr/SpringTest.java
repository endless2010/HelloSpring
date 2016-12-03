package com.mycompany.autowire.jsr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext(
				"com/mycompany/autowire/jsr/autowire_jsr_bean.xml");
		
		Person p=context.getBean("chinese",Person.class);
		p.useAxe();
	}

}
