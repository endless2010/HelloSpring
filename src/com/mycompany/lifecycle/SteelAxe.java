package com.mycompany.lifecycle;

public class SteelAxe implements Axe{
	public void default_init_method(){
		System.out.println("calling SteelAxe:default_init_method()");
	}
	public void default_destroy_method(){
		System.out.println("calling SteelAxe:default_destroy_method()");
	}
	@Override
	public void chop() {
		System.out.println("chop using Steel Axe");
	}

}
