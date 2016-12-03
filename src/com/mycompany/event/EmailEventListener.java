package com.mycompany.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class EmailEventListener implements ApplicationListener<ApplicationEvent>{

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if(event instanceof EmailEvent){
			System.out.println("received emailEvent");
		}else{
			System.out.println("received spring event");
		}
		System.out.println("event:"+event);
	}
}
