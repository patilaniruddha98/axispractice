package com.vit.uce;


//We can avoid NullPointerException by calling equals on literal rather than object.

public class CorrectNullPointer {

	public static void main(String[] args) {
		{
			// Initialing String variable with null value

			String s = null;

			//String s="java1";

			// Checking if ptr is null using try catch.

			try
			{

				if ("java".equals(s))
					System.out.print("Same");
				else
					System.out.print("Not Same");            
			}
			catch(NullPointerException e)
			{
				System.out.print("Caught NullPointerException");
			}
		}
	}

}
