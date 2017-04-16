package com.practice.exceptions;

import java.io.*;

public class InsufficientFundsException extends Exception {
   private double amount;
   
   public InsufficientFundsException(double amount) {
      this.amount = amount;
   }
   
   public double getAmount() {
      return amount;
   }
   
   @Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Amount is lesstahnsjksdjfksdjklfsjla";
	}
}