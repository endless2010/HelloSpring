package com.mycompany.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext(
				"com/mycompany/injection/injection_bean.xml");
		Person p=context.getBean("chinese",Person.class);
		p.useAxe();
		Person p2=context.getBean("chinese_p",Person.class);
		p2.useAxe();
	}

}
