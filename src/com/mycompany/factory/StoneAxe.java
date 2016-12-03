package com.mycompany.factory;

public class StoneAxe implements Axe{
	public StoneAxe(){
		System.out.println("StoneAxe construtor");
	}
	@Override
	public void chop() {
		System.out.println("chop using Stone Axe");
	}

}
