package com.vit.ude;

public class InsufficientFundsException extends Exception {
	   private double amount;
	   
	   public InsufficientFundsException(double amount) {
	      this.amount = amount;
	   }
	   
	   public double getAmount() {
	      return amount;
	   }
	   
	   /*public String toString(){
	        return "Amount required is : " +amount;
	    }*/
	}