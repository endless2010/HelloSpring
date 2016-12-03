package com.mycompany.factory;

public class Chinese implements Person{
	private Axe axe;
	public Chinese(Axe axe){
		this.axe=axe;
	}
	public Chinese(){
		System.out.println("Chinese construtor");
	}
	public void setAxe(Axe axe){
		this.axe=axe;
	}
	@Override
	public void useAxe() {
		System.out.println("Chinese use Axe");
		axe.chop();
	}
}
