package com.caveofprogramming.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logger {

//	@Pointcut("within(@org.springframework.stereotype.Component com.caveofprogramming.spring..*)")
//	public void somePointcut()
//	{
//		
//	}
//	
//	@Before("somePointcut()")
//	public void somePointcutDemo()
//	{
//		System.out.println("****BEFORE ADVICE*****");
//	}
	
	@Pointcut("@annotation(java.lang.Deprecated)")
	public void somePointcut()
	{
		
	}
	
	@Before("somePointcut()")
	public void somePointcutDemo()
	{
		System.out.println("****BEFORE ADVICE*****");
	}
	
}