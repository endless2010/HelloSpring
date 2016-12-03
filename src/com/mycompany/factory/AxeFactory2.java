package com.mycompany.factory;

public class AxeFactory2 {
	public Axe getAxe(String type){
		System.out.println("AxeFactory2 getAxe,type="+type);
		if(type.equalsIgnoreCase("stone"))
			return new StoneAxe();
		else if(type.equalsIgnoreCase("steel"))
			return new SteelAxe();
		return null;
	}
}
