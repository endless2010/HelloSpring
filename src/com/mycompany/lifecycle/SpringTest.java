package com.mycompany.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {

//		ApplicationContext context=new ClassPathXmlApplicationContext("lifecycle_bean.xml");
		AbstractApplicationContext context=new ClassPathXmlApplicationContext(
				"com/mycompany/lifecycle/lifecycle_bean.xml");
		Person p=context.getBean("chinese",Person.class);
		p.useAxe();
		context.registerShutdownHook();
	}

}
