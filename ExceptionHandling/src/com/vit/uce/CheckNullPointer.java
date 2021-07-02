package com.vit.uce;

/*A very common case problem involves the comparison 
between a String variable and a literal. 
The literal may be a String or an element of an Enum. 
Instead of invoking the method from the null object, 
consider invoking it from the literal.*/

public class CheckNullPointer {

	public static void main(String[] args) {
		{
			// Initializing String variable with null value

			String name = null;

			//String name = "ravi";

			// Checking if ptr.equals null or works fine.

			try
			{

				// Rule 1: never call any methods on null

				if ("jhon".equals(name))

					System.out.print("Same");
				else
					System.out.print("Not Same");
			}
			catch(NullPointerException e)
			{
				System.out.print("NullPointerException Caught");
			}
		}

	}
}
