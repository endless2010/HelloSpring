package com.mycompany.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Chinese implements Person{
	@Autowired
	private Axe axe;
	
	@Autowired
	@Qualifier("backupaxe")
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
