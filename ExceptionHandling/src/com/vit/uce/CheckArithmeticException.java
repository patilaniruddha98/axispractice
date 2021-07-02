package com.vit.uce;

public class CheckArithmeticException {

	public static void main(String[] args) throws ArithmeticException{
		
		int num1=10;
		
		int num2=5;

		try {
			int res=num1/num2;

			System.out.println(res);

		}
		catch(ArithmeticException e) {

			System.out.println("Never divide by zero");

		}

		catch(Exception e) {

			System.out.println("Never divide by zero");

		}finally {

			System.out.println("close connection");

		}
	}
}






