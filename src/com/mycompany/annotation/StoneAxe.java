package com.mycompany.annotation;

import org.springframework.stereotype.Component;

@Component
public class StoneAxe implements Axe{
	public StoneAxe(){
		System.out.println("StoneAxe Construtor");
	}
	@Override
	public void chop() {
		System.out.println("chop using Stone Axe");
	}

}
