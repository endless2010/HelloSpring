package com.mycompany.type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext(
				"com/mycompany/type/type_bean.xml");
		Person p1=context.getBean("defaultPerson",Person.class);
		System.out.println("defaultPerson name:"+p1.getName());
		Person p2=context.getBean("NullPerson",Person.class);
		System.out.println("NullPerson name:"+p2.getName());
		TypeTestBean p=context.getBean("typetest",TypeTestBean.class);
		p.display();
	}

}
