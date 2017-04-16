package com.practice.exceptions;

public class BankDemo {

	
	private static void handleException() throws InsufficientFundsException {
		CheckingAccount c = new CheckingAccount(101);
	      System.out.println("Depositing $500...");
	      c.deposit(500.00);
	      
//	      try {
	         System.out.println("\nWithdrawing $100...");
	         c.withdraw(100.00);
	         System.out.println("\nWithdrawing $600...");
	         c.withdraw(600.00);
//	      }catch(InsufficientFundsException e) {
//	         System.out.println("Sorry, but you are short $" + e.getAmount());
//	         e.printStackTrace();
//	      }
	}
	  
	
	
	public static void main(String [] args) {
	    try{
	    	handleException();
	    }catch(InsufficientFundsException e){
	    	System.out.println("Sorry, but you are short $" + e.getAmount());
	         System.out.println(e.getMessage());
	    }
	      
	      
	   }

	}