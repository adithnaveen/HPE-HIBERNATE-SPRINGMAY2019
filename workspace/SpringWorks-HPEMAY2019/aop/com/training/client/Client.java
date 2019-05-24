package com.training.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.service.BankingService;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = 
			new ClassPathXmlApplicationContext("apoContext.xml"); 
		
		BankingService service = context.getBean("banking", BankingService.class); 
		
		System.out.println("SB Account Balance is : " + 
					service.getSbAccount().getAccount().getBalance());
		
		System.out.println("CA Account Balance is :" + 
					service.getCaAccount().getAccount().getBalance(1));
		
		System.out.println("Showing Balance " +
				service.getCaAccount().showBalance());	
		
		
		
		
	}
}
