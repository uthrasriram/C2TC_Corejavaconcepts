package com.tnsif.ifet.dayeight.interfaces.implementinginterfaces;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			     // Create a Bank instance
			     Bank bank = new BankImpl();

			     // Create an Account
			     Account account = new Account(123456, "Mihir", 155000, bank);

			     // Deposit money
			     account.deposit(2000);
			     // Print the account details
			     System.out.println(account);
			     
			     //withdraw money
			     account.withdraw(10000);
			     // Print the account details
			     System.out.println(account);
			 }
			}

	


