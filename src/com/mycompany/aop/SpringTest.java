package com.mycompany.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext(
				"com/mycompany/aop/aop_bean.xml");
		Person p=context.getBean("chinese",Person.class);
		p.useAxe();
		p.testAfterReturing();
		p.testArgs(2, "hello", new byte[]{5,6}, null);
		p.testAfterThrowing();
	}

}
