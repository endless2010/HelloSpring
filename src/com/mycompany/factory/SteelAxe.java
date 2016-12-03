package com.mycompany.factory;

public class SteelAxe implements Axe{
	public SteelAxe(){
		System.out.println("SteelAxe construtor");
	}
	@Override
	public void chop() {
		System.out.println("chop using Steel Axe");
	}

}
