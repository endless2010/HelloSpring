package com.mycompany.autowire.jsr;

public class SteelAxe implements Axe{
	
	@Override
	public void chop() {
		System.out.println("chop using Steel Axe");
	}
}
