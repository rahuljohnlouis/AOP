package com.caveofprogramming.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

	@Pointcut("execution(* com.caveofprogramming.spring.aop.Camera.snap())")
	public void cameraSnap()
	{
		
	}

	@Before(value = "cameraSnap()")
	public void beforeAdvice() {
		System.out.println("Before Advice.....");
	}
	
	@After(value = "cameraSnap()")
	public void afterAdvice() {
		System.out.println("After Advice.....");
	}
	
	@AfterReturning(value = "cameraSnap()")
	public void afterReturningAdvice() {
		System.out.println("After Returning Advice.....");
	}
	
	@AfterThrowing(value = "cameraSnap()")
	public void afterThrowingAdvice() {
		System.out.println("After throwin Advice.....");
	}
	
	@Around(value = "cameraSnap()")
	public void aroundAdvice(ProceedingJoinPoint p) {
		System.out.println("BEFORE");
		
		try {
			p.proceed();
		} catch (Throwable e) {
			System.out.println("INSIDE "+e.getMessage());
		}
		
		System.out.println("AFTER");
	}
}