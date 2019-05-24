package com.training.service;

import com.training.bl.CAAccount;
import com.training.bl.SBAccount;

public class BankingService {
	private SBAccount sbAccount; 
	private CAAccount caAccount;
	
	public SBAccount getSbAccount() {
		System.out.println("hey i'm getSbAccount() ");
		return sbAccount;
	}
	public void setSbAccount(SBAccount sbAccount) {
		this.sbAccount = sbAccount;
	}
	public CAAccount getCaAccount() {
		return caAccount;
	}
	public void setCaAccount(CAAccount caAccount) {
		this.caAccount = caAccount;
	}
	@Override
	public String toString() {
		return "BankingService [sbAccount=" + sbAccount + ", caAccount=" + caAccount + "]";
	} 
	
	
}
