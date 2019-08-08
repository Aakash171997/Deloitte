package com.oracle.springtraining.coupling1.factorysolution;

public class AccountFactory {

	public Account manufactureAccount(String accountType){
			Account account = null;
			if(accountType.equals("S"))
				account = new SavingsAccount("S123");
			else if(accountType.equals("C"))
				account = new CurrentAccount("C123");
			else if(accountType.equals("L"))
				account = new LoanAccount("L123");
			return account;
	}
}
