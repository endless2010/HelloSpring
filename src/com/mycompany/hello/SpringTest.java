package com.mycompany.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {

//		ApplicationContext context=new FileSystemXmlApplicationContext(
//				"D:\\workspace\\HelloSpring\\src\\hello_bean.xml");
		ApplicationContext context=new ClassPathXmlApplicationContext(
				"com/mycompany/hello/hello_bean.xml");
		Person p=context.getBean("person",Person.class);
		System.out.println(p);
	}

}
