package com.training;

public class Account {

//variables
	
	//generate consturctor
	// get setter and getters
		protected int  accountNumber;         
		public int getAccountNumber() {
			return accountNumber;
		}


		public void setAccountNumber(int accountNumber) {
			this.accountNumber = accountNumber;
		}


		public String getCustomerName() {
			return customerName;
		}


		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}


		public double getBalance() {
			return balance;
		}


		public void setBalance(double balance) {
			this.balance = balance;
		}


		protected String customerName;
		protected double balance;
		
		
// constructor 		
		public Account(int accountNumber, String customerName, double balance) {
			this.accountNumber = accountNumber;
			this.customerName = customerName;
			this.balance = balance;
		}
		
		public double displayBalance() {
			 return balance;
		 
		}
		public Account() {
			
		}
		
		// deposit
		public void deposit(double amount) {
			
			balance += amount;  // balance = balance+amount
			System.out.println(amount+" got deposited successfully in your account");
			
		}
		
		// withdraw
		public void withdraw(double amount) {
//incase user inputs a invalid value
			if(amount < balance) {
				balance -= amount;  // balance = balance-amount
				System.out.println(amount+" got withdrawn successfully in your account");

			}
			else
			System.out.println(amount+" insufficient balance");
			 
		 }
		
		
		}




