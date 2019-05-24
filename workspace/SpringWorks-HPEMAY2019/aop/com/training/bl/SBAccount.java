package com.training.bl;

import com.training.model.Account;

public class SBAccount {
	private Account account;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "SBAccount [account=" + account + "]";
	} 
	
	
}
