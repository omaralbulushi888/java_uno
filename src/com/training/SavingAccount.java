package com.training;

public class SavingAccount extends Account{

	private float interestRate = 27;
	
	public float getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

	public SavingAccount(int accountNumber, String customerName, double balance, float interestRate) {
										super(accountNumber,customerName, balance);
										this.interestRate = interestRate;
	}
	//interest method
	public void addInterest() {
		double interest = (balance * interestRate)/100;
	System.out.println(interest+ ":interest added to the balance");	
	}
	
}
