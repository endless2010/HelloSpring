package com.mycompany.autowire.annotation;

public class StoneAxe implements Axe{
	
	@Override
	public void chop() {
		System.out.println("chop using Stone Axe");
	}
}
