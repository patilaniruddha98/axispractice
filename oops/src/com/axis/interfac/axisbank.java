package com.axis.interfac;

public class axisbank implements bank {
	public void bankname() {
		System.out.println(" Axis bank ");
		
	}

	public void accDetails() {
		System.out.println(" Account Details ");
		
	}

	public void loanDetails() {
		System.out.println("Loan Details");
		
	}

	public void transections() {
		System.out.println(" Transections ");
		
	}
	
	public static void main(String[] args) {
		axisbank a=new axisbank();
		a.bankname();
		a.accDetails();
		a.loanDetails();
		a.transections();

	}

}
