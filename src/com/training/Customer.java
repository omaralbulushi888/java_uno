package com.training;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer name:");
		String customerNameScan = sc.nextLine();
		// next()  -> will take single string without space
		// nextInt() -> to input integer values
		System.out.println("Enter customer age :");
		int customerintNumber = sc.nextInt();
		String customerName = "Q";
		int CustomerNumber = 123;
		byte b = 112;
		short s = 115;
		 b =(byte) s;
		 
		 String customerFirst = "buh";
		 String customerSecond = "al bulushi";
		 int customerAge = 67;
		 
		 if (customerintNumber> 18) {
		 System.out.println("eligible to open an account.");}
		 else {System.out.println("not yet eligible to open account");}
			 
		System.out.println("Customer class");
		System.out.println("Customer name: "+customerName);
		System.out.println("Customer number: "+CustomerNumber);
		System.out.println("Customer details: "+customerFirst+ ", "+customerSecond+ ", "+ customerAge );
		
		System.out.println("enter customer name: "+customerNameScan);
		System.out.println("Customer entered number: "+customerintNumber);
	}

}

// library import shortcut: ctrl + shift + o
// java is a strongly typed language
// variable is a placeholder pointing to a memory location


// create variables that will store customer first name. customer last name, customer age.
// and display all the customer details in a single line.

//  take the customer details from user using scanner class, check if the customer is more than 18 then displayeligable to open an acount. else display: not yet eligible to open an account.
