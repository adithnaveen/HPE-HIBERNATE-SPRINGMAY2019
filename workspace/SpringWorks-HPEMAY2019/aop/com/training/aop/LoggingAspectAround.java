package com.training.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspectAround {

	
	@Around("execution(* showBalance())")
	public Object sampleMyAround(ProceedingJoinPoint proceedingJoinPoint) {
		// TODO Before the method is called
		Object retObj = null; 
		try {
			System.out.println("***** Hey i'm your aspect before calling ***** ");
			
			 retObj = proceedingJoinPoint.proceed(); 
			
			// TODO after the method is called 
			System.out.println("***** Hey i'm your aspect After calling ***** ");
			
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("---------After Try Block in Around ----------");
		return retObj; 
		
	}
}
