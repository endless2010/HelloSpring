package com.mycompany.annotation;

import java.util.Arrays;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {

//		ApplicationContext context=new ClassPathXmlApplicationContext("annotation_bean.xml");
		AbstractApplicationContext context=new ClassPathXmlApplicationContext(
				"com/mycompany/annotation/annotation_bean.xml");
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		Person p=context.getBean("chinese",Person.class);
		p.useAxe();
		context.registerShutdownHook();
		
	}

}
