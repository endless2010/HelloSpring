package com.mycompany.annotation.configuration;

public class Chinese implements Person{
	private Axe axe;
	private int age;
	public Chinese(Axe axe){
		this.axe=axe;
	}
	public Chinese(){
	}
	public void setAxe(Axe axe){
		this.axe=axe;
	}
	@Override
	public void useAxe() {
		System.out.println("Chinese use Axe");
		axe.chop();
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
