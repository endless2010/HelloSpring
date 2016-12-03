package com.mycompany.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext(
				"com/mycompany/factory/factory_bean.xml");
		Person p=context.getBean("chinese",Person.class);
		p.useAxe();
				
		context.getBean("stoneAxe1",Axe.class);
		context.getBean("steelAxe1",Axe.class);
			
		context.getBean("stoneAxe2",Axe.class);
		context.getBean("steelAxe2",Axe.class);	
		
		Axe axe1=context.getBean("stoneAxeFactoryBean",Axe.class);
		Axe axe2=context.getBean("stoneAxeFactoryBean",Axe.class);
		System.out.println(axe1==axe2);
		
		Axe axe3=context.getBean("steelAxeFactoryBean",Axe.class);
		Axe axe4=context.getBean("steelAxeFactoryBean",Axe.class);
		System.out.println(axe3==axe4);
	}

}
