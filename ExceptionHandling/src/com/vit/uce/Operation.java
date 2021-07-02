package com.vit.uce;

public class Operation {
	
	public void div(int a, int b) {
		
		
		try {
			
			//open connection
		int c = a/b;
		
		System.out.println("Result after division :"+c);
		
		
		}
		
		
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("As per rule you should not divide by zero");
			
			
		}
		
		
		finally {
			//close connection
			System.out.println("i am done");
		}
		
		
		System.out.println("Actual logic is executed");
		
		
		
		
	}

}
