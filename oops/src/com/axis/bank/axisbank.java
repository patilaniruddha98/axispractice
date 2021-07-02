package com.axis.bank;

public class axisbank extends bank {
	
	public void bankName() {
		System.out.println(" Axis bank ");
		
	}
	
	public void accIntrest() {
		System.out.println(" account intrest ");
		
	}


	public void loanIntrest() {
		System.out.println(" loan intrest ");
		
	}
	
	public static void main(String args[]){
		bank b= new axisbank();
		b.bankName();
		b.accIntrest();
		b.loanIntrest();
	}


	

}
