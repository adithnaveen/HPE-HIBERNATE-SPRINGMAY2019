package com.training.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
	// this method will be invoked for all the methods (SBAccount 
	// or CAAccount) 
//	@Before("execution(public double getBalance())")

	
	// logging only sb acccount 
//	@Before("execution(public double com.training.bl.CAAccount.showBalance())")
	
	
	// the aspect is called for all the methods which return any type 
	// prefixed by get and does not take any parameters 
//	@Before("execution(public * get*())")
	
	// who takes min 1 param 
//	@Before("execution(public * get*(*))")
	
	
	// either the method takes an argument or not 
//	@Before("execution(public * get*(..))")

	
	// in any class model for getBalance method 
//	@Before("execution(* com.training.model.*.getBalance())")
	
	
	@Before("forAllGetBalance() && forAllGetters()")
	public void simpleLog() {
		System.out.println("This is a log crated... ");
	}

	@Before("forAllGetters()")
	public void anotherLog() {
		System.out.println("This is a Another log crated... ");
	}

	// method only acts as a placeholder, thought you keep 
	// any business logic it will not execute 
	@Pointcut("execution(* get*())")
	public void forAllGetters() {
		// this statment will not work 
		System.out.println("This is for testing ************* ");
	}
	
	@Pointcut("execution(* com.training.model.*.getBalance())")
	public void forAllGetBalance() {}
}











