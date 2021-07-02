package com.vit.throww;

public class ThrowExample {
	
	static void checkEligibilty(int age){ 
		
	      if(age<18) {
	    	  
	         throw new ArithmeticException("person is not eligible for voting"); 
	      }
	      else {
	         System.out.println("persong  is eligible for voting!!"); 
	      }
	   } 

	   public static void main(String args[]){ 
		   
	     System.out.println("Welcome to the Registration process!!");
	     checkEligibilty(16); 
	     System.out.println("Have a nice day.."); 
	 } 
}
