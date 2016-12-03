package com.mycompany.aopxml;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.springframework.stereotype.Component;

@Component("logAspect")
public class LogAspect {
	
	public void logBefore(JoinPoint jp){
		System.out.println("++++++ LogAspect logBefore() ++++++");
		System.out.println("args:"+jp.getSignature()+",values:"+Arrays.toString(jp.getArgs()));
	}
	
	public void logAfterReturning(List<Integer> returnValue){
		System.out.println("------ LogAspect logAfterReturning() ------");
		System.out.println("return value :"+returnValue);
	}
	
	public void logAfter(){
		System.out.println("******* LogAspect logAfter() *******");
	}
	
	public void logAfterThrowing(Throwable ex){
		System.out.println("######## LogAspect logAfterThrowing() ########");
		System.out.println("exception is:"+ex.getMessage());
	}
}
