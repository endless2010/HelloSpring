package com.mycompany.alias;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {

//		ApplicationContext context=new FileSystemXmlApplicationContext(
//				"D:\\workspace\\HelloSpring\\src\\hello_bean.xml");
		ApplicationContext context=new ClassPathXmlApplicationContext(
				"com/mycompany/alias/alias_bean.xml");
		MessageService p=context.getBean("messageService",MessageService.class);
		p.displayMessage();
	}

}
