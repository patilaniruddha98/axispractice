package com.vit.ude;

public class CheckingAccount {
	
	private double balance;
	   private int number;
	   
	   public CheckingAccount(int number) {
	      this.number = number;
	   }
	   
	   public void deposit(double amount) {
		   
	// balance = balance+amount;
	      balance += amount;
	     
	   }
	   
	   public void withdraw(double amount) throws InsufficientFundsException {
	      if(amount <= balance) {
	    	  //balance = balance-amount
	         balance -= amount;
	      }else {
	         double needs = amount - balance;
	         throw new InsufficientFundsException(needs);
	      }
	   }
	   
	   public double getBalance() {
	      return balance;
	   }
	   
	   public int getNumber() {
	      return number;
	   }
}
