package com.mycompany.factory;

public class AxeFactory1 {
	public static Axe getAxe(String type){
		System.out.println("AxeFactory1 getAxe,type="+type);
		if(type.equalsIgnoreCase("stone"))
			return new StoneAxe();
		else if(type.equalsIgnoreCase("steel"))
			return new SteelAxe();
		return null;
	}
}
