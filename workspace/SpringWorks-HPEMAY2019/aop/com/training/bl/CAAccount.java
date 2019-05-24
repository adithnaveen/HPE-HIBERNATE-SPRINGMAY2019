package com.training.bl;

import javax.management.RuntimeErrorException;

import com.training.model.Account;

public class CAAccount {
	private Account account;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "CAAccount [account=" + account + "]";
	} 
	
	public double showBalance() {
		
		System.out.println("$$$$$ Hey We are in Show Balance $$$$$");
		int x = 2; 
		
		if(x==1) {
			throw new RuntimeException("This is custom message");
		}
		
		return this.account.getBalance(); 
	}
}
