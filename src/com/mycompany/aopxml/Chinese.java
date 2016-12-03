package com.mycompany.aopxml;

import java.util.Arrays;
import java.util.List;

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
		System.out.println("Chinese construtor(Axe axe)");
		this.axe=axe;
	}
	public Chinese(){
		System.out.println("Chinese construtor()");
	}
	public void setAxe(Axe axe){
		System.out.println("Chinese setAxe()");
		this.axe=axe;
	}
	@Override
	public void useAxe() {
		System.out.println("begin Chinese useAxe");
		axe.chop();
		System.out.println("after Chinese useAxe");
	}
	@Override
	public List<Integer> testAfterReturing() {
		return Arrays.asList(1,2,3,4,5);
	}
	
	@Override
	public void testArgs(int a,String b,byte[] bytes,List<Integer> list) {
	}
	
	@Override
	public void  testAfterThrowing() {
		System.out.println("begin Chinese testThrow");
		int a=1/0;
		System.out.println("after Chinese testThrow");
	}
}
