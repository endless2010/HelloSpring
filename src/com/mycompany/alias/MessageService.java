package com.mycompany.alias;

public class MessageService {
	private Message message1;
	private Message message2;
	private Message message3;
	private Message message4;
	
	public void displayMessage(){
		System.out.println(message1.getMessage());
		System.out.println(message2.getMessage());
		System.out.println(message3.getMessage());
		System.out.println(message4.getMessage());
	}

	public Message getMessage1() {
		return message1;
	}

	public void setMessage1(Message message1) {
		this.message1 = message1;
	}

	public Message getMessage2() {
		return message2;
	}

	public void setMessage2(Message message2) {
		this.message2 = message2;
	}

	public Message getMessage3() {
		return message3;
	}

	public void setMessage3(Message message3) {
		this.message3 = message3;
	}

	public Message getMessage4() {
		return message4;
	}

	public void setMessage4(Message message4) {
		this.message4 = message4;
	}

}
