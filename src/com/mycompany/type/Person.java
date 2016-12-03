package com.mycompany.type;

public class Person {
	private String name="default name";
	private int age =20;
	
	public String toString(){
		return "[name="+name+",age="+age+"]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
