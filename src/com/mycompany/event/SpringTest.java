package com.mycompany.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext(
				"com/mycompany/event/event_bean.xml");
		EmailEvent event=new EmailEvent("test","hello@xx.com","have fun");
		context.publishEvent(event);
	}

}
