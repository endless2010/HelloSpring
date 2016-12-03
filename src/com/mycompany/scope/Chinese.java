package com.mycompany.scope;

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
		axe.chop();
	}
}
