package com.vit.uce;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {
	
		int i=10;
		int j=0;
		
		try {
			
		int Z=i/j;
		
		System.out.println(Z);
		
		}catch(ArithmeticException e) {
			
			
			//e.printStackTrace();
			
			System.out.println("never divide a number by Zero");
		}
		
catch(Exception e) {
			
			//e.printStackTrace();
			
			System.out.println("never divide a number by Zero");
		}
	
		
		
		
	}

}
