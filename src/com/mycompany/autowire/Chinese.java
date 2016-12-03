package com.mycompany.autowire;


public class Chinese implements Person{
	private Axe axe;
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
//		System.out.println("Chinese use Axe");
		axe.chop();
	}
}
