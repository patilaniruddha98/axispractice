package com.vit.throww;

public class ThrowExample2 {
	
	
	public void m1() throws ArithmeticException {
		int a=10;
		int b=0;

		int c=a/b;
		System.out.println("Output : "+ c);
		
		
		
	}


	public static void main(String[] args) {
		
		ThrowExample2 x=new ThrowExample2();
		
		try {
		x.m1();
		}catch(Exception e) {
			
			throw new ArithmeticException("Never divide by zero");
			
		}
		
	}

	
}
