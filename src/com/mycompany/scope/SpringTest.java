package com.mycompany.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext(
				"com/mycompany/scope/scope_bean.xml");

		Person person11=context.getBean("chinese_singleton1",Person.class);
		Person person12=context.getBean("chinese_singleton1",Person.class);
		System.out.println(person11==person12);
		
		Person person21=context.getBean("chinese_singleton2",Person.class);
		Person person22=context.getBean("chinese_singleton2",Person.class);
		System.out.println(person21==person22);
		System.out.println(person11==person21);
		
		Person person31=context.getBean("chinese_prototype1",Person.class);
		Person person32=context.getBean("chinese_prototype1",Person.class);
		System.out.println(person31==person32);
		
		Person person41=context.getBean("chinese_prototype2",Person.class);
		Person person42=context.getBean("chinese_prototype2",Person.class);
		System.out.println(person41==person42);
		System.out.println(person31==person41);
;
	}

}
