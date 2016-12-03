package com.mycompany.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.stereotype.Component;

@Component("chinese")
public class Chinese implements Person{
	@Resource(name="stoneAxe")
	private Axe axe;
	
	@PostConstruct
	public void init(){
		System.out.println("call chinese:init()");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("call chinese:destroy()");
	}
	
	public Chinese(Axe axe){
		this.axe=axe;
	}
	public Chinese(){
	}
	public void setAxe(Axe axe){
		this.axe=axe;
	}
	@Override
	public void useAxe() {
		System.out.println("Chinese use Axe");
		axe.chop();
	}
}
