package com.training.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LogggingAspectAfter {

	/*@After("execution(* get*())")
	public void afterGetter() {
		System.out.println("After All Getters Invoked..");
	}*/
	
//	@AfterReturning(value="execution(* get*())", returning="retVal")
	@AfterReturning(value="execution(* showBalance())", returning="retVar")
	public void afterSucessfulExecution(Object retVar) {
		System.out.println("******* After Successful execution " 
				 + retVar);
	}
	
	@AfterThrowing("execution(* showBalance())")
	public void afterThrowingException() {
		System.out.println("Hey i'm there for Exception... ");
	}
	
	
	
}
