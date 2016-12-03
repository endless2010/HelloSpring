package com.mycompany.annotation;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy(true)
@Component
public class SteelAxe implements Axe{
	public SteelAxe(){
		System.out.println("SteelAxe Construtor");
	}
	@Override
	public void chop() {
		System.out.println("chop using Steel Axe");
	}

}
