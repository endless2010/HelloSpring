package com.mycompany.autowire;

public class SteelAxe implements Axe{
	
	@Override
	public void chop() {
		System.out.println("chop using Steel Axe");
	}
}
