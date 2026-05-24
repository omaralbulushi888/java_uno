package com.training;

public class BankClient {

	public static void main(String[] args) {
		savingAccount savingaAccount = new savingAccount(1234, "anwar", 500,4);
		
		System.out.println("before deposit:"+savingaAccount.displayBalance());
		savingaAccount.deposit(300);
		System.out.println("after deposit:"+savingaAccount.displayBalance());
		savingaAccount.displayBalance();
		System.out.println("current deposit:"+savingaAccount.displayBalance());
		savingaAccount.withdraw(570);
		System.out.println("after withdraw:"+savingaAccount.displayBalance());
		savingaAccount.addInterest();
		System.out.println("after interest:"+savingaAccount.displayBalance());

		
		//dynamic polymorphism? (happens when you override a method)
//		savingAccount savingaccount = new savingAccount(1234, "buh", 100,6);
//		CurrentAccount.deposit(500);
//		CurrentAccount.withdraw(1050);
//		System.out.println("after withdraw"+currentAccount.displayBalance());
//	}
	//overloading -- static polymorphism (only possible when -> object refers to parent type)
//	public void addinterest(doublen addinter )
	
	}	
	
}
