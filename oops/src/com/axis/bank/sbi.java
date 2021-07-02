package com.axis.bank;

public class sbi extends bank {
	
	public void bankName() {
		System.out.println(" SBI Bank");
		
	}

	
	public void accIntrest() {
		System.out.println(" account intrest ");
		
	}


	public void loanIntrest() {
		System.out.println(" loan intrest ");
		
	}

	public static void main(String[] args) {
		bank b= new sbi();
		b.bankName();
		b.accIntrest();
		b.loanIntrest();

	}



	
}
