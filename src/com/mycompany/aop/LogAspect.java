package com.mycompany.aop;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogAspect {
	
	@Before("execution(* com.mycompany.aop.*.useAxe(..))")
	public void logBefore(JoinPoint jp){
		System.out.println("++++++ LogAspect logBefore() ++++++");
		System.out.println("args:"+jp.getSignature()+",values:"+Arrays.toString(jp.getArgs()));
	}
	
	@AfterReturning(returning="returnValue",pointcut="execution(* com.mycompany.aop.*.*(..))")
	public void logAfterReturning(List<Integer> returnValue){
		System.out.println("------ LogAspect logAfterReturning() ------");
		System.out.println("return value :"+returnValue);
	}
	
	@After("execution(* com.mycompany.aop.*.*AfterThrowing(..))")
	public void logAfter(){
		System.out.println("******* LogAspect logAfter() *******");
	}
	
	@AfterThrowing(throwing="ex",pointcut="execution(* com.mycompany.aop.*.testAfterThrowing(..))")
	public void logAfterThrowing(Throwable ex){
		System.out.println("######## LogAspect logAfterThrowing() ########");
		System.out.println("exception is:"+ex.getMessage());
	}
}
