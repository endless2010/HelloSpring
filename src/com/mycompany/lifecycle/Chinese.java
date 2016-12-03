package com.mycompany.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Chinese implements Person,InitializingBean,DisposableBean{
	private Axe axe;
	public Chinese(Axe axe){
		this.axe=axe;
	}
	public Chinese(){
	}
	
	public void init(){
		System.out.println("calling Chineses:init()");
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("calling Chineses:afterPropertiesSet()");
	}
	
	public void close(){
		System.out.println("calling Chineses:close()");
	}	
	@Override
	public void destroy() throws Exception {
		System.out.println("calling Chineses:destroy()");
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
