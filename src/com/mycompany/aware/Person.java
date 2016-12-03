package com.mycompany.aware;

import org.springframework.beans.factory.BeanNameAware;

public class Person implements BeanNameAware{
	private String name;
	private int age;
	private String beanName;
	@Override
	public void setBeanName(String name) {
		this.beanName=name;
	}
	
	public String toString(){
		return "beanid:"+beanName+",name="+name+",age="+age;
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
