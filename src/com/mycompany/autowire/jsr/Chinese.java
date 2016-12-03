package com.mycompany.autowire.jsr;

import javax.inject.Inject;
import javax.inject.Named;



public class Chinese implements Person{
	@Inject
	private Axe axe;
	
	@Inject
	@Named("backupaxe")
	private Axe backup_axe;
	
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
		if(backup_axe!=null)
			backup_axe.chop();
	}
}
