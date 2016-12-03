package com.mycompany.annotation.configuration;

public class SteelAxe implements Axe{
	
	@Override
	public void chop() {
		System.out.println("chop using Steel Axe");
	}

}
