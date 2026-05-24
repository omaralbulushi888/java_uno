package com.training;


import java.util.Scanner;



public class BankClient {
	public static void main(String[] args) {
//		SavingAccount savingAccount = new SavingAccount(1234, 
//				                     "Anwar", 500, 4);
//		System.out.println("Before deposit:"+savingAccount.displayBalance());
//		savingAccount.deposit(300);
//		System.out.println("After deposit:"+savingAccount.displayBalance());
//		savingAccount.withdraw(100);
//		System.out.println("After withdraw:"+savingAccount.displayBalance());
//		savingAccount.addInterest();
//		System.out.println("After adding interest:"+savingAccount.displayBalance());
//		
//		//dynamic polymorphism
//		Account currentAccount = new CurrentAccount(
//									2781,"Hassan",400,100);
//		currentAccount.deposit(500);
//		currentAccount.withdraw(1050);
//		System.out.println("After withdraw:"+currentAccount.displayBalance());

		
		
		
//		int b=3;
//		SavingAccount savingAccount = new SavingAccount(accountNumber,customerName, 500, 4);
//		for(int i=1;i<b;i++) {
//			System.out.println("Enter user first savings account"+(i+1));
//			String userId=sc.nextLine();
//			System.out.println("Enter user second savings account"+(i+1));
//			String userName=sc.nextLine();
//			System.out.println("Enter user third savings account "+(i+1));
//			String userEmail=sc.nextLine();
//			user[i] = new User(userId, userName, userEmail);
//	}
		
		
		
		
		 Scanner sc = new Scanner(System.in);
		
		 while(true) { 
			 System.out.println("Enter X to exit or any other key to continue");
			 String choice = sc.nextLine();
			 if(choice.equalsIgnoreCase("X")) {
				 break;
			 }
			 try {
				
				System.out.println("create a savings account ");
				int c=3;
				SavingAccount[] user = new SavingAccount[c];
				for(int i=0;i<c;i++) {
					System.out.println("enter user id for user"+(i+1));
					int accountNumber=Integer.parseInt(sc.nextLine());
					System.out.println("enter user name for user"+(i+1));
					String customerName=sc.nextLine();
					System.out.println("enter user balance for user"+(i+1));
					double balance=Double.parseDouble(sc.nextLine());
					user[i] = new SavingAccount(accountNumber,customerName, 
				              balance, 4.5f);
				}
				
				
				System.out.println("create a current account");
				int r=3;
				CurrentAccount[] userCurrent = new CurrentAccount[r];
				for(int f=0; f<r;f++) {
					System.out.println("enter user id for user"+(f+1));
					int accountNumber=Integer.parseInt(sc.nextLine());
					System.out.println("enter user name for user"+(f+1));
					String customerName=sc.nextLine();
					System.out.println("enter user balance for user"+(f+1));
					double balance=Double.parseDouble(sc.nextLine());
					userCurrent[f] = new CurrentAccount(accountNumber,customerName, 
				              balance, 200);
					
				}
			 }
				catch(Exception e){
				System.out.println("try again");	
				}
			
			
				
			 }
			// System.out.println("total number of customers saved: "+i);
		
		
			//comment

		
	}}

//Method overloading:
// Same method name but different parameter list
