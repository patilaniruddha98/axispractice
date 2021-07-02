package com.vit.ude;

public class BankDemo {
	
	public static void main(String[] args){
		
		
		
	CheckingAccount c = new CheckingAccount(101);
	
	System.out.println("Depositing Rs 1000");
    
    c.deposit(1000);
    
    try {
       System.out.println("\nWithdrawing 600...");
       c.withdraw(600.00);
       
       System.out.println("\nWithdrawing 800...");
       c.withdraw(800.00);
       
    } catch (InsufficientFundsException e) {
       System.out.println("Insufficient Funds : you need Rs :  " + e.getAmount());
       //e.printStackTrace();
    }
}
}