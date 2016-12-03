package com.mycompany.event;

import org.springframework.context.ApplicationEvent;

public class EmailEvent extends ApplicationEvent{
	private static final long serialVersionUID = 1276896126792186959L;
	
	private String address;
	private String message;

	public EmailEvent(Object source,String address,String message){
		super(source);
		this.address=address;
		this.message=message;
	}
	public EmailEvent(Object source) {
		super(source);
	}
	@Override
	public String toString(){
		return "source="+source+",address="+address+",message="+message;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
