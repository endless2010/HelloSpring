package com.mycompany.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext(
				"com/mycompany/autowire/autowire_bean.xml");
		
		Person p=context.getBean("chinese",Person.class);
		p.useAxe();
		Person p1=context.getBean("chinese1",Person.class);
		p1.useAxe();
		Person p2=context.getBean("chinese2",Person.class);
		p2.useAxe();
		Person p3=context.getBean("chinese3",Person.class);
		p3.useAxe();
		Person p4=context.getBean("chinese4",Person.class);
		p4.useAxe();
	}

}
